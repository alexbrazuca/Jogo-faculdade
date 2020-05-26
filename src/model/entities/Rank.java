package model.entities;

public class Rank implements Comparable<Rank> {

	private String name;
	private Integer score;
	
	public Rank(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public int compareTo(Rank other) {
		return -score.compareTo(other.score);
	}
	
	
	
	
}
