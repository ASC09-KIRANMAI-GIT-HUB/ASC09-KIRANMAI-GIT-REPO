package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Starting Virtual Learning System...");
        SpringApplication.run(App.class, args);
        System.out.println("VLS Application started successfully!");
        System.out.println( "Hello World!" );
    }
}
