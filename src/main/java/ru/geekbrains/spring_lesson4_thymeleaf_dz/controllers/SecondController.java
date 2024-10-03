package ru.geekbrains.spring_lesson4_thymeleaf_dz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SecondController {
    @GetMapping("/sum")
    public String getSumPage(){
        return "sumStart";
    }

    @GetMapping("/sum/{firstNumber}/{secondNumber}")
    public String sumNumbers(@PathVariable ("firstNumber") int firstNumber,
                             @PathVariable ("secondNumber") int secondNumber,
                             Model model){
        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("secondNumber", secondNumber);
        model.addAttribute("sum", firstNumber + secondNumber);
        return "sum";
    }

}
