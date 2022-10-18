package com.dh.clase33.service;

import com.dh.clase33.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> listStudents();
    Student submitStudent(Student student);
    Optional<Student> searchById(Long id);
    void deleteStudent(Long id);
    Student updateStudent(Student student);
}
