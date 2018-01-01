package com.lordofthejars.helloworld.microprofile;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloWorldResource {

    @Inject
    HelloWorldClient helloWorldClient;

    @GET
    @Produces("text/plain")
    public String get() {
        return "Hello World " + helloWorldClient.toString();
    }
}
