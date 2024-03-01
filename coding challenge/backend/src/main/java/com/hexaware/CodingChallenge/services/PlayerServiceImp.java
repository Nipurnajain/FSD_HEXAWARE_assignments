package com.hexaware.CodingChallenge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.CodingChallenge.dto.PlayerDTO;
import com.hexaware.CodingChallenge.entity.Players;
import com.hexaware.CodingChallenge.exceptions.illegalEntryException;
import com.hexaware.CodingChallenge.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository repo;

	@Override
	public List<Players> getAllPlayers() {

		return repo.findAll();
	}

	@Override
	public Players addPlayer(PlayerDTO playerDTO) throws illegalEntryException {

		if (isValid(playerDTO)) {
			Players players = new Players();
			players.setPlayerId(playerDTO.getPlayerId());
			players.setPlayerName(playerDTO.getPlayerName());
			players.setJerseyNumber(playerDTO.getJerseyNumber());
			players.setRole(playerDTO.getRole());
			players.setRole(playerDTO.getRole());
			players.setTotalMatches(playerDTO.getTotalMatches());
			players.setTeamName(playerDTO.getTeamName());
			players.setTeamCountry(playerDTO.getTeamCountry());
			players.setDescription(playerDTO.getDescription());

			return repo.save(players);
		} else {
			throw new illegalEntryException();
		}

		
	}

	@Override
	public Players getPlayerById(int playerId) throws illegalEntryException {

		return repo.findById(playerId).orElseThrow(illegalEntryException::new); // ()->new playerNotFoundException
	}

	@Override
	public Players updatePlayer(PlayerDTO playerDTO) {

		
		Players players = new Players();
			players.setPlayerName(playerDTO.getPlayerName());
			players.setJerseyNumber(playerDTO.getJerseyNumber());
			players.setRole(playerDTO.getRole());
			players.setTotalMatches(playerDTO.getTotalMatches());
			players.setTeamName(playerDTO.getTeamName());
			players.setTeamCountry(playerDTO.getTeamCountry());
			players.setDescription(playerDTO.getDescription());

			return repo.save(players);
	}

	@Override
	public String deletePlayerById(int playerId) throws illegalEntryException {
		if (repo.existsById(playerId)) {
			repo.deleteById(playerId);
			return "Player deleted successfully";
		} else {
			throw new illegalEntryException();
		}
	}

	public boolean isValid(PlayerDTO playerDTO) {
		boolean flag = true;
		if (flag) {
			return playerDTO.getPlayerName().equals(playerDTO.getPlayerName().toUpperCase())
					&& playerDTO.getJerseyNumber() >= 100 && (playerDTO.getRole().equals("Batsman")
							|| playerDTO.getRole().equals("Bowler") || playerDTO.getRole().equals("Allrounder"));
		} else {
			return false;
		}
	}

}
