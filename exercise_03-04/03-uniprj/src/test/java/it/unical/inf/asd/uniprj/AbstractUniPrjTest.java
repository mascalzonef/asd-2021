package it.unical.inf.asd.uniprj;

import it.unical.inf.asd.uniprj.data.dao.CourseDao;
import it.unical.inf.asd.uniprj.data.dao.CourseMaterialDao;
import it.unical.inf.asd.uniprj.data.dao.StudentDao;
import it.unical.inf.asd.uniprj.data.dao.TeacherDao;
import it.unical.inf.asd.uniprj.data.entities.Address;
import it.unical.inf.asd.uniprj.data.entities.Course;
import it.unical.inf.asd.uniprj.data.entities.CourseMaterial;
import it.unical.inf.asd.uniprj.data.entities.Student;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractUniPrjTest {

  @Value("classpath:data/students.csv")
  private Resource studentsRes;

  @Value("classpath:data/teachers.csv")
  private Resource teachersRes;

  @Value("classpath:data/courses.csv")
  private Resource coursesRes;

  @Autowired
  protected TeacherDao teacherDao;

  @Autowired
  protected StudentDao studentDao;

  @Autowired
  protected CourseDao courseDao;

  @Autowired
  protected CourseMaterialDao courseMaterialDao;

  private static boolean isInitialized = false;

  @Before
  public void createDbTest() throws IOException {

    if (!isInitialized) {
      CSVParser teachersCsv = CSVFormat.DEFAULT.withDelimiter(';')
          .parse(new InputStreamReader(teachersRes.getInputStream()));
      for (CSVRecord record : teachersCsv) {
        insertTeacher(record.get(0), record.get(1));
      }

      CSVParser coursesCsv = CSVFormat.DEFAULT.withDelimiter(';')
          .parse(new InputStreamReader(coursesRes.getInputStream()));
      for (CSVRecord record : coursesCsv) {
        insertCourse(record.get(0), record.get(1), record.get(2), record.get(3));
      }

      CSVParser studentsCsv = CSVFormat.DEFAULT.withDelimiter(';')
          .parse(new InputStreamReader(studentsRes.getInputStream()));
      for (CSVRecord record : studentsCsv) {
        insertStudent(record.get(0), record.get(1), record.get(2), record.get(3), record.get(4), record.get(5),
            record.get(6), record.get(7), record.get(8));
      }
      isInitialized = true;
    }
  }

  private void insertStudent(String firstName,
      String lastName,
      String birthDate,
      String gender,
      String wantsNewsletter,
      String streetAddress,
      String numberAddress,
      String cityAddress,
      String courses) {
    Student student = new Student();
    student.setFirstName(firstName);
    student.setLastName(lastName);

    student.setBirthDate(LocalDate.parse(birthDate, DateTimeFormatter.ISO_LOCAL_DATE));
    student.setGender(Student.Gender.valueOf(gender));
    student.setWantsNewsletter(Boolean.valueOf(wantsNewsletter));
    student.setAddress(new Address(streetAddress, numberAddress, cityAddress));

    String[] coursesArray = courses.split("-");
    for (String courseId : coursesArray) {
      Course course = courseDao.findById(Long.parseLong(courseId)).get();
      student.addCourse(course);
    }

    studentDao.save(student);
  }

  private void insertTeacher(String firstName,
      String lastName) {
    Teacher teacher = new Teacher();
    teacher.setFirstName(firstName);
    teacher.setLastName(lastName);

    teacherDao.saveAndFlush(teacher);
  }

  private void insertCourse(String title,
      String idTeacher,
      String idCourseMaterial,
      String urlMaterial) {
    Teacher teacher = teacherDao.findById(Long.valueOf(idTeacher)).get();
    Course course = new Course();
    course.setTeacher(teacher);
    course.setTitle(title);
    courseDao.save(course);

    CourseMaterial courseMaterial = new CourseMaterial();
    courseMaterial.setId(Long.parseLong(idCourseMaterial));
    courseMaterial.setCourse(course);
    courseMaterial.setUrl(urlMaterial);
    courseMaterialDao.save(courseMaterial);
  }
}