package arquivos.funcoes;


import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		String formato24 = "";
		String[] separados = new String[2];
		int hr = 0;
		int min = 0;
					
		do {
			System.out.println("Digite a hora no formato hh:mm - Notação 24 horas: ");
			formato24 = entrada.nextLine();
			separados = formato24.split(":");	
			hr =Integer.valueOf(separados[0]);
			min = Integer.valueOf(separados[1]);
			if (hr < 0 || hr > 24) {
				System.out.println("Entrada inválida!");
			}
		} while (hr < 0 || hr > 24);			
			
		System.out.println(funcoes.converteHoras(hr) + ":" + min + (funcoes.amPm(hr)));	
						  
		entrada.close();							 	
	
	}
	
}






