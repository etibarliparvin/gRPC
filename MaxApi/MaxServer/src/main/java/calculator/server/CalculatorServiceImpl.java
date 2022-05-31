package calculator.server;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.MaxRequest;
import com.proto.calculator.MaxResponse;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public StreamObserver<MaxRequest> max(StreamObserver<MaxResponse> responseObserver) {
        return new StreamObserver<MaxRequest>() {
            int max = 0;

            @Override
            public void onNext(MaxRequest value) {
                if (value.getNumber() > max) {
                    max = value.getNumber();
                    responseObserver.onNext(MaxResponse.newBuilder().setMax(max).build());
                }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
