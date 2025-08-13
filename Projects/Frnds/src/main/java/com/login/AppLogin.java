package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLogin {
    public static void main( String[] args ) {
        System.out.println("Starting Login App");
        SpringApplication.run(AppLogin.class, args);
        System.out.println("Login app started Successfully...");
    }
}
