package it.unical.inf.asd.jpa.entity.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    //...

    /*
        We also need to place the @OneToOne annotation here, too.
        That's because this is a bidirectional relationship.
        The address side of the relationship is called the non-owning side.
     */
    @OneToOne(mappedBy = "addressField")
    private User user;
 
    //... getters and setters
}