package com.example.agentservice.service.businessService.agentBusinessService;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.dto.response.TicketResponse;

public interface AgentBusinessService {

    TicketResponse create(TicketRequest request);
}
