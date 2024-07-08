package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public User findById(Long userId);

    public User findByName(String name);

    public List<User> allUsers();

    public void saveUser(User user);

    public boolean deleteUser(Long userId);
}
