package com.example.todo.controller.api;

import com.example.todo.model.User;
import com.example.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d

@Controller
public class UserApiController {

    @Autowired
    private UserService userService;

<<<<<<< HEAD
    @PostMapping("/auth/joinProc")
    public void userJoin(@RequestBody User user){
        userService.join(user);
    }

=======
    @PostMapping("/api/user/join")
    public void userJoin(User user){
        userService.join(user);
    }

    @PostMapping("/api/user/login")
    public void userLogin(User user) {
        //userService.login(user);
    }
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
}
