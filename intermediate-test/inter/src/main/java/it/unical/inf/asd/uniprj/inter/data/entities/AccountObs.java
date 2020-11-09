package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CHECKER")
public class AccountChecker extends Account {

  @Column(name = "AREA", length = 50)
  private String area;

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    AccountChecker that = (AccountChecker) o;
    return Objects.equals(area, that.area);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), area);
  }
}
