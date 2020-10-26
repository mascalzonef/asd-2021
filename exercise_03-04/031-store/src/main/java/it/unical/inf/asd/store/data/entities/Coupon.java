package it.unical.inf.asd.store.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "COUPON")
public class Coupon {

  enum CouponStatus {ACTIVE, DISABLED, USED;}

  @Id
  @GeneratedValue
  private Long id;

  @Basic(optional = false)
  @Column(name = "CODE", length = 255)
  private String code;

  @Basic(optional = false)
  @Column(name = "VALUE", length = 255)
  private String value;

  @Enumerated(EnumType.STRING)
  private CouponStatus status;

  @ManyToOne(optional = true)
  @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
  private Customer customer;

  @Basic(optional = false)
  @Column(name = "VALID_FROM")
  private LocalDateTime validFrom;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CouponStatus getStatus() {
    return status;
  }

  public void setStatus(CouponStatus status) {
    this.status = status;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public LocalDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDateTime validFrom) {
    this.validFrom = validFrom;
  }
}
