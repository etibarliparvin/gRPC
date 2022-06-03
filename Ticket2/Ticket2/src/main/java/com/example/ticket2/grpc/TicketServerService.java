package com.example.ticket2.grpc;

import com.example.ticket2.repo.TicketRepository;
import com.proto.agent2.AgentRequest;
import com.proto.agent2.AgentResponse;
import com.proto.agent2.AgentServiceGrpc;
import com.proto.ticket2.TicketResponse;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class TicketServerService extends AgentServiceGrpc.AgentServiceImplBase {

    private final TicketRepository repository;
    private final TickerClientService tickerClientService;

    @Override
    public void getCount(AgentRequest request, StreamObserver<AgentResponse> responseObserver) {
        Long count = repository.findCount(request.getId());

        AgentResponse response = AgentResponse.newBuilder()
                .setTicketCount(count)
                .setHasBonus(tickerClientService.bringBonus(request.getId()).getBonus())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
