package arquivos.funcoes;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a data no formato DD/MM/AAAA: ");
		String data = entrada.nextLine();
		
		System.out.println(funcoes.dataFormato(data));
		
		entrada.close();
			

	}

}
