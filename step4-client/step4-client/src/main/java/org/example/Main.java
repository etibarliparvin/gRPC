package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        PersonServiceGrpc.PersonServiceStub stub = getNonBlockingStub(1991);
        StreamObserver<PersonRequest> streamObserver = stub.savePeople(new PersonStreamObserver(latch));
        for (int i = 1; i < 10; i++) {
            PersonRequest request = PersonRequest.newBuilder()
                    .setId(i).setName("Parvin " + i).build();
            streamObserver.onNext(request);
        }
        streamObserver.onCompleted();
        latch.await();
    }

    private static PersonServiceGrpc.PersonServiceStub getNonBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return PersonServiceGrpc.newStub(channel);
    }
}