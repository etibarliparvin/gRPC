package com.example.bonus2.repo;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.tables.Bonus.BONUS;

@Repository
@RequiredArgsConstructor
public class BonusRepository {

    private final DSLContext context;

    public Boolean hasBonus(Long id) {
        return context.select(BONUS.HAS_BONUS)
                .from(BONUS)
                .where(BONUS.AGENT_ID.eq(id))
                .fetchOneInto(Boolean.class);
    }
}
