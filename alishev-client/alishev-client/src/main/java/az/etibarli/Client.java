package az.etibarli;

import az.etibarli.grpc.GreetingServiceGrpc;
import az.etibarli.grpc.HelloRequest;
import az.etibarli.grpc.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991)
                .usePlaintext()
                .build();

        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder()
                .setName("Parvin")
                .build();

        HelloResponse response = stub.greeting(request);
        System.out.println(response);

        channel.shutdownNow();
    }
}
