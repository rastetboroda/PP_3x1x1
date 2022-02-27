package ru.viktor.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.viktor.springboot.dao.UserRepository;
import ru.viktor.springboot.model.User;


import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) { userRepository.deleteById(id); }

    @Override
    public User getUserById(int id) {
        User user = null;
        Optional<User> optional = userRepository.findById(id);

        if(optional.isPresent()){
            user = optional.get();
        }
        return user;
    }

    @Override
    public List<User> getUsers() {

        return  userRepository.findAll();
    }
}
