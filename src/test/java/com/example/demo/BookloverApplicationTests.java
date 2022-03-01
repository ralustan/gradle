package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootTest
@RestController
class BookloverApplicationTests {

    @Test
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Book testBook() {

        Book book = new Book();
        book.setTitle("titlu1");
        book.setAuthor("autor1");

        return book;
    }

}

