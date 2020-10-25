package it.unical.inf.asd.jpa.entity.embedded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
 
    @Id
    @GeneratedValue
    private Integer id;
 
    private String name;
 
    private String address;
 
    private String phone;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
        @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
        @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
    })
    private ContactPerson contactPerson;
 
    // standard getters, setters
}