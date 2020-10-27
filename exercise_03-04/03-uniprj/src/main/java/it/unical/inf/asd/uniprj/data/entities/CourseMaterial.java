package it.unical.inf.asd.uniprj.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "COURSE_MATERIAL")
public class CourseMaterial {

    @Id
    private Long id;

    @Column(name="URL", unique = true)
    private String url;

    @OneToOne(optional = false)
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    private Course course;

    public CourseMaterial() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CourseMaterial that = (CourseMaterial) o;
        return Objects.equals(id, that.id) && Objects.equals(url, that.url) && Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, course);
    }

    @Override
    public String toString() {
        return "CourseMaterial{" + "id=" + id + ", url='" + url + '\'' + ", course=" + course + '}';
    }
}