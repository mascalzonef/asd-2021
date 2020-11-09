package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "LOAN")
public class Loan {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @Basic(optional = false)
  @Column(name = "DATE")
  private LocalDate date;

  @Basic(optional = false)
  @Column(name = "VALUE")
  private Double value;

  @ManyToOne
  @JoinColumn(name = "CUSTOMER_ID")
  private Customer customer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Loan loan = (Loan) o;
    return Objects.equals(id, loan.id) && Objects.equals(date, loan.date) && Objects.equals(value, loan.value)
        && Objects.equals(customer, loan.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, value, customer);
  }
}
