package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SignupModel;

public interface SignupReposittory extends JpaRepository<SignupModel, Integer> {

}
