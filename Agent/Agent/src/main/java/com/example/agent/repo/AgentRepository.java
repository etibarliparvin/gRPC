package com.example.agent.repo;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AgentRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.Tables.AGENT;

@Repository
@RequiredArgsConstructor
public class AgentRepository {

    private final DSLContext context;

    public AgentRecord findById(Long id) {
        return context.select()
                .from(AGENT)
                .where(AGENT.ID.eq(id))
                .fetchOneInto(AgentRecord.class);
    }
}
