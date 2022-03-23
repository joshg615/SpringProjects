package org.JoshuaGuzman.SpringBootStudent.repository;

import org.JoshuaGuzman.SpringBootStudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
