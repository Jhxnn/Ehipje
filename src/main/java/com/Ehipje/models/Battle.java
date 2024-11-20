package com.Ehipje.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "battles")
public class Battle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID battleId;
	
	@JoinColumn(referencedColumnName = "id",name = "player1_id")
	private Player player1;
	
	@JoinColumn(referencedColumnName = "id",name = "player2_id")
	private Player player2;
	
	@JoinColumn(referencedColumnName = "id",name = "winner_id")
	private Player winner;

	public UUID getBattleId() {
		return battleId;
	}

	public void setBattleId(UUID battleId) {
		this.battleId = battleId;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}
	
	
}
