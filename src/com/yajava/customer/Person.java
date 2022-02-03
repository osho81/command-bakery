package com.yajava.customer;

public abstract class Person {

    private String name;
    private String personID;

    public Person(String name, String personID) {
        this.name = name;
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
}
