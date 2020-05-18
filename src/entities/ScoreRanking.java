package entities;

public class ScoreRanking implements Score {

	private int sum = 0;
	@Override
	public int score(int amount) {
		return sum += amount;
	}
	
}
