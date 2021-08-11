package dev.sms.test;

import dev.sms.controller.StudentController;
import dev.sms.model.Gender;
import dev.sms.model.Student;

import java.time.LocalDate;
import java.util.Date;

public class ClientMock {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student = new Student("Erhan","Cavdar",LocalDate.of(1993,7,26), Gender.MALE, null);
        studentController.save(student);

    }
}
