package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonResponse;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args) {
        PersonRequest request = PersonRequest.newBuilder()
                .setName("Test")
                .build();

        PersonResponse personResponse = getBlockingStub(1991).savePerson(request);
        System.out.println(personResponse);
    }

    private static PersonServiceGrpc.PersonServiceBlockingStub getBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return PersonServiceGrpc.newBlockingStub(channel);
    }
}