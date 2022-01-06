package com.crudemo.mongo.demo.repositories;

import com.crudemo.mongo.demo.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByEmail(String email);
    void deleteByEmail(String email);


}
