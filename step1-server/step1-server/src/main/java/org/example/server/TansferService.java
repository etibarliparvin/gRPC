package org.example.server;

import az.etibarli.grpc.TransferRequest;
import az.etibarli.grpc.TransferResponse;
import az.etibarli.grpc.TransferServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TansferService extends TransferServiceGrpc.TransferServiceImplBase {

    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return new TransferStreamingRequest(responseObserver);
    }
}
