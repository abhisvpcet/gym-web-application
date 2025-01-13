package com.example.gym_web_project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GymWebProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(GymWebProject1Application.class, args);
	}

}
