package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Games;
import com.example.demo.repository.GamesRepository;

@RestController
@RequestMapping("/api/games")
public class GamesController {
@Autowired
	private GamesRepository gameRepo;
	
@GetMapping
	public List<Games> getGames(){
	return this.gameRepo.findAll();
}
@PostMapping
	public Games addGames(@RequestBody Games data) {
	return this.gameRepo.save(data);
}
}
