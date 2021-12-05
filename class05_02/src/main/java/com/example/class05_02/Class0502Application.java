package com.example.class05_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class Class0502Application {

	public static void main(String[] args) {
		SpringApplication.run(Class0502Application.class, args);
	}

	@Autowired
	ISchool iSchool;

	@Bean
	public void print(){
		iSchool.ding();
	}


}
