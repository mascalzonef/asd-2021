package it.unical.inf.asd.restex.data.dto;

import java.io.Serializable;

public class EmployeeSimpleDto implements Serializable {

  private Long id;

  private String name;

  private String role;

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

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
