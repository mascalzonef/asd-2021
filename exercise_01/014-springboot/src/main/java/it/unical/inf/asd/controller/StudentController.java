package it.unical.inf.asd.controller;

import it.unical.inf.asd.dto.StudentDTO;
import it.unical.inf.asd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller()
public class StudentController {
  @Autowired
  StudentService service;

  public StudentDTO createNewStudent() {
    return service.createNewStudent();
  }
}