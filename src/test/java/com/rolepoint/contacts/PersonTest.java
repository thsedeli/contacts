package com.rolepoint.contacts;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testEquals() {
        Person.PersonBuilder expected = Person.builder().name("Theo");
        Assert.assertEquals(expected.build(), Person.builder().name("Theo").build());

        Assert.assertNotEquals(expected.name("Changed").build(), Person.builder().name("Theo").build());
    }
}
