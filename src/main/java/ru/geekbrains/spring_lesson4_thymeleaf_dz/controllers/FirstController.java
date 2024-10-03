package ru.geekbrains.spring_lesson4_thymeleaf_dz.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
