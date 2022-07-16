package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws Exception {
//        PersonServiceGrpc.PersonServiceBlockingStub stub = getBlockingStub(1991);
//        PersonRequest request = PersonRequest.newBuilder()
//                .setId(3).build();
//        stub.getPeople(request).forEachRemaining(x -> System.out.println(x));

        System.out.println("-----------------------------------------------------");
        CountDownLatch latch = new CountDownLatch(1);
        PersonServiceGrpc.PersonServiceStub stub1 = getNonBlockingStub(1991);
        PersonRequest request1 = PersonRequest.newBuilder()
                .setId(3).build();
        stub1.getPeople(request1, new PersonStreamingResponse(latch));
        latch.await();
    }

    private static PersonServiceGrpc.PersonServiceBlockingStub getBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return PersonServiceGrpc.newBlockingStub(channel);
    }

    private static PersonServiceGrpc.PersonServiceStub getNonBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return PersonServiceGrpc.newStub(channel);
    }
}