package com.test.demo.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/form")
public class FormularioController {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class RequestForm {
        public String id;
    }



    @PostMapping("/add")
    public void postMethodName(@RequestBody RequestForm request) {
        System.out.println(request.id);
    }
}
