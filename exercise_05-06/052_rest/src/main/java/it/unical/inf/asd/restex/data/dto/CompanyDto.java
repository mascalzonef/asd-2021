package it.unical.inf.asd.restex.data.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class CompanyDto implements Serializable {

  private Long id;

  private String name;

  private String vatNumber;

  public CompanyDto() {
    //empty
  }

  public CompanyDto(Long id,
      String name,
      String vatNumber) {
    this.id = id;
    this.name = name;
    this.vatNumber = vatNumber;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
