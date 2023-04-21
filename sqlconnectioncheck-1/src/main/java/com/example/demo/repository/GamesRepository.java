package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Games;
@Repository
public interface GamesRepository extends JpaRepository<Games, Integer> {

}
