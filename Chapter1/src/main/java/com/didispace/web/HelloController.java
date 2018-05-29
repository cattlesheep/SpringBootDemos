package com.didispace.web;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    @RequestMapping("/")
    public String index1(){return "hello Springboot!";}

    public static void main(String... agrs){
        SpringApplication.run(HelloController.class,agrs);
    }

}
