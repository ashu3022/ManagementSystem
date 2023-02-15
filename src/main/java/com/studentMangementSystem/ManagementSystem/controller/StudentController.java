package com.studentMangementSystem.ManagementSystem.controller;

import com.studentMangementSystem.ManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
          model.addAttribute("students",studentService.getAllStudents());
          return "students";

    }
}
