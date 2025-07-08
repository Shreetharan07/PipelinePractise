package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo01Application.class, args);
		System.out.println("Hi Welcome to Spring Boot Applicattion ....!");
		System.out.println("This is updated, it is for build 2");
		System.out.println("This is updated, it is for build 3");
	}

}
