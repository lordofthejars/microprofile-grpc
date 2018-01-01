package com.lordofthejars.helloworld.microprofile;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

public class HelloWorldClientFactory {

    @Inject
    @ConfigProperty(name = "helloworld.grpc.host")
    String helloWorldGrpcHost;

    @Inject
    @ConfigProperty(name = "helloworld.grpc.port")
    int helloWorldGrpcPort;

    @Produces
    public HelloWorldClient createHelloWorldClient() {
        return new HelloWorldClient(helloWorldGrpcHost, helloWorldGrpcPort);
    }

}
