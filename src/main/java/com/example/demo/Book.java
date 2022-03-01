package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "book")
public class Book {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    public String title;
    public String author;
    public Book() {

    }

    public Book(Long id, String title, String author) {

        this.id = id;
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
