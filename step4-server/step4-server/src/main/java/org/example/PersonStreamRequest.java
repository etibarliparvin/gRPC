package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonResponse;
import io.grpc.stub.StreamObserver;

public class PersonStreamRequest implements StreamObserver<PersonRequest> {

    private StreamObserver<PersonResponse> responseStreamObserver;

    public PersonStreamRequest(StreamObserver<PersonResponse> responseStreamObserver) {
        this.responseStreamObserver = responseStreamObserver;
    }

    @Override
    public void onNext(PersonRequest request) {
        Person person = new Person(request.getId(), request.getName());
        DB.people.add(person);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println(t.getMessage());
    }

    @Override
    public void onCompleted() {
        PersonResponse result = PersonResponse.newBuilder().setCount(DB.people.size()).build();
        responseStreamObserver.onNext(result);
        responseStreamObserver.onCompleted();
    }
}
