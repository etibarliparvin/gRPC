package com.example.agentservice.resource;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.service.businessService.agentBusinessService.AgentBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentResource {

    private final AgentBusinessService agentBusinessService;

    @PostMapping("/createTicket")
    public ResponseEntity<?> create(@RequestBody TicketRequest request) {
        return ResponseEntity.ok(agentBusinessService.create(request));
    }
}
