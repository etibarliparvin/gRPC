package com.example.agent2.grpc;

import com.proto.agent2.AgentRequest;
import com.proto.agent2.AgentResponse;
import com.proto.agent2.AgentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class AgentClientService {

    private AgentServiceGrpc.AgentServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = AgentServiceGrpc.newBlockingStub(channel);
        System.out.println();
    }

    public AgentResponse method(Long id) {
        AgentRequest build = AgentRequest.newBuilder().setId(id).build();
        AgentResponse agentResponse = stub.getCount(build);
        return agentResponse;
    }
}
