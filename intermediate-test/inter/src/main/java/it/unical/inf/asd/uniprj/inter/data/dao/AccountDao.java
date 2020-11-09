package it.unical.inf.asd.uniprj.inter.data.entities.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {
}
