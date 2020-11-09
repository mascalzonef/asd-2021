package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "BANK")
public class Bank {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @Basic(optional = false)
  @Column(name = "NAME", unique = true)
  private String name;

  @Column(name = "LOCATION")
  private String location;

  @OneToMany(mappedBy = "bank")
  private List<Teller> tellers = new ArrayList<>();

  @OneToMany(mappedBy = "bank")
  private List<Teller> customers = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<Teller> getTellers() {
    return tellers;
  }

  public void setTellers(List<Teller> tellers) {
    this.tellers = tellers;
  }

  public List<Teller> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Teller> customers) {
    this.customers = customers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Bank bank = (Bank) o;
    return Objects.equals(id, bank.id) && Objects.equals(name, bank.name) && Objects.equals(location, bank.location)
        && Objects.equals(tellers, bank.tellers) && Objects.equals(customers, bank.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, location, tellers, customers);
  }
}
