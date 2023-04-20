package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day21Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day21Application.class, args);
		
		Program2 s=new Program2(1,"Sri",20);
		ObjectMapper obj =new ObjectMapper();
		String str=obj.writeValueAsString(s);
		System.out.println(str);
	}

}
