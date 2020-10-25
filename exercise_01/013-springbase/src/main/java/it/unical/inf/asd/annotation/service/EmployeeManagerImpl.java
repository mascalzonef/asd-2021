package it.unical.inf.asd.annotation.service;

import it.unical.inf.asd.annotation.bean.Employee;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
class EmployeeManagerImpl implements EmployeeManager {
 
    @Override
    public Employee create() {
        Employee emp =  new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        return emp;
    }
}