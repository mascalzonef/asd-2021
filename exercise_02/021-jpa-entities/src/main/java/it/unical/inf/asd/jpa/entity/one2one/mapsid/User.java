package it.unical.inf.asd.jpa.entity.one2one.mapsid;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
 
    //...
 
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;
 
    //... getters and setters
}