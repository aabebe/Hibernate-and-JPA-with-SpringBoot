package com.springboot.basics.springbootin10steps.controller;

import com.springboot.basics.springbootin10steps.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(11,"Master Spring 5.0","Andualem Abebe"));
    }

}
