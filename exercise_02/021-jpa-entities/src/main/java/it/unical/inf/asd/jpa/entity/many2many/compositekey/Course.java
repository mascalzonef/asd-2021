package it.unical.inf.asd.jpa.entity.many2many.compositekey;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
class Course {
 
    // ...
 
    @OneToMany(mappedBy = "course")
    Set<CourseRating> ratings;
 
    // ...
}