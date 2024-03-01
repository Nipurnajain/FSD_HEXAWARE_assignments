package com.hexaware.CodingChallenge.services;

import java.util.List;

import com.hexaware.CodingChallenge.dto.PlayerDTO;
import com.hexaware.CodingChallenge.entity.Players;
import com.hexaware.CodingChallenge.exceptions.illegalEntryException;

public interface IPlayerService {

	public List<Players> getAllPlayers();

	public Players addPlayer(PlayerDTO playerDTO) throws illegalEntryException ;

	public Players getPlayerById (int playerId)throws illegalEntryException;

	public Players updatePlayer(PlayerDTO playerDTO);

	public String deletePlayerById(int playerId)throws illegalEntryException;
	
	
}
