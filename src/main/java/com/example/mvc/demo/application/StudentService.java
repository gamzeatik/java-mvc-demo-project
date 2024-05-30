package com.example.mvc.demo.application;

import com.example.mvc.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student saveStudent(Student student);

    void deleteStudentById(Long id);

    Student updateStudent(Student student);
}
