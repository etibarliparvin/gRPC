package com.example.agentservice.mapper.businessMapper;

import com.example.agentservice.dto.response.TicketResponse;
import com.example.models.TicketProtoResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.agentservice.utils.TimeConverter.longToLocalDateTime;

@Component
public class TicketResponseMapper implements ResponseMapper<TicketProtoResponse, TicketResponse> {

    @Override
    public TicketResponse toResponse(TicketProtoResponse ticketProtoResponse) {
        TicketResponse response = new TicketResponse();
        response.setId(ticketProtoResponse.getId());
        response.setCode(ticketProtoResponse.getCode());
        response.setStatus(ticketProtoResponse.getStatus());
        response.setIssuerAgent(ticketProtoResponse.getIssuerAgent());
        response.setCreationTime(longToLocalDateTime(ticketProtoResponse.getCreationTime()));
        return response;
    }

    @Override
    public List<TicketResponse> toResponseList(List<TicketProtoResponse> protos) {
        List<TicketResponse> responses = new ArrayList<>();
        responses.addAll(protos.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
