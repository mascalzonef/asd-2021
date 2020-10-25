package it.unical.inf.asd.annotation2.service;

import it.unical.inf.asd.annotation2.ext.ManagerBean;
import it.unical.inf.asd.annotation2.dao.StudentDAO;
import it.unical.inf.asd.annotation2.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

  @Autowired
  StudentDAO dao;

  @Autowired
  ManagerBean managerBean;

  @Override
  public StudentDTO createNewStudent() {
    StudentDTO studentDTO = dao.createNewStudent();
    return managerBean.change(studentDTO);
  }
}
