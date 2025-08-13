package com.login.entity;

import javax.persistence.*;

@Entity
@Table(name = "Login") // maps to dbo.Login in MSSQL
public class LoginEntity {

    @Id
    @Column(name = "loginId", nullable = false)
    private String loginId;

    @Column(name = "password", nullable = false)
    private String password;

    public LoginEntity() {}

    public LoginEntity(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
