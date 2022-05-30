package client;

import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class SumClient {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 1991)
                .usePlaintext()
                .build();

        System.out.println("Please enter the first number: ");
        int a = in.nextInt();
        System.out.println("Please enter the second number: ");
        int b = in.nextInt();

        SumServiceGrpc.SumServiceBlockingStub stub = SumServiceGrpc.newBlockingStub(channel);
        SumResponse response = stub.sum(SumRequest.newBuilder()
                .setNumber1(a).setNumber2(b).build());

        System.out.println("Result is : " + response.getResult());

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
