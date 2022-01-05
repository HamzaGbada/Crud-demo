package com.crudemo.mongo.demo;

import java.util.List;

public interface StudentService {

    List<Student> getAll();
    Student getByEmail(String email);

}
