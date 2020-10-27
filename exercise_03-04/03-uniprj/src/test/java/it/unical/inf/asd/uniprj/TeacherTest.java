package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.UniSpecification;
import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    List<Teacher> listA = teacherDao.findAll(teacherDao.theLastFilter("Aaa"));

    List<Teacher> list = teacherDao.findAll(UniSpecification.theLastFilter("Aaa"));
    Assert.assertEquals(4, list.size());
//    list.stream().forEach(System.out::println);

  }

}
