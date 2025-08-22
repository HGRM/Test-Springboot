package com.test.demo.controllers.restful.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormRequest {
    private String from_id;
    private String response_id;


    
    @Override
    public String toString() {
        return "{\"form_id\":\"" + from_id + "\", \"response_id\":\"" + response_id + "\"}";
    }
}
