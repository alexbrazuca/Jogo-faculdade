package model.entities;

public class ReadRanking implements Comparable <ReadRanking>{

	private String name;
	private Integer score;
	
	public ReadRanking(String name, Integer score) {
		
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(ReadRanking other) {
		return -score.compareTo(other.getScore());
	}
	
	
	
}
