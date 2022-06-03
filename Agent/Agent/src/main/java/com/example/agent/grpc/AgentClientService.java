package com.example.agent.grpc;

import com.proto.agent.AgentRequest;
import com.proto.agent.AgentResponse;
import com.proto.agent.AgentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
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
        AgentResponse agentResponse = stub.send(build);

        return agentResponse;
    }
}
