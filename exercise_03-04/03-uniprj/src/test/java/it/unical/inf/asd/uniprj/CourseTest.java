package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    Optional<Course> opt = courseDao.findByTitle("ASD");

    if(opt.isEmpty())
      System.out.println("NOT FOUNDED");
    else
      System.out.println(opt.get().getId());

    String title = courseDao.findTitleById(6L);
    System.out.println(title);

  }

}
