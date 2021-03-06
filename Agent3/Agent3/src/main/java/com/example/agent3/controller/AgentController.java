package com.example.agent3.controller;

import com.example.agent3.dto.ResponseDto;
import com.example.agent3.grpc.AgentClientService;
import com.example.agent3.repo.AgentRepository;
import com.proto.agent3.AgentResponse;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AgentRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentController {

    private final AgentRepository repository;
    private final AgentClientService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> foo(@PathVariable Long id) {
        ResponseDto dto = new ResponseDto();

        AgentResponse response = service.method(id);

        AgentRecord record = repository.findById(id);
        dto.setAgentId(record.getId());
        dto.setAge(record.getAge());
        dto.setCount(response.getTicketCount());
        return ResponseEntity.ok(dto);
    }
}
