package it.unical.inf.asd.restex.data.service.impl;

import it.unical.inf.asd.restex.core.exception.EmployeeException;
import it.unical.inf.asd.restex.core.exception.EmployeeNotFoundException;
import it.unical.inf.asd.restex.data.dao.EmployeeDao;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeEntitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEntitiesServiceImpl implements EmployeeEntitiesService {

  @Autowired
  private EmployeeDao employeeDao;

  @Override
  public List<Employee> getAllEmployee() {
    return employeeDao.findAll();
  }

  @Override
  public List<Employee> getAllEmployee(String role) {
    return employeeDao.findAllByRole(role);
  }

  @Override
  public Employee getEmployee(Long id) {
    return employeeDao.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    /*
    Optional<Employee> opt = employeeDao.findById(id);
    if(opt.isPresent())
      return opt.get();
    else
      throw new EmployeeNotFoundException(id);
    */
  }

  @Override
  public Employee addEmployee(Employee employee) {
    return employeeDao.save(employee);
  }

  @Override
  public Employee updateEmployee(Long id,
      Employee employeeToSave) {

    return employeeDao.findById(id).map(employee -> {
      employee.setName(employeeToSave.getName());
      employee.setRole(employeeToSave.getRole());
      return employeeDao.save(employee);
    }).orElseThrow(() -> new EmployeeException());

    /*
    Employee e = getEmployee(id);
    e.setName(employee.getName());
    e.setRole(employee.getRole());
    return employeeDao.save(e);
     */
  }

  @Override
  public void delete(Long id) {
    employeeDao.deleteById(id);
  }

  @Override
  public Employee getEmployeeByName(String name) {
    return employeeDao.findByName(name).orElseThrow(() -> new EmployeeNotFoundException(name));
  }
}
