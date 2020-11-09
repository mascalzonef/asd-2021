package it.unical.inf.asd.uniprj.bank.data.dao;

import it.unical.inf.asd.uniprj.bank.data.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BankAccountDao extends JpaRepository<BankAccount, Long>, JpaSpecificationExecutor<BankAccount>{

}
