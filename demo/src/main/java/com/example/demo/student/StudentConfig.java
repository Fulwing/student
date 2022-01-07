package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student daniel = new Student("Daniel", "Daniel123@gmail.com", LocalDate.of(2002, Month.JUNE, 27));

            Student amy = new Student("Amy", "amy123@gmail.com", LocalDate.of(2008, Month.NOVEMBER, 18));

            Repository.saveAll(List.of(daniel, amy));
        };
    }
}
