package com.example.ticketservice.service.businessService.ticketBusinessService;

import com.example.ticketservice.dto.request.TicketRequest;
import com.example.ticketservice.dto.response.TicketResponse;
import com.example.ticketservice.mapper.businessMapper.TicketResponseMapper;
import com.example.ticketservice.service.jooqService.ticketJooqService.TicketJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketBusinessServiceImpl implements TicketBusinessService{

    private final TicketJooqService ticketJooqService;

    private final TicketResponseMapper ticketResponseMapper;

    @Override
    public TicketResponse create(TicketRequest request) {
        return ticketResponseMapper.toResponse(ticketJooqService.create(request));
    }
}
