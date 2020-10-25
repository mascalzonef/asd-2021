package it.unical.inf.asd.service;

import it.unical.inf.asd.dao.StudentDAO;
import it.unical.inf.asd.dto.StudentDTO;
import it.unical.inf.asd.ext.ManagerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
