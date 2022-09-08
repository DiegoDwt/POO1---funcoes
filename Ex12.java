package arquivos.funcoes;


import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite uma palavra: ");
	String palavra = entrada.next();
	
	StringBuilder resultado = funcoes.embaralhador(palavra);
	
	System.out.println("Embaralhada: " + resultado);
	
	entrada.close();
	}
	
}
