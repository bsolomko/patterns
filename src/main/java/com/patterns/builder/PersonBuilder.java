package com.patterns.builder;

public interface PersonBuilder {
    PersonBuilder setFirstname(String firstname);

    PersonBuilder setLastname(String lastname);

    PersonBuilder setAge(int age);

    PersonBuilder setHeight(int height);

    PersonBuilder setAddress(String address);

    Person build();

}
