package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "BASE_ACCOUNT")
public class AccountBase extends Account {

  @Column(name = "POINTS")
  private Integer points;

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    AccountBase that = (AccountBase) o;
    return Objects.equals(points, that.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), points);
  }
}
