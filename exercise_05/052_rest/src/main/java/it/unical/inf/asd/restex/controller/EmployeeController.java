package it.unical.inf.asd.restex.controller;

import it.unical.inf.asd.restex.core.exception.EmployeeNotFoundException;
import it.unical.inf.asd.restex.data.dao.EmployeeDao;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restex")
class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees")
  ResponseEntity<List<Employee>> all() {
    return ResponseEntity.ok(employeeService.getAllEmployee());
  }
}