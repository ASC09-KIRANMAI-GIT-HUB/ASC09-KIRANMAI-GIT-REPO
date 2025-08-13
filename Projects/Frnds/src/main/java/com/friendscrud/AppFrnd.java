package com.friendscrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppFrnd {
    public static void main( String[] args ) {
        System.out.println("Starting Friends APP");
        SpringApplication.run(AppFrnd.class, args);
        System.out.println("Frnds app started Successfully...");
    }
}