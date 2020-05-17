package entities;

import entities.Enum.CurrentPlayer;

public class Ranking  {
	
	private Player player;
	private int amount;
	
	public Ranking(Player player, int amount) {
		this.player = player;
		this.amount = amount;
		
	}
	
	
	

	public int getAmount() {
		return amount;
	}




	public void setAmount(int amount) {
		this.amount = amount;
	}




	public Player getPlayer() {
		return player;
	}

	private String toString(String name, CurrentPlayer currentPlayer, ScoreRanking scoreRanking) {
		return "Nome: " 
				+ getPlayer().getName()
				+ "\n"
				+"Jogador: "
				+ getPlayer().getCurrentPlayer()
				+ "\n"
				+ "Score: "
				+ getAmount();
	}

	
}
