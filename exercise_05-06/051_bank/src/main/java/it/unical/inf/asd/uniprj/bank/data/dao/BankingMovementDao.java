package it.unical.inf.asd.uniprj.bank.data.dao;

import it.unical.inf.asd.uniprj.bank.data.entities.BankingMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BankingMovementDao extends JpaRepository<BankingMovement, Long>,
    JpaSpecificationExecutor<BankingMovement> {

}
