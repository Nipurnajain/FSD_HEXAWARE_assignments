package com.hexaware.CodingChallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.CodingChallenge.dto.PlayerDTO;
import com.hexaware.CodingChallenge.entity.Players;
import com.hexaware.CodingChallenge.exceptions.illegalEntryException;
import com.hexaware.CodingChallenge.services.IPlayerService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/cricket")
public class PlayerController {

	@Autowired
	IPlayerService service;
	
	@GetMapping("/getAllPlayers")
	public List<Players> getAllPlayers(){
	     return service.getAllPlayers() ;                  
	}
	
	@PostMapping("/addPlayer")
	public Players addPlayer(@RequestBody PlayerDTO playerDTO) throws illegalEntryException {
		
	           return service.addPlayer(playerDTO);
	       
		
		 
	}
    
	@GetMapping("/getPlayer-By-Id/{playerId}")
	public Players getPlayerById(@PathVariable int playerId) throws illegalEntryException {
		
		return service.getPlayerById(playerId);
		
	}

	@PutMapping("/updatePlayer")
	public Players updatePlayer(@RequestBody PlayerDTO playerDTO) {
		return service.updatePlayer(playerDTO);
		
		
	}

	@DeleteMapping("/deletePlayer-By-Id/{playerId}")
	public String deletePlayerById(@PathVariable int playerId) throws illegalEntryException {
		service.deletePlayerById(playerId);
		return "Player deleted successfully";
	}
	
}
