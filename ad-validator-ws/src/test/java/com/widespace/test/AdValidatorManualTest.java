package com.widespace.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import javax.ws.rs.core.UriBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * This class tests Server response with checking validity of the JSON body.
 * This test must run when the Server is running.
 */
public class AdValidatorManualTest {

    private static Logger logger = Logger.getLogger(AdValidatorManualTest.class);

    @Test
    public void testManually() {
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
}
