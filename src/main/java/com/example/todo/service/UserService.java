package com.example.todo.service;

<<<<<<< HEAD
import com.example.todo.model.RoleType;
import com.example.todo.model.User;
import com.example.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
import com.example.todo.model.User;
import com.example.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

<<<<<<< HEAD
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Transactional
    public void join(User user){
        String rawPassword = user.getUserpassword();
        String encPassword = encoder.encode(rawPassword);
        user.setUserpassword(encPassword);
        user.setRole(RoleType.USER);
        userRepository.save(user);
    }

=======
    @Transactional
    public void join(User user){
        userRepository.save(user);
    }

    @Transactional
    public void login(String userId, String userpassword){

    }


>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
}
