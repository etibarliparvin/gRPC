package calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.MaxRequest;
import com.proto.calculator.MaxResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1991)
                .usePlaintext()
                .build();

        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<MaxRequest> stream = stub.max(new StreamObserver<MaxResponse>() {
            @Override
            public void onNext(MaxResponse value) {
                System.out.println("Max = " + value.getMax());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        Arrays.asList(1, 5, 3, 6, 2, 20).forEach(number ->
                stream.onNext(MaxRequest.newBuilder().setNumber(number).build()));
        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);
    }
}
