package entities;

public class ScoreRanking implements Score {

	protected int sum = 0;
	@Override
	public int score(int amount) {
		return sum += amount;
	}
	 public int getSum() {
		 return sum;
	 }
}
