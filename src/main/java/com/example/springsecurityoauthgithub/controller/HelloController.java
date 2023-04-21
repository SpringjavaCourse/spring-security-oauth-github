package com.example.springsecurityoauthgithub.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Controlador MVC
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }
}
