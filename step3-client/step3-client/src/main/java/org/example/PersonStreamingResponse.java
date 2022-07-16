package org.example;

import az.etibarli.grpc.PersonResponse;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class PersonStreamingResponse implements StreamObserver<PersonResponse> {

    private CountDownLatch latch;

    public PersonStreamingResponse(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(PersonResponse response) {
        System.out.println(response);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println(t.getMessage());
    }

    @Override
    public void onCompleted() {
        System.out.println("Server is done!");
    }
}
