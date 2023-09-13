package com.abu.RestApidemo.ontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

       //http:
       @GetMapping("/HelloWorld")
       public  String helloWorld(){
           return "Hello world";
    }
}
