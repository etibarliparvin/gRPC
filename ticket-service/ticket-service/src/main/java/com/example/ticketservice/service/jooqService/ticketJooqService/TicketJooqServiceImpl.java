package com.example.ticketservice.service.jooqService.ticketJooqService;

import com.example.ticketservice.dto.request.TicketRequest;
import com.example.ticketservice.mapper.recordMapper.TicketRecordMapper;
import com.example.ticketservice.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketJooqServiceImpl implements TicketJooqService {

    private final TicketRecordMapper ticketRecordMapper;
    private final TicketRepository<TicketRecord> ticketRepository;

    @Override
    public TicketRecord create(TicketRequest request) {
        return ticketRepository.create(ticketRecordMapper.toRecord(request));
    }

    @Override
    public TicketRecord findById(Long id) {
        return null;
    }

    @Override
    public List<TicketRecord> findAll() {
        return null;
    }

    @Override
    public TicketRecord update(Long id, TicketRequest request) {
        return null;
    }
}
