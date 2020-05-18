package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Instrucao;
import entities.Player;
import entities.Ranking;
import entities.ScoreRanking;
import entities.Enum.CurrentPlayer;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	int[] rightAnswer = new int[] {4,3,1,1,4,4,1,2,1};
	int[] answer = new int[rightAnswer.length];
	int amount = 0;
	int sum = 0;
	ScoreRanking scoreRanking = new ScoreRanking();
	
	String input;
	
	private int turn = 1;
	
	private List<Ranking> ranking = new ArrayList<>();
	
	private List<Player> playerList = new ArrayList<>();
	
	private CurrentPlayer currentPlayer;
	
	private List<String>lista =  new ArrayList<>();
	
	public void menu() {
		
		
		lista.add(pergunta1);
		lista.add(pergunta2);
		lista.add(pergunta3);
		lista.add(pergunta4);
		lista.add(pergunta5);
		lista.add(pergunta6);
		lista.add(pergunta7);
		lista.add(pergunta8);
		lista.add(pergunta9);
		
		
		
		System.out.println("---------------------------MENU---------------------------");
		
		System.out.println();
		System.out.println();
		
		System.out.println("(1) Iniciar Jogo");
		System.out.println("(2) Instru��es");
		System.out.println("(3) Ranking");
		
		int choice = sc.nextInt();
		while(choice<1 || choice>3) {
			choice = sc.nextInt();
		}
		switch (choice) {
			case 1:
				System.out.println("JOGO INICIADO");
				
					System.out.print("Numero de jogadores: ");
					int number = sc.nextInt();
					for(int i = 1; i<= number ; i++) {
					
					System.out.print("Nome: ");
					String name = sc.next();
					System.out.print("Sobrenome: ");
					String secondName = sc.next();
					System.out.print("Apelido: ");
					String nickName = sc.next();
					System.out.print("Escolha qual jogador � voc� ?(ONE, TWO ou THREE):");
					String players = sc.next();
					Player player = new Player(name, secondName, nickName, CurrentPlayer.valueOf(players));
					playerList.add(player);
					currentPlayer = CurrentPlayer.ONE;
					ranking.add(new Ranking(player, new ScoreRanking()));
					}
					
					
					for (int i =0; i < lista.size();i++) {
						Menu.clearScreen();
						getCurrentPlayer();
						System.out.println(currentPlayer);
						System.out.println(lista.get(i));
						int kick = sc.nextInt();
				
						answer [i] = kick;
						if(answer[i] == rightAnswer[i] && currentPlayer == CurrentPlayer.ONE) {
							System.out.println(ranking.get(0).getPlayer().getName() +" " + ranking.get(0).score(500));
						}
						if(answer[i] != rightAnswer[i] && currentPlayer == CurrentPlayer.ONE) {
							System.out.println(ranking.get(0).getPlayer().getName() +" " + ranking.get(0).score(0));
						}
						if(answer[i] == rightAnswer[i] && currentPlayer == CurrentPlayer.TWO) {
							System.out.println(ranking.get(1).getPlayer().getName() +" " + ranking.get(1).score(500));
							}
						if(answer[i] != rightAnswer[i] && currentPlayer == CurrentPlayer.TWO){
							System.out.println(ranking.get(1).getPlayer().getName() +" " + ranking.get(1).score(0));
						}
						if(answer[i] == rightAnswer[i] && currentPlayer == CurrentPlayer.THREE) {
							System.out.println(ranking.get(2).getPlayer().getName() +" " + ranking.get(2).score(500));
						}
						if(answer[i] != rightAnswer[i] && currentPlayer == CurrentPlayer.THREE) {
							System.out.println(ranking.get(2).getPlayer().getName() +" " + ranking.get(2).score(0));
						}
						if (number == 3) {
							nextTurnOne();
						}
						if (number == 2) {
							nextTurnTwo();
						}
					}
					System.out.println("Result: ");
					System.out.println();
					for(int i = 0; i < number; i++) {
						
						System.out.print(ranking.get(i).getPlayer().getName() +" "+ranking.get(i).getSum() );
					}
					
					
				break;
			
			case 2:	
				Instrucao instrucao = new Instrucao(); 
				System.out.println("INSTRUCAO:");
				instrucao.Instrucao();
				
				break;
			
			case 3:
				System.out.println("Ranking ");
				
				break;
			
		}
		
		
	}
	
	public int getTurn() {
		return turn;
	}
	
	public CurrentPlayer getCurrentPlayer() {
		return currentPlayer;
	}

	private void nextTurnOne() {
		turn++;
		if(currentPlayer == CurrentPlayer.ONE) {
			currentPlayer = CurrentPlayer.TWO;
		}
		else if(currentPlayer == CurrentPlayer.TWO){
			currentPlayer = CurrentPlayer.THREE;
		}
		else {
			currentPlayer = CurrentPlayer.ONE;
		}
		
	}
	private void nextTurnTwo() {
		turn++;
		currentPlayer = (currentPlayer == CurrentPlayer.ONE)? CurrentPlayer.TWO:CurrentPlayer.ONE;
		
	}
	
	public static void clearScreen() {
		System.out.println("\033[H\033[J");
		System.out.flush();
	}
	
	
	private String pergunta1 = "Qual o comando para instalar o samba no sistema Linux Debian?\n"
			+"(1) apt samba\n"
			+"(2) apt-get install smb\n"
			+"(3) apt install smb\n"
			+"(4) apt-get install samba";
	private String pergunta2 = "Qual o caminho para acessar a pasta em que esta localizado o arquivo de configura��o do samba?\n"
			+"(1) cd /home/smb.conf\n"
			+"(2) cd /home/samba\n"
			+"(3) cd /etc/samba\n"
			+"(4) cd /etc/smb";
	private String pergunta3 = "Como criar usuario no samba?(DICA:adcionar no linux, criar senha no samba, permitir usuario no smb.conf)\n"
			+"(1) valid users = <nome>, useradd <nome>, smbpasswd -a <nome> <nome>\n"
			+"(2) users = <nome>, groupadd <nome>, gpasswd <nome>\n"
			+"(3) useradd = <nome>, groupadd <nome>, smbpasswd -a <nome>\n"
			+"(4) users = @<nome>, groupadd <nome>, gpasswd <nome>";
	private String pergunta4 = "Qual o comando para saber se o usuario foi adcionado no Samba?\n"
			+"(1) pdbedit -L\n"
			+"(2) cat /etc/passwd\n"
			+"(3) cat /etc/group\n"
			+"(4) less /etc/passwd";
	private String pergunta5 = "Qual a finalidade de escrever WRITEABLE = YES no smb.confe chmod a+w *.txt?\n"
			+"(1) Dar permiss�o de leitura \n"
			+"(2) Dar permiss�o de execu��o\n"
			+"(3) Dar permiss�o de tudo\n"                             
			+"(4) Dar permiss�o de escrita";
	private String pergunta6 = "Qual o comando para adcionar um usuario a um grupo no samba?\n"
			+ "(1) smbgroup <nomede usuario>\n"
			+ "(2) useradd <nome de usuario>\n"
			+ "(3) groupadd <nome de usuario>\n"
			+ "(4) useradd <nome do usuario> <nome do grupo>";
	private String pergunta7 = "Como acessar o compartilhamento do samba no Windows ?\n"
			+"(1) Windows + r, \\IP(IP da maquina virtual) \n"
			+"(2) cmd \\IP\n"
			+"(3) Abrir navegador e digitar \\IP\n"
			+"(4) apt-get install samba";
	private String pergunta8 = "Qual o comando para saber se o samba esta ativo?\n"
			+"(1) systemctl start nmbd\n"
			+"(2) systemctl status smbd\n"
			+"(3) ufw status samba\n"
			+"(4) ufw start smbd";
	private String pergunta9 = "Qual o comando para reiniciar o samba?\n"
			+"(1) systemctl restart smbd\n"
			+"(2) service start nmbd\n"
			+"(3) service start smbd\n"
			+"(4) systemctl revive smbd";
}
