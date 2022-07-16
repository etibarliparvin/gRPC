package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception{
        Server server = ServerBuilder.forPort(1991)
                .addService(new BankService())
                .addService(new TansferService())
                .build();

        server.start();
        server.awaitTermination();
    }
}
