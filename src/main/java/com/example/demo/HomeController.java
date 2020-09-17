package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    BookRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("books")
    public List<Book> books() {
        return repository.findAll();
    }
}
