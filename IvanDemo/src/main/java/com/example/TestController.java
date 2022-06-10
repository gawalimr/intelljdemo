package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class TestController {

    @Get("/hi/{name}")
    public String sayHi(String name){
        return "Hi from "+name;
    }
}
