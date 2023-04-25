package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
@GetMapping("/get")
	public List<SignupModel>getDetails()
	{
	return cServ.getDetails();
	}
@PutMapping("/put")
	public SignupModel updateDetails(@RequestBody SignupModel SM)
	{
		return cServ.updateDetails(SM);
	}
@DeleteMapping("/delete/{id}")
	public String deleteDetail(@PathVariable("id")int SM)
	{
		cServ.deleteDetails(SM);
		return "deleted";
	}
@DeleteMapping("/deleted")
public String deleteBypara(@RequestParam("id")int SM)
{
	cServ.deleteDetails(SM);
	return SM+" is deleted";
}
	
}
