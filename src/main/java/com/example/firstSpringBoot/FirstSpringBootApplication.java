package com.example.firstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
