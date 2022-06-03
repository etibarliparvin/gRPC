package com.example.ticket.repo;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.tables.Tickets.TICKETS;
import static org.jooq.impl.DSL.count;

@Repository
@RequiredArgsConstructor
public class TicketRepository {

    private final DSLContext context;

    public Long findCount(Long id) {
        return context.select(count())
                .from(TICKETS)
                .where(TICKETS.AGENT_ID.eq(id))
                .fetchOneInto(Long.class);
    }
}
