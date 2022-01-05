package com.crudemo.mongo.demo.service.Implementation;

import com.crudemo.mongo.demo.entities.Student;
import com.crudemo.mongo.demo.repositories.StudentRepository;
import com.crudemo.mongo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByEmail(String email) {
        Student s = studentRepository.findByEmail(email);
        return studentRepository.findByEmail(email);
    }
}
