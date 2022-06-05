package com.example.agent3.grpc;

import com.proto.agent3.AgentRequest;
import com.proto.agent3.AgentResponse;
import com.proto.agent3.AgentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AgentClientService {

    private AgentServiceGrpc.AgentServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = AgentServiceGrpc.newBlockingStub(channel);
    }

    public AgentResponse method(Long id) {
        AgentRequest build = AgentRequest.newBuilder().setId(id).build();
        AgentResponse agentResponse = stub.getCount(build);
        return agentResponse;
    }
}
