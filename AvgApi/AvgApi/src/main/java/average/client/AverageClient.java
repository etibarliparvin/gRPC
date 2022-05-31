package average.client;

import com.proto.greeting.AverageRequest;
import com.proto.greeting.AverageResponse;
import com.proto.greeting.AverageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AverageClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 1991)
                .usePlaintext()
                .build();

        AverageServiceGrpc.AverageServiceStub stub = AverageServiceGrpc.newStub(channel);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> stream = stub.count(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse response) {
                System.out.println(response.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        numbers.forEach(a ->
                stream.onNext(AverageRequest.newBuilder().setNumber(a).build()));
//        for (Integer integer : numbers) {
//            stream.onNext(AverageRequest.newBuilder().setNumber(integer).build());
//        }

        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);
    }
}
