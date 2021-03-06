/*
 * Implementation of PersonBuilder based on builder pattern.
 * It allows creating an instance without filling in all the parameters
 * And makes code more readable.
 */

package com.patterns.builder;

public class PersonBuilderImp implements PersonBuilder {

    Person person = new Person();

    @Override
    public PersonBuilder setFirstname(String firstname) {
        person.setFirstname(firstname);
        return this;
    }

    @Override
    public PersonBuilder setLastname(String lastname) {
        person.setLastname(lastname);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setHeight(int height) {
        person.setHeight(height);
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
