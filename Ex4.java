package arquivos.funcoes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		
		System.out.println(funcoes.verificaSinal(n1));
		
		entrada.close();
	}

}
