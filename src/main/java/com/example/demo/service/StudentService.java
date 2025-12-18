package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.exception.ResourceNotFoundException;

public interface StudentService {

    Student saveStudent(Student student);
    public Student getStudentById(Long id){
        return studentRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Student not found"));
    }
}
