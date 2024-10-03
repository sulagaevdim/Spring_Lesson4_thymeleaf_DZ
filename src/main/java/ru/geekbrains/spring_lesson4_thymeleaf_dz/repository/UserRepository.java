package ru.geekbrains.spring_lesson4_thymeleaf_dz.repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring_lesson4_thymeleaf_dz.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> userRepository = new ArrayList<>();

    public List<User> getUsers(){
        return userRepository;
    }

    public void addUser(User user){
        userRepository.add(user);
    }

}
