package it.unical.inf.asd.annotation.controller;

import it.unical.inf.asd.annotation.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

	@Lazy
	@Autowired
	EmployeeManager employeeManager;
	
	public EmployeeManager getManagerInstance() {
		return employeeManager;
	}
}