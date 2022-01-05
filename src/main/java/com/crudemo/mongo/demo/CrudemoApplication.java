package com.crudemo.mongo.demo;

import com.crudemo.mongo.demo.entities.Student;
import com.crudemo.mongo.demo.repositories.StudentRepository;
import com.crudemo.mongo.demo.utils.HelperUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class CrudemoApplication {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    public static void main(String[] args) {
        SpringApplication.run(CrudemoApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Bean
    CommandLineRunner runner() {
        return args -> {
            List<Student> students = studentRepository.findAll();
            if (students.size() == 0) {
                LOGGER.info("******* Inserting Student to DB *******");
                studentRepository.saveAll(HelperUtil.student.get());
            } else {
                LOGGER.info("******* Student stored in DB Size :: {}", students.size());
                LOGGER.info("******* Student stored in DB :: {}", students);
            }

        };
    }

}
