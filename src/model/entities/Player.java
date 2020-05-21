package model.entities;

import model.entities.Enum.CurrentPlayer;

public class Player {

	private String name;
	private String secondName;
	private String apelido;
	private CurrentPlayer currentPlayer;
	
	public Player(String name, String secondName, String apelido, CurrentPlayer currentPlayer) {
		this.name = name;
		this.secondName = secondName;
		this.apelido = apelido;
		this.currentPlayer = currentPlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public CurrentPlayer getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(CurrentPlayer currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	
	
}
