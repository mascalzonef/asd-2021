package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.TeacherDao;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

  @Autowired
  private TeacherDao teacherDao;

  @Test
  public void test1() {
    Teacher teacher = new Teacher();
    teacher.setFirstName("Mario");
    teacher.setLastName("Rossi");

    teacherDao.save(teacher);

    List<Teacher> all = teacherDao.findAll();
    for (Teacher t: all) {
      System.out.println(t);
    }

  }

}
