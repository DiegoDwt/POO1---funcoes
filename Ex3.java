package arquivos.funcoes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] argumentos = new int[3];
		
		for (int x = 0; x < 3; x++) {
			System.out.print("Digite um número inteiro: ");
			argumentos[x] = entrada.nextInt();
		}
		
		System.out.println("A soma dos argumentos é: " + funcoes.soma3(argumentos[0], argumentos[1],argumentos[2]));
		
		entrada.close();

	}
}
