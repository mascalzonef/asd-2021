package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVAILABLE_BALANCE")
public class AvailableBalance {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "bankAccount_id", referencedColumnName = "id")
  private BankAccount bankAccount;

  @ManyToOne
  @JoinColumn(name = "bankingContract_id", referencedColumnName = "id")
  private BankingContract bankingContract;

  @Column(name="amount")
  private Double amount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
