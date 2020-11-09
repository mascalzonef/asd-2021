package it.unical.inf.asd.uniprj.inter.data.dao;

import it.unical.inf.asd.uniprj.inter.data.entities.Teller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TellerDao extends JpaRepository<Teller, Long>, JpaSpecificationExecutor<Teller> {
}
