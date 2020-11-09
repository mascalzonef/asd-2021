package it.unical.inf.asd.uniprj.inter.data.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.AccountObs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountCheckerDao extends JpaRepository<AccountObs, Long>, JpaSpecificationExecutor<AccountObs> {
}
