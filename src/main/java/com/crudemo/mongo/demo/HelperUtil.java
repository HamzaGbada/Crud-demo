package com.crudemo.mongo.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class HelperUtil {

    private HelperUtil() {
    }


    public static Supplier<List<Student>> student = () ->
            Arrays.asList(
                    Student.builder().studentId(1).name("Bob").email("bob@gmail.com").phoneNumber(123456789).build(),
                    Student.builder().studentId(2).name("samir").email("samir@gmail.com").phoneNumber(987654321).build()
            );


}
