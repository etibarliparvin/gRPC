package com.example.bonus.grpc;

import com.example.bonus.repo.BonusRepository;
import com.proto.bonus.AgentRequest;
import com.proto.bonus.AgentResponse;
import com.proto.bonus.AgentServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class BonusServerService extends AgentServiceGrpc.AgentServiceImplBase {

    private final BonusRepository repository;

    @Override
    public void move(AgentRequest request, StreamObserver<AgentResponse> responseObserver) {
        Boolean bonus = repository.hasBonus(request.getId());

        AgentResponse response = AgentResponse.newBuilder().setBonus(bonus).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
