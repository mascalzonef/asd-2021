package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "BANK_MOVEMENT")
public class BankingMovement {

  enum TypeBankingMovement {
    TYPE1, TYPE2;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "DATE")
  private LocalDate date;

  @Column(name = "SEQUENTIAL_NUMBER")
  private Integer sequentialNumber;

  @Enumerated(EnumType.STRING)
  @Column(name = "TYPE_BANKING_MOVEMENT")
  private TypeBankingMovement typeBankingMovement;

  @Column(name = "AMOUNT")
  private Double amount;

  @ManyToOne
  @JoinColumn(name = "bankAccount_id", referencedColumnName = "id")
  private BankAccount bankAccount;

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

  public TypeBankingMovement getTypeBankingMovement() {
    return typeBankingMovement;
  }

  public void setTypeBankingMovement(TypeBankingMovement typeBankingMovement) {
    this.typeBankingMovement = typeBankingMovement;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public BankingContract getBankingContract() {
    return bankingContract;
  }

  public void setBankingContract(BankingContract bankingContract) {
    this.bankingContract = bankingContract;
  }
}
