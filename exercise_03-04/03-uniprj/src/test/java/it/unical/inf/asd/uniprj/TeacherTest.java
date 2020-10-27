package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.UniSpecification;
import it.unical.inf.asd.uniprj.data.entities.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    Optional<Course> opt = courseDao.findByTitle("ASD");

    if(opt.isEmpty())
      System.out.println("NOT FOUNDED");
    else
      System.out.println(opt.get().getId());
    System.out.println("---");
    String title = courseDao.findTitleById(6L);
    System.out.println(title);
    System.out.println("---");


    courseDao.findAll(UniSpecification.anotherFilter("Bianchi")).stream().forEach(System.out::println);

  }

}
