package it.unical.inf.asd.restex.data.dao;

import it.unical.inf.asd.restex.data.entities.Company;
import it.unical.inf.asd.restex.data.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

  List<Employee> findAllByRole(String role);

  Optional<Employee> findByName(String name);

  int countByCompany(Company company);
}