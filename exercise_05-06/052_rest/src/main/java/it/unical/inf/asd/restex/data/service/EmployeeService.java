package it.unical.inf.asd.restex.data.service;

import it.unical.inf.asd.restex.data.dto.EmployeeDto;
import it.unical.inf.asd.restex.data.dto.EmployeeSimpleDto;
import it.unical.inf.asd.restex.data.entities.Employee;

import java.util.List;

public interface EmployeeService {


  List<EmployeeSimpleDto> getAllEmployee();

  List<EmployeeDto> getAllEmployee(String role);

  EmployeeDto getEmployee(Long id);

  EmployeeDto addEmployee(EmployeeDto employee);

  EmployeeDto updateEmployee(Long id, EmployeeDto employee);

  void delete(Long id);

  EmployeeDto getEmployeeByName(String name);

}
