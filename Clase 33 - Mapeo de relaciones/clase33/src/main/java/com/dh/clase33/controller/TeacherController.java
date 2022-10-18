package com.dh.clase33.controller;

import com.dh.clase33.entity.Teacher;
import com.dh.clase33.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @PostMapping
    public ResponseEntity<Teacher> submitTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher.toString());
        return ResponseEntity.ok(teacherService.submitTeacher(teacher));
    }

    @GetMapping
    public ResponseEntity<List<Teacher>> listTeachers(){
        return ResponseEntity.ok(teacherService.listTeachers());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable Long id){
        if(teacherService.searchById(id) != null){
            teacherService.deleteTeacher(id);
            return ResponseEntity.ok("Se eliminó con éxito el profesor con id: "+id);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar el prof con id: "+id);
        }
    }

    @PutMapping
    public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher){
        return ResponseEntity.ok(teacherService.updateTeacher(teacher));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Teacher>> findById(@PathVariable Long id){
        return ResponseEntity.ok(teacherService.searchById(id));
    }
}
