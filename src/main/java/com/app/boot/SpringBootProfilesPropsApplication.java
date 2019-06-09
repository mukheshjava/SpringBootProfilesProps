package com.app.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfilesPropsApplication {

	public static void main(String[] args) {
		System.out.println("This is Run() Before My Starter ......! ");
		SpringApplication.run(SpringBootProfilesPropsApplication.class, args);
		System.out.println("This is Run() After My Starter .......! ");
		}

}
