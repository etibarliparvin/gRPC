package primes.client;

import com.promo.primes.PrimesServiceGrpc;
import com.proto.primes.PrimeRequest;
import com.proto.primes.PrimeResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class PrimesClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 1991)
                .usePlaintext()
                .build();

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        PrimesServiceGrpc.PrimesServiceBlockingStub stub = PrimesServiceGrpc.newBlockingStub(channel);
//        PrimeResponse response = stub.calculate(PrimeRequest.newBuilder().setNumber(number).build());

        stub.calculate(PrimeRequest.newBuilder().setNumber(number).build()).forEachRemaining(respose -> {
            System.out.println(respose.getResult());
        });
    }
}
