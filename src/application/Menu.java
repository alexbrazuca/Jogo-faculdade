package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Instrucao;
import entities.Player;
import entities.Enum.CurrentPlayer;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	private int turn = 1;
	
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
		System.out.println("(2) Instruções");
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
					System.out.print("Escolha qual jogador é você ?(PLAYER_ONE, PLAYER_TWO ou PLAYER_THREE)");
					String player = sc.next();
					playerList.add(new Player(name, secondName, nickName, CurrentPlayer.valueOf(player)));
					currentPlayer = CurrentPlayer.valueOf(player);
					
					}
				
					for (String perguntas : lista) {
						Menu.clearScreen();
						getCurrentPlayer();
						System.out.println(currentPlayer);
						System.out.println(perguntas);
						int answer = sc.nextInt();
						nextTurn();
						
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

	private void nextTurn() {
		turn++;
		if(currentPlayer == CurrentPlayer.PLAYER_ONE) {
			currentPlayer = CurrentPlayer.PLAYER_TWO;
		}
		else if(currentPlayer == CurrentPlayer.PLAYER_TWO){
			currentPlayer = CurrentPlayer.PLAYER_THREE;
		}
		else {
			currentPlayer = CurrentPlayer.PLAYER_ONE;
		}
		
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
	private String pergunta2 = "Qual o caminho para acessar a pasta em que esta localizado o arquivo de configuração do samba?\n"
			+"(1) cd /home/smb.conf\n"
			+"(2) cd /home/samba\n"
			+"(3) cd /etc/samba\n"
			+"(4) cd /etc/smb";
	private String pergunta3 = "Como criar usuario no samba?(DICA:adcionar no linux, criar senha no samba, permitir usuario no smb.conf)\n"
			+"(1) users = <nome>, useradd <nome>, smbpasswd -a <nome>\n"
			+"(2) users = <nome>, groupadd <nome>, gpasswd <nome>\n"
			+"(3) useradd = <nome>, groupadd <nome>, smbpasswd -a <nome>\n"
			+"(4) users = @<nome>, groupadd <nome>, gpasswd <nome>";
	private String pergunta4 = "Qual o comando para saber se o usuario foi adcionado no Samba?\n"
			+"(1) pdbedit -L\n"
			+"(2) cat /etc/passwd\n"
			+"(3) cat /etc/group\n"
			+"(4) less /etc/passwd";
	private String pergunta5 = "Qual a finalidade de escrever WRITEABLE = YES no smb.confe chmod a+w *.txt?\n"
			+"(1) Dar permissão de leitura \n"
			+"(2) Dar permissão de execução\n"
			+"(3) Dar permissão de tudo\n"
			+"(4) Dar permissão de escrita";
	private String pergunta6 = "Qual o comando para adcionar um usuario ao grupo do samba?\n"
			+"(1) usearadd <nome>"
			+"(2) gpasswd <nome>\n"
			+"(3) groupadd <nome>\n"
			+"(4) smbpasswd";
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
