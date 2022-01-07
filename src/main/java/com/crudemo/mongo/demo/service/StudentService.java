// فَلَو أَنَّ ما أَسعى لِأَدنى مَعيشَةٍ **** كَفاني وَلَم أَطلُب قَليلٌ مِنَ المالِ
//وَلَكِنَّما أَسعى لِمَجدٍ مُؤَثَّلٍ **** وَقَد يُدرِكُ المَجدَ المُؤَثَّلَ أَمثالي
// امرؤ القيس
package com.crudemo.mongo.demo.service;

import com.crudemo.mongo.demo.entities.Student;
import com.crudemo.mongo.demo.entities.StudentModel;
import com.crudemo.mongo.demo.entities.StudentUpdateModel;

import java.util.List;

public interface StudentService {

    List<StudentModel> getAll();
    StudentModel getByEmail(String email);
    String deleteByEmail(String email);
    String createStudent(StudentModel studentModel);
    String updateStudent(String email, StudentUpdateModel studentModel);

}
