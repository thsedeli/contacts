package com.rolepoint.contacts;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private static List<Person> personList;

    static {
        try {
            personList = new PersonRepository().saveContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> findAll() {
        return personList;
    }

    public List<Person> findPerson(Person person) {
       return findPersonByName(person.getName());
    }

    public List<Person> findPersonByName(String name) {
        return personList
                .stream()
                .filter(person -> person.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}
