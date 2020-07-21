package com.example.todo.controller;

<<<<<<< HEAD
import com.example.todo.config.auth.PrincipalDetail;
import com.example.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
=======
import com.example.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"", "/"})
    public String index() {
        return "index";
    }

<<<<<<< HEAD
    @GetMapping("/auth/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/auth/loginForm")
    public String loginFrom() {
        return "user/loginForm";
    }

=======
    @GetMapping("/join")
    public String joinForm() {
        return "joinForm";
    }

    @GetMapping("/login")
    public String loginFrom() {
        return "loginForm";
    }

    @GetMapping("/userInfo")
    public String userInfo() {
        return "userInfo";
    }
>>>>>>> 73fb659fd8c0a4904a88df10b4c440c67afe078d
}
