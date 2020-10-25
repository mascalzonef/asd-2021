package it.unical.inf.asd.ext;

import it.unical.inf.asd.dto.StudentDTO;

import java.util.Random;

public class ManagerBeanImpl extends ManagerBean {

  @Override
  public StudentDTO change(StudentDTO studentDTO)
  {
    studentDTO.setId(new Random().nextInt());
    return studentDTO;
  }
}
