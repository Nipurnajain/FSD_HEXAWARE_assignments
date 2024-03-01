package com.hexaware.CodingChallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.CodingChallenge.entity.Players;

@Repository
public interface PlayerRepository extends JpaRepository<Players,Integer> {

	

	
	
}
