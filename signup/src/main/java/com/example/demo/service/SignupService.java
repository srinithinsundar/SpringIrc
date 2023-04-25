package com.example.demo.service;

import java.util.List;


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
public List<SignupModel> getDetails()
{
	return crepo.findAll();
}
public SignupModel updateDetails(SignupModel sM) {
	return crepo.saveAndFlush(sM);
}
public void deleteDetails(int id) {
	crepo.deleteById(id);
	
}

}
