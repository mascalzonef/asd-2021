package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dao.TeacherDao;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

  @Autowired
  private TeacherDao teacherDao;

  @Override
  public List<Teacher> getAllTeacher() {
    return teacherDao.findAll();
  }
}
