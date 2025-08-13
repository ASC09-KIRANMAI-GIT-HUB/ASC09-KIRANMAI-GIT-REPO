package com.login.service.impl;

import com.login.entity.LoginEntity;
import com.login.repository.LoginRepository;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public boolean validateLogin(String loginId, String password) {
        Optional<LoginEntity> loginOpt = loginRepository.findById(loginId);
        if (!loginOpt.isPresent()) return false; // User not found
        return loginOpt.get().getPassword().equals(password);
    }
}
