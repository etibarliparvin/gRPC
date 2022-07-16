package org.example.client;

import az.etibarli.grpc.Person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws Exception {
        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(10)
                .build();

        Path path = Paths.get("sam.ser");
//        Files.write(path, sam.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person person = Person.parseFrom(bytes);
        System.out.println(person);
    }
}
