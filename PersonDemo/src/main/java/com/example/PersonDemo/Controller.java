package com.example.PersonDemo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    RestTemplate template;

    @GetMapping("/person")
    public List<String> getPerson(){

        List<String> messages = template.getForObject("http://localhost:8082/address", List.class);
        return messages;
    }

    @GetMapping("/address/{type}")
    public String getNativeAddress(@PathVariable String type){
        String message = "";
        if(type.equals("native")){
            message = template.getForObject("http://localhost:8082/address/native", String.class);
        }
        else{
            message = template.getForObject("http://localhost:8082/address/temporary", String.class);
        }

        return message;
    }
}
