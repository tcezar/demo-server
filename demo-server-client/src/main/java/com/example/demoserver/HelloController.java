package com.example.demoserver;

import org.example.api.IDemoApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.ServiceLoader;

@RestController
public class HelloController {
    private IDemoApi demoApi=null;


    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        Iterator<IDemoApi> iterator = ServiceLoader.load(IDemoApi.class).iterator();
        if (iterator.hasNext()) {
            demoApi = iterator.next();
        }
        return "Hi " + name + " !\nclient\n" +
                demoApi != null ? demoApi.someMethod() : "<NaN>";

    }
}
