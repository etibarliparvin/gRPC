package maximum.server;

import com.proto.maximum.MaximumResponse;
import com.proto.maximum.MaximumServiceGrpc;
import com.proto.maximum.MaximunRequest;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class MaximumServerImpl extends MaximumServiceGrpc.MaximumServiceImplBase {
    @Override
    public StreamObserver<MaximunRequest> calculate(StreamObserver<MaximumResponse> responseObserver) {

        List<Integer> list = new ArrayList<>();

        return new StreamObserver<MaximunRequest>() {
            @Override
            public void onNext(MaximunRequest request) {
                list.add(request.getNumber());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(MaximumResponse.newBuilder().setResult(seco).build());
            }
        }
    }
}
