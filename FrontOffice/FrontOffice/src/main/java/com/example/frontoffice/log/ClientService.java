package com.example.frontoffice.log;

import com.google.protobuf.Empty;
import com.proto.person.LogRequest;
import com.proto.person.LogResponse;
import com.proto.person.LogServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService extends LogServiceGrpc.LogServiceImplBase {

    @Override
    public void logging(LogRequest request, StreamObserver<LogResponse> responseObserver) {
        System.out.println(request.getId());
    }
}
