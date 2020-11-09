package it.unical.inf.asd.restex.data.dao;

import it.unical.inf.asd.restex.data.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

  List<Employee> findAllByRole(String role);
}