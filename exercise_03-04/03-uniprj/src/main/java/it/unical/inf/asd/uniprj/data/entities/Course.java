package it.unical.inf.asd.uniprj.data.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE", unique = true)
    private String title;

    @ManyToOne
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID")
    private Teacher teacher;

    @OneToOne(mappedBy = "course", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private CourseMaterial material;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>();

    public Course() {}

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseMaterial getMaterial() {
        return material;
    }

    public void setMaterial(CourseMaterial material) {
        this.material = material;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) && Objects.equals(title, course.title) && Objects
            .equals(teacher, course.teacher) && Objects.equals(material, course.material) && Objects
            .equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, teacher, material, students);
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", title='" + title + '\'' + ", teacher=" + teacher + '}';
    }
}