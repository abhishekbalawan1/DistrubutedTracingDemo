package com.example.NativeAddressDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/native")
    public String getNativeAddress(){
        return "This is native address";
    }
}
