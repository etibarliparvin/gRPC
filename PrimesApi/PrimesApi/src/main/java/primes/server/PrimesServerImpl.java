package primes.server;

import com.promo.primes.PrimesServiceGrpc;
import com.proto.primes.PrimeRequest;
import com.proto.primes.PrimeResponse;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class PrimesServerImpl extends PrimesServiceGrpc.PrimesServiceImplBase {

    @Override
    public void calculate(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        int number = request.getNumber();
//        PrimeResponse response = PrimeResponse.newBuilder().setResult(number).build();

        int k = 2;
        while (number > 1) {
            if (number % k == 0) {
                number /= k;
                responseObserver.onNext(PrimeResponse.newBuilder().setResult(k).build());
            } else
                k += 1;
        }

        responseObserver.onCompleted();
    }
}
