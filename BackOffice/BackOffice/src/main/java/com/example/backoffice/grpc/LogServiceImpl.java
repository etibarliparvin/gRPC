package com.example.backoffice.grpc;

import com.example.backoffice.repo.PersonRepository;
import com.proto.person.LogRequest;
import com.proto.person.LogResponse;
import com.proto.person.LogServiceGrpc;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@GrpcService
@RequiredArgsConstructor
public class LogServiceImpl extends LogServiceGrpc.LogServiceImplBase {

    private final PersonRepository repository;

    @Override
    public void logging(LogRequest request, StreamObserver<LogResponse> responseObserver) {

        System.out.println(request);

        boolean isPresent = repository.findById(request.getId());

        LogResponse response = LogResponse.newBuilder()
                .setResponse(isPresent)

                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
