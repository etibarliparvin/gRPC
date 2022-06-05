package com.example.agent3.grpc;

import com.example.agent3.repo.AgentRepository;
import com.proto.ticket3.TicketRequest;
import com.proto.ticket3.TicketResponse;
import com.proto.ticket3.TicketServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import nu.studer.sample.tables.records.AgentRecord;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class AgentServerService extends TicketServiceGrpc.TicketServiceImplBase {

    private final AgentRepository repository;

    @Override
    public void getAgent(TicketRequest request, StreamObserver<TicketResponse> responseObserver) {
        AgentRecord agentRecord = repository.findById(request.getId());
        TicketResponse response = TicketResponse.newBuilder().setName(agentRecord.getName()).setAge(agentRecord.getAge()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
