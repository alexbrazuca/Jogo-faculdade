package entities;

import entities.Enum.CurrentPlayer;

public class Ranking extends ScoreRanking implements Score  {
	
	private Player player;
	private Score score;

	public Ranking() {
	}
	
	public Ranking(Player player, Score score) {
		super();
		this.player = player;
		this.score = score;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	private String toString(String name, CurrentPlayer currentPlayer, ScoreRanking scoreRanking) {

		return "Nome: " 
				+ getPlayer().getName()
				+ "\n"
				+"Jogador: "
				+ getPlayer().getCurrentPlayer()
				+ "\n"
			
				;	
		}

	
	
}
