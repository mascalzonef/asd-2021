package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT", uniqueConstraints =
  @UniqueConstraint(columnNames = { "REGION_CODE", "RSS_NO" })
)
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @Basic(optional = false)
  @Column(name = "DATE")
  private LocalDateTime creationDate;

  @Basic(optional = false)
  @Column(name = "REGION_CODE")
  private Integer regionCode;

  @Basic(optional = false)
  @Column(name = "RSS_NO")
  private String rssNo;

  @Embedded
  private Credential credential;

  @OneToOne
  private Customer customer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(Integer regionCode) {
    this.regionCode = regionCode;
  }

  public String getRssNo() {
    return rssNo;
  }

  public void setRssNo(String rssNo) {
    this.rssNo = rssNo;
  }

  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
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
    Account account = (Account) o;
    return Objects.equals(id, account.id) && Objects.equals(creationDate, account.creationDate) && Objects
        .equals(regionCode, account.regionCode) && Objects.equals(rssNo, account.rssNo) && Objects
        .equals(credential, account.credential) && Objects.equals(customer, account.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, regionCode, rssNo, credential, customer);
  }
}
