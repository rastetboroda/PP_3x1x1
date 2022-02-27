package ru.viktor.springboot.service;



import ru.viktor.springboot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    User getUserById(int id);

    List<User> getUsers();
}