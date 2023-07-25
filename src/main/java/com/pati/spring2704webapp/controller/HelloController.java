package com.pati.spring2704webapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HelloController {
@GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name")String name){
        return "Hello "+name;
    }
}
