package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonResponse;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PersonService extends PersonServiceGrpc.PersonServiceImplBase {

    @Override
    public StreamObserver<PersonRequest> savePeople(StreamObserver<PersonResponse> responseObserver) {
        return new PersonStreamRequest(responseObserver);
    }
}
