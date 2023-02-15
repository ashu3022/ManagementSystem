package com.studentMangementSystem.ManagementSystem.service;

import com.studentMangementSystem.ManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public void saveStudent(Student student);
    public Student getStudentById(Long id);
    public Student updateStudent(Student student);
    public void deleteStudent(Long id);
}
