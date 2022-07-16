package org.example;

import az.etibarli.grpc.PersonRequest;
import az.etibarli.grpc.PersonResponse;
import az.etibarli.grpc.PersonServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class PersonService extends PersonServiceGrpc.PersonServiceImplBase {

    @Override
    public void getPeople(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
        int id = request.getId();
        if (id < 1 || id > DB.people.size()) {
            Status status = Status.FAILED_PRECONDITION.withDescription("Id must be greater than 0 : " + id);
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        // all validation passed
        for (int i = 0; i < id; i++) {
            Person personById = DB.getPersonById(i);
            PersonResponse build = PersonResponse.newBuilder().setId(personById.getId())
                    .setName(personById.getName())
                    .build();
            responseObserver.onNext(build);
        }
        responseObserver.onCompleted();
    }
}
