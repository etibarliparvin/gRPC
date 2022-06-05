package com.example.ticket3.grpc;

import com.proto.ticket3.TicketRequest;
import com.proto.ticket3.TicketResponse;
import com.proto.ticket3.TicketServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TicketClientService {

    private TicketServiceGrpc.TicketServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1992).usePlaintext().build();
        stub = TicketServiceGrpc.newBlockingStub(channel);
    }

    public TicketResponse method(Long id) {
        TicketRequest build = TicketRequest.newBuilder().setId(id).build();
        TicketResponse ticketResponse = stub.getAgent(build);
        return ticketResponse;
    }
}
