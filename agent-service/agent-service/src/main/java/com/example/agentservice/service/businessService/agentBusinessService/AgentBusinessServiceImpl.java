package com.example.agentservice.service.businessService.agentBusinessService;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.dto.response.TicketResponse;
import com.example.agentservice.grpc.AgentServiceGrpc;
import com.example.agentservice.mapper.businessMapper.TicketResponseMapper;
import com.example.agentservice.mapper.recordMapper.TicketProtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgentBusinessServiceImpl implements AgentBusinessService {

    private final TicketResponseMapper ticketResponseMapper;
    public final TicketProtoMapper ticketProtoMapper;
    private final AgentServiceGrpc agentServiceGrpc;

    @Override
    public TicketResponse create(TicketRequest request) {
        return ticketResponseMapper.toResponse(agentServiceGrpc.method(ticketProtoMapper.toProto(request)));
    }
}
