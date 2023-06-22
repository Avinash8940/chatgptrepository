package com.chatApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chatApp.controller.ChatController;

@SpringBootApplication
public class Application {
	
	@Autowired
	ChatController controller;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
