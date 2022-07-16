package az.etibarli;

import az.etibarli.grpc.GreetingServiceGrpc;
import az.etibarli.grpc.HelloRequest;
import az.etibarli.grpc.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println(request);

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting("Hello from server " + request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
