package com.rajatngc.searchwithease.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api")
public class DemoResource {

    @GetMapping( "/hello")
    public String hello() {
        return "Hello World";
    }

}
