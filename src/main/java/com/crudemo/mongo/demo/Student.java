package com.crudemo.mongo.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {

    @Id
    private String id;

    private int studentId;
    private String name;
    private String email;
    private int phoneNumber;

}
