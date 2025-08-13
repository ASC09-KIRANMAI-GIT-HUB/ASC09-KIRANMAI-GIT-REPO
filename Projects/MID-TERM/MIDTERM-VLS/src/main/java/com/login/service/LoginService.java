package com.login.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.login.entity.LoginEntity;
import com.login.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepo;

    public boolean authenticate(String loginId, String password) {
        LoginEntity user = loginRepo.findByLoginIdAndPassword(loginId, password);
        return user != null;
    }
}
