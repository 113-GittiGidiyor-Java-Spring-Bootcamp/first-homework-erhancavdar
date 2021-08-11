package dev.sms.controller;

import dev.sms.model.Student;
import dev.sms.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void save(Student student){
        if(student==null){
            System.out.println("Cannot be null.");
        }
        studentService.save(student);
    }
}
