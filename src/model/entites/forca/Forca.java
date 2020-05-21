package model.entites.forca;

import java.util.Random;
import java.util.Scanner;

import model.entities.Instrucao;

public class Forca  {
	
	 private int lives = 6;
	 private String[] word = {"useradd", "groupadd", "valid-users", "systemctl", "writeable", "read-only"};
	 private int foundLetter = 0;
	
	public void forca() {
		
		Scanner sc =new Scanner(System.in);
		String input = "";
	    Random random = new Random();
		
		System.out.println("-----------------------------------MENU FORCA---------------------------");
		
		System.out.println();
		System.out.println();
		
		System.out.println("(1) Iniciar Jogo");
		System.out.println("(2) Instrucao");
		System.out.println("(3) Ranking");
		
		System.out.println();
		
		int number = sc.nextInt();
		Forca.clearScreen();
		
		switch(number) {
		case 1:	
			System.out.println("JOGO INICIADO");
			System.out.println("Informe os dados do jogador:");
			System.out.print("Name: ");
			String name  = sc.next();
			System.out.print("Nachname: ");
			String nachname  = sc.next();
			System.out.print("Spitzname: ");
			String spitzname  = sc.next();
			Spieler  spieler = new Spieler(name, nachname, spitzname);
			int indiceDaPalavra = random.nextInt(word.length);
			Forca.clearScreen();
			String guessWord = word[indiceDaPalavra];
			
			String [] hiddenWord = new String[guessWord.length()];
			
			for(int a = 0; a < hiddenWord.length; a++) {
				hiddenWord[a] = "_";
			}
			while(!input.equals("sair")) {
				for (String b : hiddenWord) {
					System.out.print(b + " ");
				}
				System.out.println("");
				System.out.println("Digite uma letra: ");
				input = sc.next();
				
				boolean hit = false;
				
				for (int i = 0; i < guessWord.length(); i++) {
					
					String caracter = Character.toString(guessWord.charAt(i));
					
					if(input.equals(caracter)) {
						hit = true;
						foundLetter++;
						hiddenWord[i] = input;
					
					if(foundLetter == guessWord.length()) {
						System.out.println("Você acertou a palavra");
						System.out.println("Parabens você ganhou " + spieler.getName());
						System.out.println("Fim do jogo");
						return;
					}
				}
			}
			if(!hit) {
				lives--;
				System.out.println("Você ainda tem " + lives + " vidas!");
			}
			if(lives == 0) {
				System.out.println("FIM DE JOGO");
				System.out.println("Você morreu!");
				
				return;
			}
				
			}
		
			
			
			break;
			
		case 2: 
			System.out.println("-----------------------------------INSTRUCAO---------------------------");
		
			Instrucao instrucao = new Instrucao();
			instrucao.instrucaoJogoDaForca();
			
			break;
			
		default:
			System.out.println("Sem jogo");
		}
		
	}

	public static void clearScreen() {
		System.out.println("\033[H\033[J");
		System.out.flush();
	}

}
