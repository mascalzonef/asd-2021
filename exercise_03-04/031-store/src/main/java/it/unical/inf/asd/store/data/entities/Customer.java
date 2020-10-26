package it.unical.inf.asd.store.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

  @Id
  @GeneratedValue
  private Long id;

  @Basic(optional = false)
  @Column(name = "FISCAL_CODE", length = 255, unique = true)
  private String fiscalCode;

  @Basic(optional = false)
  @Column(name = "FIRSTNAME", length = 255)
  private String firstname;

  @Basic(optional = false)
  @Column(name = "lastNAME", length = 255)
  private String lastname;

  @Column(name = "BIRTH_DATE")
  private LocalDate birthdate;

  @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
  private List<Coupon> coupons;

  @ManyToMany
  @JoinTable(
      name = "PURCHASE",
      joinColumns = @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID"),
      inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
  )
  private List<Product> products;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
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

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public List<Coupon> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<Coupon> coupons) {
    this.coupons = coupons;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
