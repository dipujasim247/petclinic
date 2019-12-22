package com.stornit.petclinic.model;

public class Person {

    //Person extends by Vet and Owner

    //== Fields ==
    private String FirstName;
    private String LastName;

    //== Constructor ==
    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public Person() {
    }

    // == getters and setters ==
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    //== to string object ==
    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
