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
        private String from_id;
        private String response_id;

        @Override
        public String toString() {
            return "{\"form_id\":\"" + from_id + "\", \"response_id\":\"" + response_id + "\"}";
        }
    }



    @PostMapping("/add")
    public void postMethodName(@RequestBody RequestForm request) {
        System.out.println(request.toString());
    }
}
