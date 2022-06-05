package com.example.ticket3.controller;

import com.example.ticket3.dto.ResponseDto;
import com.example.ticket3.grpc.TicketClientService;
import com.example.ticket3.repo.TicketRepository;
import com.proto.ticket3.TicketResponse;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketsRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketRepository repository;
    private final TicketClientService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> foo(@PathVariable Long id) {
        ResponseDto dto = new ResponseDto();

        TicketResponse response = service.method(id);

        TicketsRecord record = repository.findById(id);
        dto.setId(record.getId());
        dto.setAgentId(record.getAgentId());
        dto.setName(response.getName());
        dto.setAge(response.getAge());

        System.out.println(dto);

        return ResponseEntity.ok(record);
    }
}
