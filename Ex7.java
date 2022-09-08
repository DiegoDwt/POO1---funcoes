package arquivos.funcoes;


import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float resultado = 0;
		float prestacao = 0;
		int dias = 0;
		
		do {
			System.out.print("Informe o valor da prestação: ");
			prestacao = entrada.nextFloat();
			
			if (prestacao == 0) {
				continue;
			}
			
			System.out.print("Caso está em atraso, informe o número de dias: ");
			dias = entrada.nextInt();
			
			resultado = funcoes.valorPagamento(prestacao, dias);
			System.out.println("O valor a ser pago: R$ " + String.format("%.2f",resultado));
			System.out.println();
			
		} while (prestacao != 0);	
		
		System.out.println("Programa encerrado!");
				
		entrada.close();
	
        }
		
}
	





