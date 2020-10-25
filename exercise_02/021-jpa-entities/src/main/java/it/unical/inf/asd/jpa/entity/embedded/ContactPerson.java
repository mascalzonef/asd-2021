package it.unical.inf.asd.jpa.entity.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class ContactPerson {
 
    private String firstName;
 
    private String lastName;
 
    private String phone;
 
    // standard getters, setters
}