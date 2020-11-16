package it.unical.inf.asd.restex.data.service;

import it.unical.inf.asd.restex.data.dto.EmployeeDto;
import it.unical.inf.asd.restex.data.dto.EmployeeSimpleDto;

import java.util.List;

public interface EmployeeService {

  List<EmployeeSimpleDto> getAllEmployee();

  EmployeeDto getEmployee(Long id);

  EmployeeDto addEmployee(EmployeeDto dto);

}
