package com.login.entity;

import javax.persistence.*;

@Entity
@Table(name = "Login")  // Table name
public class LoginEntity {

    @Id
    @Column(name = "loginId")  // Column name in DB
    private String loginId;

    @Column(nullable = false)
    private String password;

    public LoginEntity() {}

    public LoginEntity(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public String getLoginId() { return loginId; }
    public void setLoginId(String loginId) { this.loginId = loginId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
