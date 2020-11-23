package it.unical.inf.asd.restex.data.service.impl;

import it.unical.inf.asd.restex.core.exception.EmployeeException;
import it.unical.inf.asd.restex.core.exception.EmployeeNotFoundException;
import it.unical.inf.asd.restex.data.dao.EmployeeDao;
import it.unical.inf.asd.restex.data.dto.EmployeeDto;
import it.unical.inf.asd.restex.data.dto.EmployeeSimpleDto;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public List<EmployeeSimpleDto> getAllEmployee() {
    List<Employee> employees = employeeDao.findAll();
    return employees.stream().map(empl -> modelMapper.map(empl, EmployeeSimpleDto.class)).collect(Collectors.toList());
  }

  @Override
  public List<EmployeeDto> getAllEmployee(String role) {
    return employeeDao.findAllByRole(role).stream().map(empl -> modelMapper.map(empl, EmployeeDto.class)).collect(Collectors.toList());
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

  @Override
  public EmployeeDto updateEmployee(Long id,
      EmployeeDto employeeToSave) {

    return employeeDao.findById(id).map(employee -> {
      employee.setName(employeeToSave.getName());
      employee.setRole(employeeToSave.getRole());
      return modelMapper.map(employeeDao.save(employee), EmployeeDto.class);
    }).orElseThrow(() -> new EmployeeException());

  }

  @Override
  public void delete(Long id) {
    employeeDao.deleteById(id);
  }

  @Override
  public EmployeeDto getEmployeeByName(String name) {
    Employee employee = employeeDao.findByName(name).orElseThrow(() -> new EmployeeNotFoundException(name));
    return modelMapper.map(employee, EmployeeDto.class);
  }
}
