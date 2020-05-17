package entities;

public class ScoreRanking implements Score {

	@Override
	public int score(int amount) {
		return amount += amount;
	}
	
}
