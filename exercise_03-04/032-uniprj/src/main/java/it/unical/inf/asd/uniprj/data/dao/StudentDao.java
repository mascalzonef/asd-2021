package it.unical.inf.asd.uniprj.data.dao;

import it.unical.inf.asd.uniprj.data.entities.Student;
import it.unical.inf.asd.uniprj.data.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentDao
    extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

  @Query(value = "from Student s where lastName=:xxx")
  List<Student> ciccio(@Param("xxx") String lastname);

  int countByGender(Student.Gender gender);

  List<Student> findAllFirst3ByLastName(String name);

  List<Student> findAllByLastNameOrFirstName(String lastname, String f);

  List<Student> findAllByLastNameAndFirstName(String lastname, String f);

  List<Student> findAllByBirthDateBetweenOrderByLastNameDesc(LocalDate from, LocalDate to);

  List<Student> findAllByBirthDateLessThanEqualAndFirstNameIsNotNullAndLastNameStartingWithAndWantsNewsletterTrueOrderByGenderAsc(LocalDate date, String lastnameStart);
}
