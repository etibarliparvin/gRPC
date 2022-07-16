package com.example.ticketservice.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TicketResponse {

    Long id;
    String code;
    Long status;
    Long issuerAgent;
    LocalDateTime creationTime;
}
