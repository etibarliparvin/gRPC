package com.example.agentservice.mapper.recordMapper;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.models.TicketProtoRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketProtoMapper implements ProtoMapper<TicketRequest, TicketProtoRequest> {

    @Override
    public TicketProtoRequest toProto(TicketRequest request) {
        return TicketProtoRequest.newBuilder()
                .setCode(request.getCode())
                .setStatus(request.getStatus())
                .setIssuerAgent(request.getIssuerAgent())
                .build();
    }

    @Override
    public List<TicketProtoRequest> toProtoList(List<TicketRequest> ticketRequests) {
        List<TicketProtoRequest> requests = new ArrayList<>();
        requests.addAll(ticketRequests.stream().map(this::toProto).collect(Collectors.toList()));
        return requests;
    }
}
