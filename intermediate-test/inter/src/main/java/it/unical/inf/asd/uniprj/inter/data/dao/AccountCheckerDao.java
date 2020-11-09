package it.unical.inf.asd.uniprj.inter.data.entities.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.AccountChecker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountCheckerDao extends JpaRepository<AccountChecker, Long>, JpaSpecificationExecutor<AccountChecker> {
}
