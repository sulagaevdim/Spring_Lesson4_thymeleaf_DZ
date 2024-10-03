package ru.geekbrains.spring_lesson4_thymeleaf_dz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.spring_lesson4_thymeleaf_dz.models.User;
import ru.geekbrains.spring_lesson4_thymeleaf_dz.services.UserService;

@Controller
public class UserController {

    private UserService users;

    public UserController(UserService users) {
        this.users = users;
    }

    @GetMapping("/users")
    public String getProducts(Model model) {
        model.addAttribute("users", users.getAllUsers());
        return "users";
    }

    @GetMapping("/registration")
    public String getRegPage(){
        return "registration";
    }
    @PostMapping("/registration")
    public String regUser(User user, Model model){
        users.addUser(user);
        model.addAttribute("registration", users.getAllUsers());
        return "users";
    }
}
