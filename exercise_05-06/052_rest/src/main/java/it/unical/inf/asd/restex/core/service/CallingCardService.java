package it.unical.inf.asd.restex.core.service;

import it.unical.inf.asd.restex.core.exception.EmployeeNotFoundException;
import it.unical.inf.asd.restex.data.dao.CompanyDao;
import it.unical.inf.asd.restex.data.dao.EmployeeDao;
import it.unical.inf.asd.restex.data.dto.CallingCardDto;
import it.unical.inf.asd.restex.data.entities.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallingCardService {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private CompanyDao companyDao;

  @Autowired
  private ModelMapper modelMapper;

  public CallingCardDto getCallingCard(Long employeeId) {

    Employee employee = employeeDao.findById(employeeId).orElseThrow(() -> new EmployeeNotFoundException(employeeId));
    return getCallingCard(employee);

  }

  public CallingCardDto getCallingCard(Employee employee) {
    //Company company = employee.getCompany();
    //CallingCardDto dto = modelMapper.map(employee, CallingCardDto.class);

    CallingCardDto dto = new CallingCardDto();
    dto.setEmployeeName(employee.getName());
    dto.setEmployeeRole(employee.getRole());
    dto.setCompanyName(employee.getCompany().getName());
    dto.setCompanyVatNumber(employee.getCompany().getVatNumber());

    int numOfemployee = employeeDao.countByCompany(employee.getCompany());
    dto.setNumOfEmployee(numOfemployee);
    return dto;

  }

}
