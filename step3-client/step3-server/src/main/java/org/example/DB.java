package org.example;

import java.util.Arrays;
import java.util.List;

public class DB {

    public static List<Person> people = Arrays.asList(new Person(1, "Parvin"),
            new Person(2, "Narmin"),
            new Person(3, "Ali"));

    public static Person getPersonById(int id) {
        return people.get(id);
    }
}
