package com.login.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.login.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, String> {
    LoginEntity findByLoginIdAndPassword(String loginId, String password);
}
