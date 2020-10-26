package it.unical.inf.asd.demo.demo;

import it.unical.inf.asd.demo.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Student, Long> {
}
