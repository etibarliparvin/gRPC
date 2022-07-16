package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(1991)
                .addService(new PersonService())
                .build();

        server.start();
        server.awaitTermination();
    }
}