package com.microserviceproject.hrservice.model;
public class Employee {
    private String Id;
    private String Firstname;
    private String LastName;
    private String specialty;

    public Employee(String id, String firstname, String lastName, String specialty) {
        Id = id;
        Firstname = firstname;
        LastName = lastName;
        this.specialty = specialty;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
