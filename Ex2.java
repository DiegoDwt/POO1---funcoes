package arquivos.funcoes;


import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas linhas você deseja imprimir? ");
		int n1 = entrada.nextInt();
		
		System.out.println();
		System.out.println(funcoes.imprime2(n1));
	
	
		entrada.close();
	}
}