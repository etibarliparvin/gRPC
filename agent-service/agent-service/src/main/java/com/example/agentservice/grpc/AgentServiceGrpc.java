package com.example.agentservice.grpc;

import com.example.models.TicketProtoRequest;
import com.example.models.TicketProtoResponse;
import com.example.models.TicketProtoServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AgentServiceGrpc {

    private TicketProtoServiceGrpc.TicketProtoServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = TicketProtoServiceGrpc.newBlockingStub(channel);
        System.out.println(channel);
    }

    public TicketProtoResponse method(TicketProtoRequest request) {
        return stub.createTicket(request);
    }
}
