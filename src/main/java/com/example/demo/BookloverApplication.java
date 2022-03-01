package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BookloverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookloverApplication.class, args);
    }

    @Bean
    ApplicationRunner init(BookRepository repository) {
        // Save our starter set of books
        return args -> {
            Stream.of(new Book(null, "Zece negri mititei", "Agatha Christie"), new Book(null, "Raspunsuri scurte la marile intrebari", "Stephen Hawking"),
                    new Book(null, "Tabloul", "Agatha Christie")).forEach(book -> {
                repository.save(book);
            });
            //retrieve them all, and print so that we see everything is wired up correctly
            repository.findAll().forEach(System.out::println);
        };
    }

}

