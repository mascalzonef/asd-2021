package it.unical.inf.asd.uniprj.data.dao;

import it.unical.inf.asd.uniprj.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

  @Query(value = "from Student where lastName=:lastname", nativeQuery = true)
  List<Student> ciccio(@Param("lastname") String lastname);

  List<Student> findAllByLastNameAndFirstName(String lastname, String f);

}
