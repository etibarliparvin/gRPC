package com.example.ticket3.repo;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketsRecord;
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

    public TicketsRecord findById(Long id) {
        TicketsRecord record = context.select()
                .from(TICKETS)
                .where(TICKETS.ID.eq(id))
                .fetchOneInto(TicketsRecord.class);
        return record;
    }
}
