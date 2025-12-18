package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);
}
public Student getStudentById(Long id){
        return studentRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Student not found"));
    }