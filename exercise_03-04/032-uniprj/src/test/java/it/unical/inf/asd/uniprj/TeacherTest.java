package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.UniSpecification;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    Specification<Teacher> spec = teacherDao.theLastFilter("Aaa");
    List<Teacher> listA = teacherDao.findAll(spec);

    List<Teacher> list = teacherDao.findAll(UniSpecification.theLastFilter("Aaa"));
    Assert.assertEquals(4, list.size());
//    list.stream().forEach(System.out::println);

  }

}
