package com.example.AddressDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    RestTemplate template;

    @GetMapping("/address")
    public List<String> getAddress(){
        List<String> list = new LinkedList<>();
        String message1 = template.getForObject("http://localhost:8082/address/native", String.class);
        String message2 = template.getForObject("http://localhost:8082/address/temporary", String.class);
        list.add(message1);
        list.add(message2);
        return list;
    }

    @GetMapping("/address/native")
    public String getNativeAddress(){
        String message = template.getForObject("http://localhost:8083/native", String.class);
        return message;
    }

    @GetMapping("/address/temporary")
    public String getTemporaryAddress(){
        String message = template.getForObject("http://localhost:8084/temporary", String.class);
        return message;
    }
}
