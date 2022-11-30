package com.example.TemporaryAddressDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/temporary")
    public String getTemporaryAddress(){
        return "This is temporary address";
    }

}
