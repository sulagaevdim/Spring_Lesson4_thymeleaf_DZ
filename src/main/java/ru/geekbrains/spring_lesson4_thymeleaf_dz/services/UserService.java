package ru.geekbrains.spring_lesson4_thymeleaf_dz.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.spring_lesson4_thymeleaf_dz.models.User;
import ru.geekbrains.spring_lesson4_thymeleaf_dz.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers(){
        return repository.getUsers();
    }
    public void addUser(User user){
        user.setId(repository.getUsers().size() + 1);
        repository.addUser(user);
    }
}
