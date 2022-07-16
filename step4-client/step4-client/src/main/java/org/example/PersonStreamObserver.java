package org.example;

import az.etibarli.grpc.PersonResponse;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class PersonStreamObserver implements StreamObserver<PersonResponse> {

    private CountDownLatch latch;
    public static int result;

    public PersonStreamObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(PersonResponse response) {
        result = response.getCount();
        System.out.println("Responses : " + response.getCount());
    }

    @Override
    public void onError(Throwable t) {
        this.latch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("Server is done!");
        this.latch.countDown();
    }
}
