package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TELLER")
public class Teller {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @Basic(optional = false)
  @Column(name = "FIRST_NAME", length = 50)
  private String firstname;

  @Basic(optional = false)
  @Column(name = "LAST_NAME", length = 50)
  private String lastname;

  @Basic(optional = false)
  @Column(name = "vat_number", unique = true)
  private String vatNumber;

  @ManyToOne
  @JoinColumn(name = "BANK_ID")
  private Bank bank;

  @ManyToMany(mappedBy = "tellers")
  private List<Customer> customer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public List<Customer> getCustomer() {
    return customer;
  }

  public void setCustomer(List<Customer> customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Teller teller = (Teller) o;
    return Objects.equals(id, teller.id) && Objects.equals(firstname, teller.firstname) && Objects
        .equals(lastname, teller.lastname) && Objects.equals(vatNumber, teller.vatNumber) && Objects
        .equals(bank, teller.bank) && Objects.equals(customer, teller.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstname, lastname, vatNumber, bank, customer);
  }
}
