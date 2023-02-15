package com.studentMangementSystem.ManagementSystem.service;

import com.studentMangementSystem.ManagementSystem.entity.Student;
import com.studentMangementSystem.ManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
