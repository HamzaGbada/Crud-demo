package com.crudemo.mongo.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    Student findByEmail(String email);


}
