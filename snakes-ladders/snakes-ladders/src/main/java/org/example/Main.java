package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.server.GameService;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(1991)
                .addService(new GameService())
                .build();

        server.start();
        server.awaitTermination();
    }
}