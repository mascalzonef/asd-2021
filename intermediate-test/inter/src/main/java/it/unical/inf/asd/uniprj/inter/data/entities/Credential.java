package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Credential {

  @Column(name = "USERNAME")
  private String username;

  @Column(name = "PASSWORD")
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
