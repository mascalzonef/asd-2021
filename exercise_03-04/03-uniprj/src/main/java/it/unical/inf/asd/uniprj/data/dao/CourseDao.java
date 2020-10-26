package it.unical.inf.asd.uniprj.data.dao;

import it.unical.inf.asd.uniprj.data.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

  Optional<Course> findByTitle(String title);

  @Query("select t.title from Course t where t.id=:id")
  String findTitleById(@Param("id") Long id);

}
