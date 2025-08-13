package com.login.service;

import com.login.entity.LoginEntity;
import com.login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository userRepository;

    @Autowired
    public LoginServiceImpl(LoginRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean authenticate(String loginId, String password) {
        LoginEntity user = userRepository.findByLoginId(loginId);
        return user != null && user.getPassword().equals(password);
    }
}
