package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonResponse;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PersonService extends PersonServiceGrpc.PersonServiceImplBase {


    @Override
    public void savePerson(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
        Person person = new Person(request.getName());
        Person saved = DB.addPerson(person);
        PersonResponse build = PersonResponse.newBuilder()
                .setId(saved.getId())
                .setName(saved.getName())
                .build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
