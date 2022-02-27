package ru.viktor.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.viktor.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
