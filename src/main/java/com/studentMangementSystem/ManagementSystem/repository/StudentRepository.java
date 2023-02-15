package com.studentMangementSystem.ManagementSystem.repository;

import com.studentMangementSystem.ManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
