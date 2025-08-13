package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.login.entity.LoginEntity;
import com.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String login(@RequestBody LoginEntity login) {

        boolean isValid = loginService.authenticate(login.getLoginId(), login.getPassword());
        if (isValid) {
            return "Login Successful";
        } else {
            return "Invalid Login";
        }
    }
}
