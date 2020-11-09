package it.unical.inf.asd.uniprj.inter.data.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.AccountBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBaseDao extends JpaRepository<AccountBase, Long>, JpaSpecificationExecutor<AccountBase> {
}
