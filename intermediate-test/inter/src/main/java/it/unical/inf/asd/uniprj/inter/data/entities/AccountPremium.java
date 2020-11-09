package it.unical.inf.asd.uniprj.inter.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "PREMIUM_ACCOUNT")
public class AccountPremium extends Account {

  enum Promotion {
    PROMO_1, PROMO_2, PROMO_3;
  }

  @Column(name = "POINTS")
  private Integer points;

  @Column(name = "PROMOTION")
  @Enumerated(EnumType.STRING)
  private Promotion promotion;

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    AccountPremium that = (AccountPremium) o;
    return Objects.equals(points, that.points) && promotion == that.promotion;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), points, promotion);
  }
}
