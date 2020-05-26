package model.entities;

public class InfoCriador {
	
	private String info = "Nome: Alex Nascimento Silva\n"
			+ "Idade: 32 anos\n"
			+ "Email: alexbrazuca@live.com\n"
			+ "Referecias: Aulas Professor Leandro Palha,\n"
			+ "Udemy Java COMPLETO 2020 Programacao Orientada a Objetos +Projetos";

	public void info() {
		System.out.print(getInfo());
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
