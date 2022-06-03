package com.example.ticket.grpc;

import com.example.ticket.repo.TicketRepository;
import com.proto.ticket.AgentRequest;
import com.proto.ticket.AgentResponse;
import com.proto.ticket.AgentServiceGrpc;
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
    public void send(AgentRequest request, StreamObserver<AgentResponse> responseObserver) {
        Long count = repository.findCount(request.getId());

        AgentResponse response = AgentResponse.newBuilder().setTicketCount(count).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }
}
