package it.unical.inf.asd.uniprj.inter.data.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.AccountPremium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountPremiumDao extends JpaRepository<AccountPremium, Long>, JpaSpecificationExecutor<AccountPremium> {
}
