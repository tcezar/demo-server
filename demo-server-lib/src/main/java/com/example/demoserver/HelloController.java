package com.example.demoserver;

import org.example.api.IDemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IDemoApi demoApi;

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {

        return "Hi " + name + " !\n" + demoApi.someMethod();

    }
}
