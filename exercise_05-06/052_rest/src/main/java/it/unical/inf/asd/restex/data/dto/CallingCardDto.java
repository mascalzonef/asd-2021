package it.unical.inf.asd.restex.data.dto;

public class CallingCardDto {

  private String employeeName;

  private String employeeRole;

  private String companyName;

  private String companyVatNumber;


  private Integer numOfEmployee;

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeRole() {
    return employeeRole;
  }

  public void setEmployeeRole(String employeeRole) {
    this.employeeRole = employeeRole;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyVatNumber() {
    return companyVatNumber;
  }

  public void setCompanyVatNumber(String companyVatNumber) {
    this.companyVatNumber = companyVatNumber;
  }

  public Integer getNumOfEmployee() {
    return numOfEmployee;
  }

  public void setNumOfEmployee(Integer numOfEmployee) {
    this.numOfEmployee = numOfEmployee;
  }
}
