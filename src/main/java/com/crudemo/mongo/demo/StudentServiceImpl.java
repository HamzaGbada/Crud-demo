package com.crudemo.mongo.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}
