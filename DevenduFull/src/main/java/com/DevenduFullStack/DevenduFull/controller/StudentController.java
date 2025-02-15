package com.DevenduFullStack.DevenduFull.controller;

import com.DevenduFullStack.DevenduFull.modal.Student;
import com.DevenduFullStack.DevenduFull.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController
{
    @Autowired
    private StudentService studentservice;


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
        studentservice.saveStudent(student);
        return "student saved successfully";
    }

    @GetMapping("/getAll")
    public List<Student> getAll()
    {
        return studentservice.getAllStudents();
    }

    @GetMapping("getById/{id}")
    public Student getById(@PathVariable int id)
    {
        return studentservice.getById(id);
    }
}
