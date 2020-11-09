package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dao.CourseDao;
import it.unical.inf.asd.uniprj.data.dao.TeacherDao;
import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

  @Autowired
  private TeacherDao teacherDao;

  @Autowired
  private CourseDao courseDao;

  @Override
  public List<Teacher> getAllTeacher() {
    return teacherDao.findAll();
  }

  @Transactional
  @Override
  public void deleteTeacherAndEmptyCourse() {
    List<Course> all = courseDao.findAll();
    for (Course c : all) {
      if (c.getStudents().isEmpty()) {
        Teacher teacher = c.getTeacher();
        courseDao.delete(c);
        teacherDao.delete(teacher);
        methodWithException(); //MOCK LINE
      }
    }

  }

  private void methodWithException() {
    throw new RuntimeException("MOCK ERROR");
  }
}
