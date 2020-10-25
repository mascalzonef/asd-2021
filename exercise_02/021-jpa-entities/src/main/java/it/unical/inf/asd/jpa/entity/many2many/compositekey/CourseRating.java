package it.unical.inf.asd.jpa.entity.many2many.compositekey;

import it.unical.inf.asd.jpa.entity.basic.Student;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
class CourseRating {
 
    @EmbeddedId
    CourseRatingKey id;
 
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;
 
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    Course course;
 
    int rating;
    
    // standard constructors, getters, and setters
}