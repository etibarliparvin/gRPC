package com.example.ticket2.grpc;

import com.proto.ticket2.TicketRequest;
import com.proto.ticket2.TicketResponse;
import com.proto.ticket2.TicketServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TickerClientService {

    private TicketServiceGrpc.TicketServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1992).usePlaintext().build();
        stub = TicketServiceGrpc.newBlockingStub(channel);
    }

    public TicketResponse bringBonus(Long id) {
        TicketRequest build = TicketRequest.newBuilder().setId(id).build();
        TicketResponse ticketResponse = stub.hasBonus(build);
        System.out.println(ticketResponse.getBonus());
        return ticketResponse;
    }
}
