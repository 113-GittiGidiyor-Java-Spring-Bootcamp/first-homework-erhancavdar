package dev.sms.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class VisitingResearcher extends Instructor{
    private float hourlySalary;

    public VisitingResearcher() {
    }

    public VisitingResearcher(String name, long phoneNumber, List<Course> courses, float hourlySalary) {
        super(name, phoneNumber, courses);
        this.hourlySalary = hourlySalary;
    }

    public float getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(float hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }
}
