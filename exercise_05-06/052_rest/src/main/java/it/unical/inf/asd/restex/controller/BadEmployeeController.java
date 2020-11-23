package it.unical.inf.asd.restex.controller;

import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeEntitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/bad-restex")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BadEmployeeController {

  @Autowired
  private EmployeeEntitiesService employeeEntitiesService;

  @GetMapping("/employees")
  public ResponseEntity<List<Employee>> all() {
    return ResponseEntity.ok(employeeEntitiesService.getAllEmployee());
  }

  @GetMapping("/employees/test")
  public ResponseEntity<Employee> test(@RequestParam("name") String name) {
    return ResponseEntity.ok(employeeEntitiesService.getEmployeeByName(name));
  }

  @GetMapping("/employees/{roles}")
  public ResponseEntity<List<Employee>> all(@PathVariable("roles") String role) {
    List<Employee> employees = employeeEntitiesService.getAllEmployee(role);
    return ResponseEntity.ok(employees);
  }

  @PostMapping("/employees")
  public ResponseEntity<Employee> add(@RequestBody Employee employee) {
    Employee e = employeeEntitiesService.addEmployee(employee);
    return ResponseEntity.ok(e);
  }

  @PutMapping("/employees/{id}")
  public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee employee) {
    Employee e = employeeEntitiesService.updateEmployee(id, employee);
    return ResponseEntity.ok(e);
  }

  @DeleteMapping("/employees/{id}")
  public HttpStatus delete(@PathVariable Long id) {
    employeeEntitiesService.delete(id);
    return HttpStatus.OK;
  }

}