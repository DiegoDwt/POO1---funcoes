package arquivos.funcoes;


import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 int opcao = 0;
		 int resultado = 0;
		 int resultado2 = 0;
		 boolean sair = false;
		 boolean primeira = true;
		
		 System.out.println("***Jogo de Craps***");
		 System.out.println("1ª Rodada:");
		 System.out.println("Se tirar 7 ou 11 - Natural - Ganha o jogo");
		 System.out.println("Se tirar 2, 3 ou 12 - Craps - Perde o jogo");
		 System.out.println("Se tirar 4, 5, 6, 8, 9, ou 10 - Ponto. Jogue novamente até repetir o mesmo número para ganhar. ");
		 System.out.println("Se tirar 7 antes de acertar o número - Perde o jogo.");
		 
		while (!sair) {
			if (primeira) {
				do {
					System.out.print("1-Jogar o dado / 2-Sair: ");
					opcao = entrada.nextInt();
					if (opcao < 1 || opcao > 2) {
						System.out.println("Entrada inválida!");
					}
				} while (opcao < 1 || opcao > 2);
				
				switch(opcao){
					case 1:
						resultado = funcoes.AleatorioNoIntervalo(2, 12);
						System.out.println(" | " + resultado + " | ");
						break;
					case 2:
						System.out.println("Até logo!");
						sair = true;
						break;					
				}
				
				if (resultado == 7 || resultado == 11) {
					System.out.println("Natural - Ganhou!!");
					sair = true;
				} else if (resultado == 2 || resultado == 3 || resultado == 12) {
					System.out.println("Craps - Perdeu!!");
					sair = true;
				} 
				primeira = false;
			}
									
			if (!sair) {
				do {
					do {
						System.out.print("1-Jogar o dado / 2-Sair: ");
						opcao = entrada.nextInt();
						if (opcao < 1 || opcao > 2) {
							System.out.println("Entrada inválida!");
						}
					} while (opcao < 1 || opcao > 2);
					
					switch(opcao){
						case 1:
							resultado2 = funcoes.AleatorioNoIntervalo(2, 12);
							System.out.println(" | " + resultado2 + " | ");
							break;
						case 2:
							System.out.println("Até logo!");
							sair = true;
							break;					
					}
					
					if ( resultado2 == resultado) {
						System.out.println("Venceu!");
						sair = true;
					} else if (resultado2 == 7) {
						System.out.println("Perdeu!");
						sair = true;
					}
				
		    } while (!sair);
		  }
		} 
		
		entrada.close();
	}
}
