package it.unical.inf.asd.jpa.entity.one2many.m2m;

import it.unical.inf.asd.jpa.entity.basic.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
class CourseRegistration {
 
    @Id
    Long id;
 
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;
 
    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
 
    LocalDateTime registeredAt;
 
    int grade;
    
    // additional properties
    // standard constructors, getters, and setters
}