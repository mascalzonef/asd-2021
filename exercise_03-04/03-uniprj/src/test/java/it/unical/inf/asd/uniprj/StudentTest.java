package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.entities.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    //LocalDate.of(1999, Month.AUGUST,10)
    List<Student> list = studentDao.findAllByLastNameAndFirstName("Fff", "Eee");
    System.out.println(list.size());
    for (Student s: list) {
      System.out.println(s);

    }

    Assert.assertEquals(10, studentDao.findAll().size());
  }

}
