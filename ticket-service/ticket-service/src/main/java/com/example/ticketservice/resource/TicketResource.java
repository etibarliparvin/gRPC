package com.example.ticketservice.resource;

import com.example.ticketservice.dto.request.TicketRequest;
import com.example.ticketservice.dto.response.TicketResponse;
import com.example.ticketservice.service.businessService.ticketBusinessService.TicketBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TicketResource {
    private final TicketBusinessService businessService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody TicketRequest request) {
        return ResponseEntity.ok(businessService.create(request));
    }
}
