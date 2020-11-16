package it.unical.inf.asd.restex.data.dao;

import it.unical.inf.asd.restex.data.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao  extends JpaRepository<Company, Long> {
}
