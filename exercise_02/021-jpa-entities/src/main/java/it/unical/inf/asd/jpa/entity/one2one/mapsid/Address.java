package it.unical.inf.asd.jpa.entity.one2one.mapsid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
 
    @Id
    @Column(name = "id")
    private Long id;
 
    //...

    /*
    @MapsId tells Hibernate to use the id column of address as both primary-key and foreign-key.
    Also, notice that the @Id column of the Address entity no longer uses the @GeneratedValue annotation.
    The mappedBy attribute is now moved to the User class since the foreign key is now present in the address table.
     */
    @OneToOne
    @MapsId
    private User user;
   
    //... getters and setters
}
