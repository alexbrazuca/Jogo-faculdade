package entities;

import entities.Enum.CurrentPlayer;

public class Ranking extends Player{

	private ScoreRanking scoreRanking;
	
	public Ranking(String name, String secondName, String apelido, CurrentPlayer currentPlayer, ScoreRanking scoreRanking) {
		super(name, secondName, apelido, currentPlayer);
		this.scoreRanking = scoreRanking;
	}

	public ScoreRanking getScoreRanking() {
		return scoreRanking;
	}

	private String toString(String name, ScoreRanking scoreRanking) {
		return "Nome: " 
				+ getName()
				+ "\nScore: "
				+ getScoreRanking();
	}
}
