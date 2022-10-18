package com.dh.clase33.controller;

import com.dh.clase33.entity.Student;
import com.dh.clase33.entity.Teacher;
import com.dh.clase33.service.IStudentService;
import com.dh.clase33.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping
    public ResponseEntity<Student> submitStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return ResponseEntity.ok(studentService.submitStudent(student));
    }

    @GetMapping
    public ResponseEntity<List<Student>> listStudents(){
        return ResponseEntity.ok(studentService.listStudents());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        if(studentService.searchById(id) != null){
            studentService.deleteStudent(id);
            return ResponseEntity.ok("Se eliminó con éxito el estudiante con id: "+id);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar el estudiante con id: "+id);
        }
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.updateStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.searchById(id));
    }

}
