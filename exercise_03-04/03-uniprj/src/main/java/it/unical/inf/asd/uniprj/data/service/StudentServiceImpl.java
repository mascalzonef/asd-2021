package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentDao studentDao;

}
