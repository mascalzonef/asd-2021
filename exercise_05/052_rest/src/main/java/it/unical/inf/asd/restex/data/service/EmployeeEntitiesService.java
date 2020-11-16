package it.unical.inf.asd.restex.data.service;

import it.unical.inf.asd.restex.data.entities.Employee;

import java.util.List;

public interface EmployeeEntitiesService {

  List<Employee> getAllEmployee();

  List<Employee> getAllEmployee(String role);

  Employee getEmployee(Long id);

  Employee addEmployee(Employee employee);

  Employee updateEmployee(Long id, Employee employee);

  void delete(Long id);

  Employee getEmployeeByName(String name);
}
