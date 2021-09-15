package com.example.simplemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMicroserviceApplication.class, args);
    }

    @GetMapping("/api/v1/hello")
    public String helloWorls(){
        return "Hello World!! Awesome";
    }

}
