package com.reksmey.demo.controllers.ui.student;

import com.reksmey.demo.Model.Student;
import com.reksmey.demo.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@Controller
public class StudentFormController {
    private StudentService studentService;

    @Autowired
    public StudentFormController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/formStudent")
    public String addStudent(ModelMap m, @ModelAttribute("student") Student student, BindingResult result){
        m.addAttribute("STU", student);
        m.addAttribute("formAdd", true);


        return "studentForm";
    }

    @PostMapping("/add")
    public String afterAdd(ModelMap m, @RequestParam("profile") MultipartFile profile, @ModelAttribute("student") @Valid Student student, BindingResult result){

        if (result.hasErrors()){
            System.out.println("error");
        }

        studentService.insertToStudent(student);
        System.out.println("insert success");
        return "redirect:/index";
     }

    @GetMapping("/update/{id}")
    public String updateStudent(Student student, @PathVariable Integer id, ModelMap m){
        System.out.println("Update");
        m.addAttribute("student", studentService.findOneStudent(id));
        m.addAttribute("formAdd", false);
        return "/studentForm";
    }
    @PostMapping("/update")
    public String update(@Valid Student student, BindingResult result, Model m){
        //@ModelAttribute for bind data with object
       //

        System.out.println("Update Submit");

        if (result.hasErrors()){
            System.out.println("error");


//            m.addAttribute("student", studentService.findOneStudent(student.getId()));
            m.addAttribute("formAdd", false);

            return "/studentForm";
        }

        studentService.updateStudent(student);

        System.out.println(student);
        System.out.println("update success");
        return "redirect:/index";

    }

    @GetMapping("/home")
    public String home(ModelMap m, Student student){
        m.addAttribute("student", studentService.findAllStudent());
        return "index";
    }

}
