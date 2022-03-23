package org.JoshuaGuzman.SpringBootStudent.service.impl;

import org.JoshuaGuzman.SpringBootStudent.entity.Student;
import org.JoshuaGuzman.SpringBootStudent.repository.StudentRepository;
import org.JoshuaGuzman.SpringBootStudent.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
