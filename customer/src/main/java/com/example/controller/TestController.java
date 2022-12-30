package com.example.controller;

import com.example.Interface.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dubbo")
@RestController
public class TestController {
    @Reference
    private TestService service;

    @PostMapping("/test")
    public String Test(String data){
        return service.test(data);
    }
}
