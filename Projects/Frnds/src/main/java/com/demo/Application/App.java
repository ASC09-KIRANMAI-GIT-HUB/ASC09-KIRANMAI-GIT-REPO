package com.demo.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        System.out.println("Starting Friends APP");
        SpringApplication.run(App.class, args);
        System.out.println("Frnds app started Successfully...");
    }
}