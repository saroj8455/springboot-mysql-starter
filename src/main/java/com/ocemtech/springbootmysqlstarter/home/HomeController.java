package com.ocemtech.springbootmysqlstarter.home;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/addcat")
    public ResponseEntity<Cats> addCat() {

        Cats c = new Cats();
        c.setName("JK");
        c.setOwner("Deo");
        c.setBirth("2001-02-03");
        return new ResponseEntity<Cats>(catRepository.save(c),HttpStatus.CREATED);
    }
}
