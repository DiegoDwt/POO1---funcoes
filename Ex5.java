package arquivos.funcoes;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o custo do item: ");
		float preco = entrada.nextFloat();
		
		System.out.println("Informe o percentual do imposto (No formato 1,1 = 10%): ");
		float percentual = entrada.nextFloat();
		
		float resultado = funcoes.somaImposto(percentual, preco);
						
		System.out.println("O preço final é R$" + String.format("%.2f",resultado));
		
		entrada.close();
				

	}

}
