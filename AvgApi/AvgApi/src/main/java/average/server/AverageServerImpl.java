package average.server;

import com.proto.greeting.AverageRequest;
import com.proto.greeting.AverageResponse;
import com.proto.greeting.AverageServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class AverageServerImpl extends AverageServiceGrpc.AverageServiceImplBase {

    @Override
    public StreamObserver<AverageRequest> count(StreamObserver<AverageResponse> responseObserver) {
        List<Integer> numbers = new ArrayList<>();

        return new StreamObserver<AverageRequest>() {
            @Override
            public void onNext(AverageRequest request) {
                numbers.add(request.getNumber());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(AverageResponse.newBuilder()
                        .setResult((double) (numbers.stream().reduce(0, (a, b) -> a + b)) / numbers.size())
                        .build());
                responseObserver.onCompleted();
            }
        };
    }
}
