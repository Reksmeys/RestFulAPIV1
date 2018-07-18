package com.reksmey.demo.controllers.rest;

import com.reksmey.demo.Model.Student;
import com.reksmey.demo.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("student")
    public List<Student> studentList(){
        return studentService.findAllStudent();
    }
    @PostMapping("/add")
    public boolean insertStudent(@RequestBody Student student){
        boolean insert = studentService.insertToStudent(student);
        System.out.println("insert success");
        return insert;
    }

    @GetMapping("/student/{id}")
    public Student findOneStudent(@PathVariable("id") Integer id){
        return studentService.findOneStudent(id);
    }

    @PutMapping("/update")
    public boolean updateStudent(Student student){
        return studentService.updateStudent(student);
    }
}
