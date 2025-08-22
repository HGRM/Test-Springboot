package com.test.demo.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Test {

    @GetMapping("/hello")
    public Stirng sayHello(){
        return "Hola";
    }
}
