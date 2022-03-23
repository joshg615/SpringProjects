package org.JoshuaGuzman.SpringBootStudent.controller;

import org.JoshuaGuzman.SpringBootStudent.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method for list of students and return the view
    @GetMapping("/students")
    public  String listStudents(Model model){
    model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}
