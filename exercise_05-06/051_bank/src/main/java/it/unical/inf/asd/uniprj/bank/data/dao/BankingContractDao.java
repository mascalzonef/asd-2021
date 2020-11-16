package it.unical.inf.asd.uniprj.bank.data.dao;

import it.unical.inf.asd.uniprj.bank.data.entities.BankingContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BankingContractDao extends JpaRepository<BankingContract, Long>,
    JpaSpecificationExecutor<BankingContract> {

}
