package com.dockerproject.dockerdemopractice.dockercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDocker {
    @GetMapping(value = "/docker")
    public String Helloworld(){
        System.out.println("kirananna");
        return "Hi";
    }

}
