package com.example.WebServiceRest;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker
public class WebServiceExample {
    @GetMapping("/")
    public String sayHello(){
        return "Hello !";
    }
}