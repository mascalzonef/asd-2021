package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FIXED_RATE")
public class FixedRate extends BankingContract {

}
