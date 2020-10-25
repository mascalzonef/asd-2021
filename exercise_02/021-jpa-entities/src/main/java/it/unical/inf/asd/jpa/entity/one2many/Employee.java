package it.unical.inf.asd.jpa.entity.one2many;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Employee {
 
    @Id
    private Long id;
 
    @OneToMany(mappedBy = "employeeCiao", fetch = FetchType.EAGER)
    private List<Email> emails;
}