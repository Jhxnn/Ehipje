package com.Ehipje.models;

import java.util.UUID;

import com.Ehipje.models.enums.BattleStatus;

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
	
	@JoinColumn(referencedColumnName = "id",name = "caracter1_id")
	private Caracter caracter1;
	
	@JoinColumn(referencedColumnName = "id",name = "caracter2_id")
	private Caracter caracter2;
	
	@JoinColumn(referencedColumnName = "id",name = "winner_id")
	private Caracter winner;
	

	@JoinColumn(referencedColumnName = "id",name = "loser_id")
	private Caracter loser;
	
	private BattleStatus battleStatus;

	
	
	public BattleStatus getBattleStatus() {
		return battleStatus;
	}

	public void setBattleStatus(BattleStatus battleStatus) {
		this.battleStatus = battleStatus;
	}

	public UUID getBattleId() {
		return battleId;
	}
	
	public Caracter getLoser() {
		return loser;
	}

	public void setLoser(Caracter loser) {
		this.loser = loser;
	}

	public void setBattleId(UUID battleId) {
		this.battleId = battleId;
	}

	public Caracter getCaracter1() {
		return caracter1;
	}

	public void setCaracter1(Caracter caracter1) {
		this.caracter1 = caracter1;
	}

	public Caracter getCaracter2() {
		return caracter2;
	}

	public void setCaracter2(Caracter caracter2) {
		this.caracter2 = caracter2;
	}

	public Caracter getWinner() {
		return winner;
	}

	public void setWinner(Caracter winner) {
		this.winner = winner;
	}

	
}
