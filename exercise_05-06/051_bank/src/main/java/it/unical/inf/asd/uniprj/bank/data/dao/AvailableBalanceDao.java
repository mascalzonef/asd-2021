package it.unical.inf.asd.uniprj.bank.data.dao;

import it.unical.inf.asd.uniprj.bank.data.entities.AvailableBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AvailableBalanceDao extends JpaRepository<AvailableBalance, Long>,
    JpaSpecificationExecutor<AvailableBalance> {

}
