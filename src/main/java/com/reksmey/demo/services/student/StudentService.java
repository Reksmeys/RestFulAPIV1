package com.reksmey.demo.services.student;

import com.reksmey.demo.Model.Student;
import com.reksmey.demo.repositories.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAllStudent(){
        return studentRepository.findAllStudent();
    }

    public Student findOneStudent(int id){
        return studentRepository.findOneStudent(id);
    }

    public boolean insertToStudent(Student student){
        return studentRepository.insertToStudent(student);
    }

    public boolean updateStudent(Student student){
        return studentRepository.updateStudent(student);
    }
}
