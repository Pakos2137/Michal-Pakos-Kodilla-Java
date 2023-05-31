package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

public class User {

    private String firstname;
    private String lastname;

    public User(final String name, final String surname){
        this.firstname = name;
        this.lastname = surname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }
}