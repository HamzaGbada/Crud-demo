package com.crudemo.mongo.demo.repositories;

import com.crudemo.mongo.demo.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    Student findByEmail(String email);


}
