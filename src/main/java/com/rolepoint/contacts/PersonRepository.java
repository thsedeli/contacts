package com.rolepoint.contacts;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PersonRepository {

    List<Person> saveContacts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new FileReader("contacts.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));
    }
}
