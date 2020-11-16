package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "COUPON", uniqueConstraints =
@UniqueConstraint(columnNames = {"SEQUENTIAL_NUMBER", "bankingContract_id"}))
public class Coupon {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "DATE")
  private LocalDate date;

  @Column(name = "SEQUENTIAL_NUMBER")
  private Integer sequentialNumber;

  @Column(name = "EXPIRATION_DATE")
  private LocalDate expirationDate; // --> SQL TYPE IS DATE

  @Column(name = "EXPIRATION_DATE_TIME")
  private LocalDateTime expirationDateTime; // --> SQL TYPE IS TIMESTAMP

  @Column(name = "AMOUNT")
  private Double amount;

  @ManyToOne
  @JoinColumn(name = "bankingContract_id", referencedColumnName = "id")
  private BankingContract bankingContract;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Integer getSequentialNumber() {
    return sequentialNumber;
  }

  public void setSequentialNumber(Integer sequentialNumber) {
    this.sequentialNumber = sequentialNumber;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public BankingContract getBankingContract() {
    return bankingContract;
  }

  public void setBankingContract(BankingContract bankingContract) {
    this.bankingContract = bankingContract;
  }
}
