package dev.sms.model;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String courseCode;
    private float creditScore;
    @ManyToOne
    private Instructor instructor;

    public Course() {
    }

    public Course(String name, String courseCode, float creditScore) {
        this.name = name;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public float getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(float creditScore) {
        this.creditScore = creditScore;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}
