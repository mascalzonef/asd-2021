package it.unical.inf.asd.uniprj.bank.data.dao;

import it.unical.inf.asd.uniprj.bank.data.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CouponDao extends JpaRepository<Coupon, Long>, JpaSpecificationExecutor<Coupon> {

}
