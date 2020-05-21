package model.entites.forca;

import java.util.Random;
import java.util.Scanner;

import model.entities.Instrucao;

public class Forca  {
	
	 private int vidas = 6;
	 private String[] palavras = {"useradd", "groupadd", "valid-users", "systemctl", "writeable", "read-only"};
	 private int letrasAcertadas = 0;
	
	public void forca() {
		
		Scanner sc =new Scanner(System.in);
		String inputDoUsuario = "";
	    Random random = new Random();
		
		System.out.println("-----------------------------------MENU FORCA---------------------------");
		
		System.out.println();
		System.out.println();
		
		System.out.println("(1) Iniciar Jogo");
		System.out.println("(2) Instrucao");
		System.out.println("(3) Ranking");
		
		System.out.println();
		
		int number = sc.nextInt();
		
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
			Spieler  splieler = new Spieler(name, nachname, spitzname);
			int indiceDaPalavra = random.nextInt(palavras.length);
			String palavraParaAdvinhar = palavras[indiceDaPalavra];
			
			String [] palavraEscondida = new String[palavraParaAdvinhar.length()];
			
			for(int a = 0; a < palavraEscondida.length; a++) {
				palavraEscondida[a] = "_";
			}
			while(!inputDoUsuario.equals("sair")) {
				for (String b : palavraEscondida) {
					System.out.print(b + " ");
				}
				System.out.println("");
				System.out.println("Digite uma letra: ");
				inputDoUsuario = sc.next();
				
				boolean acertou = false;
				
				for (int i = 0; i < palavraParaAdvinhar.length(); i++) {
					
					String caracter = Character.toString(palavraParaAdvinhar.charAt(i));
					
					if(inputDoUsuario.equals(caracter)) {
						acertou = true;
						letrasAcertadas++;
						palavraEscondida[i] = inputDoUsuario;
					
					if(letrasAcertadas == palavraParaAdvinhar.length()) {
						System.out.println("Você acertou a palavra");
						System.out.println("Fim do jogo");
						break;
					}
				}
			}
			if(!acertou) {
				vidas--;
				System.out.println("Você ainda tem " + vidas + " vidas!");
			}
			if(vidas == 0) {
				System.out.println("Você morreu!");
				break;
			}
				
			}
		
			
			
			break;
			
		case 2: 
			System.out.println("-----------------------------------INSTRUCAO---------------------------");
		
			Instrucao instrucao = new Instrucao();
			instrucao.instrucaoJogoDaForca();
			
			break;
			
		case 3:
			System.out.println("Ranking");
		}
	}

}
