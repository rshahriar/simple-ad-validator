/*
package com.widespace.test;

import com.google.inject.servlet.GuiceFilter;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.TestContainerException;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import com.sun.jersey.test.framework.spi.container.http.HTTPContainerFactory;
import com.widespace.test.listners.GuiceServletListener;

import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static junit.framework.Assert.assertEquals;

public class AdValidatorServiceTest extends JerseyTest {
    private WebResource ws;

    public AdValidatorServiceTest() throws TestContainerException {
        super(new WebAppDescriptor.Builder("com.widespace.test.restservices")
                  .contextListenerClass(GuiceServletListener.class)
                  .filterClass(GuiceFilter.class)
                  .contextPath("/ad-validator-ws")
                  .servletPath("validate")
                  .build());
    }

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new HTTPContainerFactory();
    }

    @Test
    public void testAdValidator() {
//        ws = resource().path("validate").queryParam("uuid", "fbb77207-193c-47ac-9892-d7d673faa0b4");
//        ClientResponse response = ws.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//        assertEquals(200, response.getStatus());
//        System.out.println(response.getStatus());
    }
}
*/
