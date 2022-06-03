package com.example.bonus2.grpc;

import com.example.bonus2.repo.BonusRepository;
import com.proto.ticket2.TicketRequest;
import com.proto.ticket2.TicketResponse;
import com.proto.ticket2.TicketServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class BonusServerService extends TicketServiceGrpc.TicketServiceImplBase {

    private final BonusRepository repository;

    @Override
    public void hasBonus(TicketRequest request, StreamObserver<TicketResponse> responseObserver) {
        Boolean bonus = repository.hasBonus(request.getId());

        TicketResponse response = TicketResponse.newBuilder().setBonus(bonus).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
