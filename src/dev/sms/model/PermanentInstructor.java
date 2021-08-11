package dev.sms.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class PermanentInstructor extends Instructor {
    private float fixedSalary;

    public PermanentInstructor() {
    }
    public PermanentInstructor(String name, long phoneNumber, List<Course> courses, float fixedSalary) {
        super(name, phoneNumber, courses);
        this.fixedSalary = fixedSalary;
    }

    public float getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(float fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }
}
