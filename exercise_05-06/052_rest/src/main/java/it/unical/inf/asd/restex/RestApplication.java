package it.unical.inf.asd.restex;

import it.unical.inf.asd.restex.data.entities.Company;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.CompanyService;
import it.unical.inf.asd.restex.data.service.EmployeeEntitiesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApplication {

  public static void main(String[] args) {

    ConfigurableApplicationContext applicationContext = SpringApplication.run(RestApplication.class, args);

    EmployeeEntitiesService employeeEntitiesService = applicationContext.getBean(EmployeeEntitiesService.class);
    CompanyService companyDao = applicationContext.getBean(CompanyService.class);

    Company company = companyDao.add(createCompany());
    employeeEntitiesService.addEmployee(createEmployee(1, company));
    employeeEntitiesService.addEmployee(createEmployee(2, company));

  }

  private static Employee createEmployee(int i,
      Company company) {

    Employee employee = new Employee();
    employee.setRole("role_" + i);
    employee.setName("name_" + i);

    employee.setCompany(company);

    return employee;
  }

  private static Company createCompany() {
    Company company = new Company();
    company.setName("acme srl");
    company.setVatNumber("0123456789");
    return company;
  }

}
