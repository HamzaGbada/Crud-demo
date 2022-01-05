package com.crudemo.mongo.demo.controller;

import com.crudemo.mongo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudent")
    public ResponseEntity<?> getAllStudent(){
        return ResponseEntity.ok(studentService.getAll());
    }


}
