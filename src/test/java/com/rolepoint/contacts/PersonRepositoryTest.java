package com.rolepoint.contacts;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PersonRepositoryTest {

    @Test
    public void testSaveContacts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> expectedList = objectMapper.readValue(new FileReader("contacts.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));

        Assert.assertEquals(expectedList.size(), new PersonRepository().saveContacts().size());
        Assert.assertEquals(expectedList, new PersonRepository().saveContacts());
    }
}
