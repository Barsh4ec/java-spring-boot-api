package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2004, Month.APRIL, 5)
            );
            Student taras = new Student(
                    "Taras",
                    "taras@gmail.com",
                    LocalDate.of(2004, Month.MAY, 27)
            );

            repository.saveAll(List.of(mariam, taras));
        };
    }
}
