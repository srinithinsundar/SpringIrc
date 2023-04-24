package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SignupModel;
import com.example.demo.service.SignupService;
@RestController
public class SignupController {
@Autowired
	public SignupService cServ;
@PostMapping("/post")	
	public SignupModel addDetails(@RequestBody SignupModel sm)
	
	{
		return cServ.saveDetails(sm);
	}
	
}
