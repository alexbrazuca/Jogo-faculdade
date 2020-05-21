package application;


import java.io.IOException;
import java.util.Scanner;

import model.entites.forca.Forca;
import model.entities.Menu;

public class Game {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Forca forca = new Forca();
		
		System.out.println("Escolha o jogo que deseja jogar");
		System.out.println("(1) QUIZ");
		System.out.println("(2) FORCA");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			menu.menu();
			break;
		case 2:
			forca.forca();
			break;
		default:
			System.out.println("Não jogar");
		}
		
			
		
		sc.close();
	}

}
