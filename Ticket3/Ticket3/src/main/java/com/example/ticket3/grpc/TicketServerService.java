package com.example.ticket3.grpc;

import com.example.ticket3.repo.TicketRepository;
import com.proto.agent3.AgentRequest;
import com.proto.agent3.AgentResponse;
import com.proto.agent3.AgentServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class TicketServerService extends AgentServiceGrpc.AgentServiceImplBase {

    private final TicketRepository repository;

    @Override
    public void getCount(AgentRequest request, StreamObserver<AgentResponse> responseObserver) {
        Long count = repository.findCount(request.getId());
        AgentResponse response = AgentResponse.newBuilder().setTicketCount(count).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
