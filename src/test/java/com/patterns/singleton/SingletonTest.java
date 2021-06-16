package com.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
class SingletonTest {

    @Test
    void singletonTest() {
        Singleton singleton1 = Singleton.getInstance();
        assertEquals("Initial info class", singleton1.getInfo());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("New class info");
        assertEquals("New class info", singleton2.getInfo());

        assertEquals("New class info", singleton1.getInfo());
    }

}
