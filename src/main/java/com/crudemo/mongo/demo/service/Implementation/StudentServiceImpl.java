// فَلَو أَنَّ ما أَسعى لِأَدنى مَعيشَةٍ **** كَفاني وَلَم أَطلُب قَليلٌ مِنَ المالِ
//وَلَكِنَّما أَسعى لِمَجدٍ مُؤَثَّلٍ **** وَقَد يُدرِكُ المَجدَ المُؤَثَّلَ أَمثالي
// امرؤ القيس
package com.crudemo.mongo.demo.service.Implementation;

import com.crudemo.mongo.demo.entities.Student;
import com.crudemo.mongo.demo.entities.StudentModel;
import com.crudemo.mongo.demo.entities.StudentUpdateModel;
import com.crudemo.mongo.demo.repositories.StudentRepository;
import com.crudemo.mongo.demo.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentModel> getAll() {
        return Arrays.asList(modelMapper.map(studentRepository.findAll(), StudentModel[].class));
    }

    @Override
    public StudentModel getByEmail(String email) {
        return modelMapper.map(studentRepository.findByEmail(email), StudentModel.class);
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
        return "Student created Successfully";
    }

    @Override
    public String updateStudent(String email, StudentUpdateModel studentModel) {
        Student student = studentRepository.findByEmail(email);
        student.setName(studentModel.getName());
        student.setPhoneNumber(studentModel.getPhoneNumber());
        student.setCIN(studentModel.getCIN());
        studentRepository.save(student);
        return "Student updated Successfully";
    }
}
