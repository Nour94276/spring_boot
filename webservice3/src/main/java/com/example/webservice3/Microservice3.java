package com.example.webservice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;

public class Microservice3 {
    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/")
    public void method() {
        ServiceInstance serviceInstance = loadBalancer.choose("name-of-the- microservice1");
        System.out.println(serviceInstance.getUri());
    }
}
