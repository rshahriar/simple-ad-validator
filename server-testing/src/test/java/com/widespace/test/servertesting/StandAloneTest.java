package com.widespace.test.servertesting;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mortbay.setuid.SetUIDServer;

import javax.ws.rs.core.UriBuilder;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StandAloneTest {

    private static final Logger logger = Logger.getLogger(StandAloneTest.class);

    SetUIDServer server;
    private static final String DEFAULT_HTTP_PORT = "8080";

    @Test
    public void testAdServer() {
        // Configure client for testing server connection
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource webResource =
            client.resource(UriBuilder.fromUri("http://localhost:8080/validate")
                                .queryParam("uuid", "fbb77207-193c-47ac-9892-d7d673faa0b4")
                                .build());

        // Check Server Status Code
        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
        assertEquals(response.getStatus(), 200);

        // Check not null response body
        String output = response.getEntity(String.class);
        assertNotNull(output);

        // Check valid JSON response
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(output);
        } catch (JSONException jex) {
            logger.error("Invalid JSON Response: " + jex.getMessage());
        }
        assertNotNull(jsonObject);
    }

    @Before
    public void startServer() {
        logger.info("Setting up test environment");
        try {
            server = new SetUIDServer();
            int port = Integer.parseInt(DEFAULT_HTTP_PORT);
            SelectChannelConnector connector = new SelectChannelConnector();
            connector.setPort(port);
            server.addConnector(connector);

            ContextHandlerCollection contexts = new ContextHandlerCollection();
            addWar(contexts, "ad-validator-ws.war");

            server.setHandler(contexts);
            server.start();
            server.setStopAtShutdown(true);
        } catch (Exception ex) {

        }
    }

    private void addWar(ContextHandlerCollection contexts, String name) throws Exception {
        String workingDir = System.getProperty("user.dir");
        WebAppContext wac = new WebAppContext();
        wac.setServer(server);
        wac.setContextPath("/");
        wac.setWar(workingDir + "\\..\\ad-validator-ws\\target\\" + name);
        wac.setParentLoaderPriority(false);
        contexts.addHandler(wac);
    }

    @After
    public void stopServer() {
        logger.info("Tearing down test environment");
    }
}
