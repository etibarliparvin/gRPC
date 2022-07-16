package com.example.ticketservice.service;//package com.example.ticketservice.service;
//
//import com.example.ticketservice.entities.Ticket;
//import com.example.ticketservice.repository.TicketRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class TicketService {
//    private final TicketRepository repository;
//    private final QueryExecutorService queryExecutorService;
//
//    private boolean createTicket(Ticket ticket) {
//        return queryExecutorService.execute(repository.insert(ticket)) > 0;
//    }
//}
