package it.unical.inf.asd.jpa.entity.one2many.m2m;

import javax.persistence.OneToMany;
import java.util.Set;

class Student {
 
    // ...
 
    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> registrations;
 
    // ...
}