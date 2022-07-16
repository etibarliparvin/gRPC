package com.example.ticketservice.service.jooqService.ticketJooqService;

import com.example.ticketservice.dto.request.TicketRequest;
import nu.studer.sample.tables.records.TicketRecord;

import java.util.List;

public interface TicketJooqService {

    TicketRecord create(TicketRequest request);

    TicketRecord findById(Long id);

    List<TicketRecord> findAll();

    TicketRecord update(Long id, TicketRequest request);
}
