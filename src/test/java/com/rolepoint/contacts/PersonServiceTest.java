package com.rolepoint.contacts;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PersonServiceTest {
    private List<Person> fullContactList;
    private Person examplePerson;
    private PersonService service;

    @Before
    public void setUp() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        fullContactList = objectMapper.readValue(new FileReader("contacts.json"), objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));

        examplePerson = Person.builder()
                .job_history(Collections.singletonList("Sibelius"))
                .company("Mattis Corporation")
                .email("vehicula@et.com")
                .city("Westerlo")
                .name("David Harrington")
                .country("Spain")
                .build();

        service = new PersonService();
    }

    @Test
    public void testFindAll() {
        Assert.assertEquals(fullContactList.size(), new PersonService().findAll().size());
        Assert.assertEquals(fullContactList, new PersonService().findAll());
    }

    @Test
    public void testFindByName() {
        List<Person> expected = Collections.singletonList(examplePerson);
        Assert.assertEquals(expected, service.findPersonByName("David"));
        Assert.assertEquals(fullContactList, service.findPersonByName(""));
    }

    @Test (expected = NullPointerException.class)
    public void testFindByNameNullValue() {
        service.findPersonByName(null);
    }

    @Test
    public void testFindPerson() {
        List<Person> expected = Collections.singletonList(examplePerson);
        Assert.assertEquals(expected, service.findPerson(examplePerson));
    }

    @Test (expected = NullPointerException.class)
    public void testFindPersonNullValue() {
        service.findPerson(null);
    }
}
