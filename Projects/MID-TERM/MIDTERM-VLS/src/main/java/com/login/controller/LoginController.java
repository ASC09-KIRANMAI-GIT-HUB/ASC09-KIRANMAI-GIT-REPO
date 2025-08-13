package com.login.controller;

import com.login.entity.LoginEntity;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginEntity login) {
        boolean isValid = loginService.validateLogin(login.getLoginId(), login.getPassword());
        return isValid ? "Login successful" : "Invalid credentials";
    }
}
