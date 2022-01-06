package com.crudemo.mongo.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class CrudemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudemoApplication.class, args);
    }


}
