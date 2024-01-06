package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    LocalDate.of(1997, 1, 1),
                    "john.doe@gmai.com"
            );

            Student jane = new Student(
                    "Jane",
                    LocalDate.of(2000, 1, 2),
                    "jane.doe@gmai.com"
            );

            studentRepository.saveAll(List.of(john, jane));
        };
    }
}
