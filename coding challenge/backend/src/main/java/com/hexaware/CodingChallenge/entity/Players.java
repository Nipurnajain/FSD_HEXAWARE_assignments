package com.hexaware.CodingChallenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Players {

	@Id
	private int playerId;

	@NotNull
	@Size(max = 100)
	private String playerName;
	
	@Min(1)
	private int jerseyNumber;
	
	@NotNull
	private String role;
	
	@Min(0)
	private int totalMatches;
	
	@NotNull
    @Size(max = 50)
	private String teamName;
	
	@NotNull
    @Size(min = 2, max = 50)
	private String teamCountry;
	
	@Size(max = 300)
	private String description;

	public Players() {
		super();
	}

	public Players(int playerId, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String teamCountry, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.teamCountry = teamCountry;
		this.description = description;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCountry() {
		return teamCountry;
	}

	public void setTeamCountry(String teamCountry) {
		this.teamCountry = teamCountry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
