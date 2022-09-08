package arquivos.funcoes;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Informe o tamanho das colunas: ");
		int coluna = entrada.nextInt();
		
		System.out.print("Informe o tamanho das linhas: ");
		int linha = entrada.nextInt();
				
		System.out.println();
		System.out.println(funcoes.desenhaRetangulo(coluna, linha));
		
		entrada.close();
		
		
	}

}