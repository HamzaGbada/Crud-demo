package com.crudemo.mongo.demo.service;

import com.crudemo.mongo.demo.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();
    Student getByEmail(String email);

}
