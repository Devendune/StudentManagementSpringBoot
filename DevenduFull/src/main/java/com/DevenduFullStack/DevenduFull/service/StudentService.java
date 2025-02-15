package com.DevenduFullStack.DevenduFull.service;

import com.DevenduFullStack.DevenduFull.modal.Student;
import com.DevenduFullStack.DevenduFull.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    public StudentRepo studentRepo;


    public void saveStudent(Student student)
    {
        System.out.println("Inside save student in service call");
        studentRepo.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }

    public Student getById(int id)
    {
        return studentRepo.findById(id).get();
    }
}
