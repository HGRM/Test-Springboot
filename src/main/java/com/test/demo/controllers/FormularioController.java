package com.test.demo.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.controllers.restful.request.FormRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/form")
public class FormularioController {
    @PostMapping("/set-data")
    public void postMethodName(@RequestBody FormRequest request) {
        System.out.println(request.toString());
    }

    @PostMapping("/url")
    public void postMethodName(@RequestBody String url) {
        System.out.println(url);
    }
}
