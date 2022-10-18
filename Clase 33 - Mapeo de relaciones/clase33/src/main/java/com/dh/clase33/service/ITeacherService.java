package com.dh.clase33.service;

import com.dh.clase33.entity.Teacher;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {
    List<Teacher> listTeachers();
    Teacher submitTeacher(Teacher teacher);
    Optional<Teacher> searchById(Long id);
    void deleteTeacher(Long id);
    Teacher updateTeacher(Teacher teacher);
}
