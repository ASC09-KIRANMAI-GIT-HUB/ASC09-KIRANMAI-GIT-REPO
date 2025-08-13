package com.login.controller;

import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String login(@RequestBody LoginRequest loginRequest) {
        boolean authenticated = loginService.authenticate(
                loginRequest.getLoginId(),
                loginRequest.getPassword()
        );
        return authenticated ? "Login Successful" : "Login Failed";
    }

    // DTO for request
    public static class LoginRequest {
        private String loginId;
        private String password;

        public String getLoginId() { return loginId; }
        public void setLoginId(String loginId) { this.loginId = loginId; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}
