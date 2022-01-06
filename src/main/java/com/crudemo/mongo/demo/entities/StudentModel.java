package com.crudemo.mongo.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentModel {

    private int CIN;
    private String name;
    private String email;
    private int phoneNumber;
}
