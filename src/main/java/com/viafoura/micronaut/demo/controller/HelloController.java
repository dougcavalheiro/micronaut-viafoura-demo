package com.viafoura.micronaut.demo.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get(uri="/{name}", produces=MediaType.TEXT_PLAIN)
    String hello(String name) {
        return "Hello " + name;
    }
}
