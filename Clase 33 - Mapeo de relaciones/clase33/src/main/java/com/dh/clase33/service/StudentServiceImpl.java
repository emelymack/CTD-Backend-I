package com.dh.clase33.service;

import com.dh.clase33.entity.Student;
import com.dh.clase33.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student submitStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> searchById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
