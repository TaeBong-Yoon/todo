package com.example.todo.repository;

import com.example.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

=======
public interface UserRepository extends JpaRepository<User, Integer> {

>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
}

