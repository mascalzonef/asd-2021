package it.unical.inf.asd.uniprj.inter.data.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.Account;
import it.unical.inf.asd.uniprj.inter.data.entities.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {

  List<Account> findAllByCredential(Credential credential);
}
