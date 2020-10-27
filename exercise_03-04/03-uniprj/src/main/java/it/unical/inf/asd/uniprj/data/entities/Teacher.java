package it.unical.inf.asd.uniprj.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "TEACHER")
public class Teacher {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name="FIRSTNAME")
   private String firstName;

   @Column(name="LASTNAME")
   private String lastName;

   public Teacher() {}

   @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
   private List<Course> courses;

   public Long id() {
       return id;
   }

   public String firstName() {
       return firstName;
   }

   public String lastName() {
       return lastName;
   }

   public List<Course> courses() {
       return courses;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

  @Override
  public String toString() {
    return "Teacher{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }
}