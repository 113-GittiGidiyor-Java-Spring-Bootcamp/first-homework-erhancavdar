package dev.sms.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany
    private Set<Course> courses;

    public Student() {
    }

    public Student(String name, String address, LocalDate birthday, Gender gender, Set<Course> courses) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", courses=" + courses +
                '}';
    }
}

