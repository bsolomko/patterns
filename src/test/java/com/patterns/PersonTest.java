package com.patterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootApplication
class PersonTest {

    @Test
    void builderAge() {
        Person person = new PersonBuilderImp().setAge(23).build();
        assertEquals(23, person.getAge());
    }

    @Test
    void builderFirstname() {
        Person person = new PersonBuilderImp().setFirstname("Alex").build();
        assertEquals("Alex", person.getFirstname());
    }

    @Test
    void builderLastname() {
        Person person = new PersonBuilderImp().setLastname("Sap").build();
        assertEquals("Sap", person.getLastname());
    }

    @Test
    void builderHeight() {
        Person person = new PersonBuilderImp().setHeight(186).build();
        assertEquals(186, person.getHeight());
    }

    @Test
    void builderAddress() {
        Person person = new PersonBuilderImp().setAddress("Pushkinskaya,2").build();
        assertEquals("Pushkinskaya,2", person.getAddress());
    }

}