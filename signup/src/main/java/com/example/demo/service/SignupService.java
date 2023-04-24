package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SignupModel;
import com.example.demo.repository.SignupReposittory;

@Service
public class SignupService {
	@Autowired
	public SignupReposittory crepo;
	public SignupModel saveDetails(SignupModel d)
	{
		return crepo.save(d);
	}

}
