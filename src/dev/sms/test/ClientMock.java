package dev.sms.test;

import dev.sms.controller.CourseController;
import dev.sms.controller.InstructorController;
import dev.sms.controller.StudentController;
import dev.sms.model.Gender;
import dev.sms.model.Instructor;
import dev.sms.model.Student;

import java.time.LocalDate;
import java.util.List;


public class ClientMock {
    public static void main(String[] args) {
        persistStudents();


    }

    public static void persistStudents(){
     StudentController studentController = new StudentController();
        Student student = new Student("Erhan","Cavdar",LocalDate.of(1993,7,26), Gender.MALE, null);
        Student student2 = new Student("Bahri","Er",LocalDate.of(1993,7,26), Gender.MALE, null);
        Student student3 = new Student("Ayşe","Fatma",LocalDate.of(1993,7,26), Gender.MALE, null);

        studentController.save(student);
        studentController.save(student2);
        studentController.save(student3);


    }
}
