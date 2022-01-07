// فَلَو أَنَّ ما أَسعى لِأَدنى مَعيشَةٍ **** كَفاني وَلَم أَطلُب قَليلٌ مِنَ المالِ
//وَلَكِنَّما أَسعى لِمَجدٍ مُؤَثَّلٍ **** وَقَد يُدرِكُ المَجدَ المُؤَثَّلَ أَمثالي
// امرؤ القيس
package com.crudemo.mongo.demo.controller;

import com.crudemo.mongo.demo.entities.StudentModel;
import com.crudemo.mongo.demo.entities.StudentUpdateModel;
import com.crudemo.mongo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudent")
    public ResponseEntity<?> getAllStudent(){
        return ResponseEntity.ok(studentService.getAll());
    }

    @GetMapping("/getStudentByEmail/{email}")
    public ResponseEntity<?> getStudentByEmail(@PathVariable String email){
        return ResponseEntity.ok(studentService.getByEmail(email));
    }

    @DeleteMapping("/deleteByEmail/{email}")
    public ResponseEntity<?> deleteByEmail(@PathVariable String email){
        return ResponseEntity.ok(studentService.deleteByEmail(email));
    }

    @PostMapping("/CreateStudent")
    public ResponseEntity<?> createStudent(@RequestBody StudentModel studentModel){
        return ResponseEntity.ok(studentService.createStudent(studentModel));
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<?> updateStudent(@RequestParam String email, @RequestBody StudentUpdateModel studentModel){
        return ResponseEntity.ok(studentService.updateStudent(email, studentModel));
    }



}
