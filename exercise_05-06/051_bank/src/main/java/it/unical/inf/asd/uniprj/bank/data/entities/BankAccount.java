package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount {

  enum TypeBankAccount {
    TYPE1, TYPE2;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "NUMBER")
  private Integer number;

  @Enumerated(EnumType.STRING)
  @Column(name = "TYPE_BANK_ACCOUNT")
  private TypeBankAccount typeBankAccount;

  @OneToMany(mappedBy = "bankAccount")
  private List<AvailableBalance> availableBalances = new ArrayList<>();

  @OneToMany(mappedBy = "bankAccount")
  private List<BankingMovement> bankingMovements = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TypeBankAccount getTypeBankAccount() {
    return typeBankAccount;
  }

  public void setTypeBankAccount(TypeBankAccount typeBankAccount) {
    this.typeBankAccount = typeBankAccount;
  }

  public List<AvailableBalance> getAvailableBalances() {
    return availableBalances;
  }

  public void setAvailableBalances(List<AvailableBalance> availableBalances) {
    this.availableBalances = availableBalances;
  }

  public List<BankingMovement> getBankingMovements() {
    return bankingMovements;
  }

  public void setBankingMovements(List<BankingMovement> bankingMovements) {
    this.bankingMovements = bankingMovements;
  }
}
