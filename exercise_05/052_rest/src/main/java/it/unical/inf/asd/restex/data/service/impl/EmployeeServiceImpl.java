package it.unical.inf.asd.restex.data.service.impl;

import it.unical.inf.asd.restex.core.exception.EmployeeNotFoundException;
import it.unical.inf.asd.restex.data.dao.EmployeeDao;
import it.unical.inf.asd.restex.data.dto.EmployeeDto;
import it.unical.inf.asd.restex.data.dto.EmployeeSimpleDto;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public List<EmployeeSimpleDto> getAllEmployee() {
    List<Employee> employees = employeeDao.findAll();
    employees.stream().map(empl -> modelMapper.map(empl, EmployeeSimpleDto.class)).collect(Collectors.toList());
    return null;
  }

  @Override
  public EmployeeDto getEmployee(Long id) {
    Employee employee = employeeDao.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    return modelMapper.map(employee, EmployeeDto.class);
  }

  @Override
  public EmployeeDto addEmployee(EmployeeDto dto) {
    Employee employee = modelMapper.map(dto, Employee.class);
    Employee saved = employeeDao.save(employee);
    return modelMapper.map(saved, EmployeeDto.class);

  }
}
