package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    // insert a person in the database with the given id
    int insertPerson(UUID id, Person person);

    //add the actual IDs ourselves, add person without id (random id)
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
