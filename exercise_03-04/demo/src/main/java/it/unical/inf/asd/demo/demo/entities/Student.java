package it.unical.inf.asd.demo.demo.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "STUDENT")
public class Student {

    public enum Gender {
        MALE,
        FEMALE
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Basic(optional = false)  // blocked in The database layer
    @Column(name = "LASTNAME") // blocked at runtime and before contacting the database
    private String lastName;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date birthDateAsDate;

    @Column(name = "BIRTHDATE", insertable = false, updatable = false) //means that JPA won't include the column in the insert statement when saving the entity. But it will when updating the entity, and it will load it from the database.
    private LocalDate birthDateAsLocalDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender;

    @Column(name = "WANT_NEWSLETTER")
    private boolean wantsNewsletter;

    @Embedded
    @AttributeOverrides({
      @AttributeOverride(name = "street", column = @Column(name = "ST_STREET")),
      @AttributeOverride(name = "number", column = @Column(name = "ST_NUMBER")),
      @AttributeOverride(name = "city", column = @Column(name = "ST_CITY"))
    })
    private Address address;

    @ManyToMany
    @JoinTable(
        name = "STUDENTS_COURSES",
        joinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    )
    private List<Course> courses = new ArrayList<>();


    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDateAsDate() {
        return birthDateAsDate;
    }

    public void setBirthDateAsDate(Date birthDateAsDate) {
        this.birthDateAsDate = birthDateAsDate;
    }

    public LocalDate getBirthDateAsLocalDate() {
        return birthDateAsLocalDate;
    }

    public void setBirthDateAsLocalDate(LocalDate birthDateAsLocalDate) {
        this.birthDateAsLocalDate = birthDateAsLocalDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isWantsNewsletter() {
        return wantsNewsletter;
    }

    public void setWantsNewsletter(boolean wantsNewsletter) {
        this.wantsNewsletter = wantsNewsletter;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return wantsNewsletter == student.wantsNewsletter && Objects.equals(id, student.id) && Objects
            .equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects
            .equals(birthDateAsDate, student.birthDateAsDate) && Objects
            .equals(birthDateAsLocalDate, student.birthDateAsLocalDate) && gender == student.gender && Objects
            .equals(address, student.address) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, lastName, firstName, birthDateAsDate, birthDateAsLocalDate, gender, wantsNewsletter, address,
                courses);
    }
}
