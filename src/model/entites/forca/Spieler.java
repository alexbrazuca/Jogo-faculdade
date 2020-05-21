package model.entites.forca;

public class Spieler {
	
	private String name;
	private String nachName;
	private String spitzname;
	
	public Spieler(String name, String nachName, String spitzname) {
		super();
		this.name = name;
		this.nachName = nachName;
		this.spitzname = spitzname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public String getSpitzname() {
		return spitzname;
	}

	public void setSpitzname(String spitzname) {
		this.spitzname = spitzname;
	}
	
	
	

}
