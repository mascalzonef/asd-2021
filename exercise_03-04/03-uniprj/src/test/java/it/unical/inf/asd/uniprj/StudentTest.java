package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.UniSpecification;
import it.unical.inf.asd.uniprj.data.entities.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Consumer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest extends AbstractUniPrjTest {

  @Test
  public void test() {

    //LocalDate.of(1999, Month.AUGUST,10)
    List<Student> list = studentDao.findAllByLastNameAndFirstName("Fff", "Eee");
    System.out.println(list.size());
    list.stream().forEach(System.out::println);


    System.out.println("---");
    list = studentDao.ciccio("Bbb");
    System.out.println(list.size());
    list.stream().forEach(System.out::println);

    System.out.println("---");
    list = studentDao.findAllByBirthDateBetweenOrderByLastNameDesc(LocalDate.of(2000, Month.JANUARY, 1),
        LocalDate.of(2000, Month.DECEMBER, 31));
    list.stream().forEach(System.out::println);

    System.out.println("---");
    list =
        studentDao.findAllByBirthDateLessThanEqualAndFirstNameIsNotNullAndLastNameStartingWithAndWantsNewsletterTrueOrderByGenderAsc(LocalDate.of(2020, Month.JANUARY, 1), "T");
    list.stream().forEach(System.out::println);

    int count = studentDao.countByGender(Student.Gender.MALE);
    System.out.println(count);

    System.out.println("---");
    UniSpecification.Filter filter = new UniSpecification.Filter();
    filter.setAge(20);
    studentDao.findAll(UniSpecification.withFilter(filter)).stream().forEach(System.out::println);
  }

}
