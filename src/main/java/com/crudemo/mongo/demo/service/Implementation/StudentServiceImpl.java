package com.crudemo.mongo.demo.service.Implementation;

import com.crudemo.mongo.demo.entities.Student;
import com.crudemo.mongo.demo.entities.StudentModel;
import com.crudemo.mongo.demo.repositories.StudentRepository;
import com.crudemo.mongo.demo.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private ModelMapper modelMapper;

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

    @Override
    public String deleteByEmail(String email) {
        studentRepository.deleteByEmail(email);
        return "Student deleted Successfully";
    }

    @Override
    public String createStudent(StudentModel studentModel) {
        Student student = modelMapper.map(studentModel, Student.class);
        studentRepository.save(student);
        return "Student Created Successfully";
    }
}
