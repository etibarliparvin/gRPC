package com.example.ticketservice.service.businessService.ticketBusinessService;


import com.example.ticketservice.dto.request.TicketRequest;
import com.example.ticketservice.dto.response.TicketResponse;

public interface TicketBusinessService {
    TicketResponse create(TicketRequest request);

}
