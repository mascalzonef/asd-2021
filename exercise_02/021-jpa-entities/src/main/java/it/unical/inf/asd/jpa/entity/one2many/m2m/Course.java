package it.unical.inf.asd.jpa.entity.one2many.m2m;

import javax.persistence.OneToMany;
import java.util.Set;

class Course {
 
    // ...
 
    @OneToMany(mappedBy = "courses")
    Set<CourseRegistration> registrations;
 
    // ...
}