package it.unical.inf.asd.jpa.entity.one2one;

import org.apache.tomcat.jni.Address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  //...

  @OneToOne
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address addressField;

  // ... getters and setters
}