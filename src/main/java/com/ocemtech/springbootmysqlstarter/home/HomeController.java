package com.ocemtech.springbootmysqlstarter.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private  CatRepository catRepository;

    @RequestMapping
    public String index() {
        return "Hello World App Spring Boot Mysql Starter";
    }

    @RequestMapping("home")
    public ResponseEntity<Iterable<Cats>> home() {
        return new ResponseEntity<Iterable<Cats>>(catRepository.findAll(), HttpStatus.OK);
    }
}
