package com.example.ticketservice.grpc;

import com.example.models.TicketProtoRequest;
import com.example.models.TicketProtoResponse;
import com.example.models.TicketProtoServiceGrpc;
import com.example.ticketservice.dto.request.TicketRequest;
import com.example.ticketservice.dto.response.TicketResponse;
import com.example.ticketservice.mapper.businessMapper.TicketResponseMapper;
import com.example.ticketservice.mapper.recordMapper.TicketRecordMapper;
import com.example.ticketservice.service.businessService.ticketBusinessService.TicketBusinessService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import static com.example.ticketservice.utils.TimeConverter.localDateTimeToLong;

@Service
@GrpcService
@RequiredArgsConstructor
public class TicketServiceGrpc extends TicketProtoServiceGrpc.TicketProtoServiceImplBase {

    private final TicketBusinessService ticketBusinessService;

    @Override
    public void createTicket(TicketProtoRequest request, StreamObserver<TicketProtoResponse> responseObserver) {
        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setCode(request.getCode());
        ticketRequest.setStatus(request.getStatus());
        ticketRequest.setIssuerAgent(request.getIssuerAgent());

        TicketResponse response = ticketBusinessService.create(ticketRequest);

        TicketProtoResponse protoResponse = TicketProtoResponse.newBuilder()
                .setId(response.getId())
                .setCode(response.getCode())
                .setStatus(response.getStatus())
                .setIssuerAgent(response.getIssuerAgent())
                .setCreationTime(localDateTimeToLong(response.getCreationTime()))
                .build();

        responseObserver.onNext(protoResponse);
        responseObserver.onCompleted();
    }
}
