package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VARIABLE_RATE")
public class VariableRate extends BankingContract {

  private Double spread;

  public Double getSpread() {
    return spread;
  }

  public void setSpread(Double spread) {
    this.spread = spread;
  }
}
