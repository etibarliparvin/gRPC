package com.example.backoffice.repo;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.PersonRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.Tables.PERSON;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

    private final DSLContext context;

    public boolean findById(Long id) {
        PersonRecord record = context.select()
                .from(PERSON)
                .where(PERSON.ID.eq(id))
                .fetchOneInto(PersonRecord.class);
        if (record != null) {
            return true;
        }
        return false;
    }
}
