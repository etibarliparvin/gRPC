package org.example;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static List<Person> people = new ArrayList<>();
    private static int id = 1;

    public static Person addPerson(Person person) {
        Person newPerson = new Person(person.getName());
        newPerson.setId(id++);
        people.add(newPerson);
        return newPerson;
    }

    public static Person getPersonById(int id) {
        return people.get(id);
    }
}
