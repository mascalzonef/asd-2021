package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BANKING_CONTRACT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_RATE")
public class BankingContract {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "ISIN_CODE", unique = true)
  private String isinCode;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "EXPIRATION_DATE")
  private LocalDate expirationDate;

  @Column(name = "NOMINAL_VALUE")
  private String nominalValue;

  @Column(name = "RATE")
  private Integer rate;

//  @OneToMany(mappedBy = "bankingContract")
//  private List<AvailableBalance> availableBalances = new ArrayList<>();

  @OneToMany(mappedBy = "bankingContract")
  private List<BankingMovement> bankingMovements = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIsinCode() {
    return isinCode;
  }

  public void setIsinCode(String isinCode) {
    this.isinCode = isinCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getNominalValue() {
    return nominalValue;
  }

  public void setNominalValue(String nominalValue) {
    this.nominalValue = nominalValue;
  }

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public List<BankingMovement> getBankingMovements() {
    return bankingMovements;
  }

  public void setBankingMovements(List<BankingMovement> bankingMovements) {
    this.bankingMovements = bankingMovements;
  }
}
