package it.unical.inf.asd.annotation2.ext;

import it.unical.inf.asd.annotation2.dto.StudentDTO;

import java.util.Random;

public class ManagerBeanImpl extends ManagerBean {

  @Override
  public StudentDTO change(StudentDTO studentDTO)
  {
    studentDTO.setId(new Random().nextInt());
    return studentDTO;
  }
}
