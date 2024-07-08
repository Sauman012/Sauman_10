package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    private User findById(Long userId) {
        return null;
    }

    private User findByName(String name) {
        return null;
    }

    private List<User> allUsers() {
        return null;
    }

    private void saveUser(User user) {
    }

    private boolean deleteUser(Long userId) {
        return false;
    }
}
