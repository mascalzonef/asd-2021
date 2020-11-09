package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name= "CUSTOMER")
public class Customer {

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
  @Column(name = "FISCAL_CODE", unique = true, length = 16)
  private String fiscalcode;

  @Basic(optional = false)
  @Column(name = "ADDRESS", length = 100)
  private String address;

  @Column(name = "BIRTHDATE")
  private LocalDate birthdate;

  @Column(name = "ACCT_NO")
  private Integer acctNo;

  @ManyToOne
  @JoinColumn(name = "BANK_ID")
  private Bank bank;

  @OneToMany(mappedBy = "customer")
  private List<Loan> loans = new ArrayList<>();

  @OneToOne
  @JoinColumn(name = "ACCOUNT_ID")
  private Account account;

  @ManyToMany
  @JoinTable(
      name = "contract",
      joinColumns = @JoinColumn(name = "CUSTOMER_ID"),
      inverseJoinColumns = @JoinColumn(name = "TELLER_ID"))
  private List<Teller> tellers;

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

  public String getFiscalcode() {
    return fiscalcode;
  }

  public void setFiscalcode(String fiscalcode) {
    this.fiscalcode = fiscalcode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public Integer getAcctNo() {
    return acctNo;
  }

  public void setAcctNo(Integer acctNo) {
    this.acctNo = acctNo;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public List<Teller> getTellers() {
    return tellers;
  }

  public void setTellers(List<Teller> tellers) {
    this.tellers = tellers;
  }

  public List<Loan> getLoans() {
    return loans;
  }

  public void setLoans(List<Loan> loans) {
    this.loans = loans;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Customer customer = (Customer) o;
    return Objects.equals(id, customer.id) && Objects.equals(firstname, customer.firstname) && Objects
        .equals(lastname, customer.lastname) && Objects.equals(fiscalcode, customer.fiscalcode) && Objects
        .equals(address, customer.address) && Objects.equals(birthdate, customer.birthdate) && Objects
        .equals(acctNo, customer.acctNo) && Objects.equals(bank, customer.bank) && Objects.equals(loans, customer.loans)
        && Objects.equals(account, customer.account) && Objects.equals(tellers, customer.tellers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstname, lastname, fiscalcode, address, birthdate, acctNo, bank, loans, account, tellers);
  }
}
