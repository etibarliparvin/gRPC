//package com.example.ticket.grpc;
//
//import com.proto.ticket.AgentRequest;
//import com.proto.ticket.AgentResponse;
//import com.proto.ticket.AgentServiceGrpc;
//import io.grpc.ManagedChannel;
//import io.grpc.netty.NettyChannelBuilder;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//
//@Service
//public class TickerClientService {
//
//    private AgentServiceGrpc.AgentServiceBlockingStub stub;
//
//    @PostConstruct
//    public void init() {
//        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1992).usePlaintext().build();
//        stub = AgentServiceGrpc.newBlockingStub(channel);
//        System.out.println();
//    }
//
//    public AgentResponse method(Long id) {
//        AgentRequest build = AgentRequest.newBuilder().setId(id).build();
//        AgentResponse agentResponse = stub.move(build);
//        return agentResponse;
//    }
//}
