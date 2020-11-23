package it.unical.inf.asd.restex.controller;

import it.unical.inf.asd.restex.core.service.CallingCardService;
import it.unical.inf.asd.restex.data.dto.CallingCardDto;
import it.unical.inf.asd.restex.data.dto.EmployeeDto;
import it.unical.inf.asd.restex.data.dto.EmployeeSimpleDto;
import it.unical.inf.asd.restex.data.entities.Employee;
import it.unical.inf.asd.restex.data.service.EmployeeService;
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
@RequestMapping("/restex")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

  // CHANGE TO USE DTO
  @Autowired
  private EmployeeService employeeService;

  @Autowired
  private CallingCardService callingCardService;

  @GetMapping("/callingCardService/{employee-id}")
  public ResponseEntity<CallingCardDto> callingCard(@PathVariable("employee-id") Long id) {
    return ResponseEntity.ok(callingCardService.getCallingCard(id));
  }

  @GetMapping("/employees")
  public ResponseEntity<List<EmployeeSimpleDto>> all() {
    return ResponseEntity.ok(employeeService.getAllEmployee());
  }

  @GetMapping("/employees/test")
  public ResponseEntity<EmployeeDto> test(@RequestParam("name") String name) {
    return ResponseEntity.ok(employeeService.getEmployeeByName(name));
  }

  @GetMapping("/employees/{roles}")
  public ResponseEntity<List<EmployeeDto>> all(@PathVariable("roles") String role) {
    List<EmployeeDto> employees = employeeService.getAllEmployee(role);
    return ResponseEntity.ok(employees);
  }

  @PostMapping("/employees")
  public ResponseEntity<EmployeeDto> add(@RequestBody EmployeeDto employee) {
    EmployeeDto e = employeeService.addEmployee(employee);
    return ResponseEntity.ok(e);
  }

  @PutMapping("/employees/{id}")
  public ResponseEntity<EmployeeDto> update(@PathVariable Long id,
      @RequestBody EmployeeDto employee) {
    EmployeeDto e = employeeService.updateEmployee(id, employee);
    return ResponseEntity.ok(e);
  }

  @DeleteMapping("/employees/{id}")
  public HttpStatus delete(@PathVariable Long id) {
    employeeService.delete(id);
    return HttpStatus.OK;
  }

  @GetMapping("/greeting/{user}")
  public ResponseEntity<String> greeting(@PathVariable("user") String user) {
    return ResponseEntity.ok(String.format("Hellooooo %s!!!", user));
  }

  @GetMapping("/greeting")
  public ResponseEntity<String> greeting2() {
    return ResponseEntity.ok(String.format("Hellooooo %s!!!", "a"));
  }

}