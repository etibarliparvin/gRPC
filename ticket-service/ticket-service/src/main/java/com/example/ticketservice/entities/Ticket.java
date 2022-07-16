package com.example.ticketservice.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    Long id;
    String code;
    Long status;
    Long issuerAgent;
    LocalDateTime creationTime;

    public Ticket(String code, Long status, Long issuerAgent, LocalDateTime creationTime) {
        this.code = code;
        this.status = status;
        this.issuerAgent = issuerAgent;
        this.creationTime = creationTime;
    }
}
