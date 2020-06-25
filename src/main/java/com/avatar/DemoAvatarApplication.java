package com.avatar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.avatar.service.PeliculaService;

@SpringBootApplication
public class DemoAvatarApplication {

	@Autowired
	PeliculaService peliculaService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoAvatarApplication.class, args);	
				
	}

}

