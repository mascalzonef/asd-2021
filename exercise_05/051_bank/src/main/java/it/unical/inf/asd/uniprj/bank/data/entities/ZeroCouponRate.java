package it.unical.inf.asd.uniprj.bank.data.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ZERO_COUPON")
public class ZeroCouponRate extends BankingContract {

}
