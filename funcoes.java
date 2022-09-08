package arquivos.funcoes;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class funcoes {
	
	
	// Ex1
	public static String imprime(int num) {
		String saida = "";
		for(int x = 0; x < num; x++) {
			for (int y = 0; y < x + 1; y++) {
				if (y == 0) {
					saida += "* ";
				}
				saida += Integer.toString(x + 1) + "  ";
			}
			saida += "\n";
		}
		return saida;
	}   
	
	//Ex2
	public static String imprime2(int num) {
		String saida = "";
		for(int x = 0; x < num; x++) {
			for (int y = 0; y < x + 1; y++) {
				if (y == 0) {
					saida += "* ";
				}
				saida += Integer.toString(y + 1) + "  ";
			}
			saida += "\n";
		}
		return saida;
	} 
	
	
	// Ex3
		public static int soma3(int num1, int num2, int num3) {
			return num1 + num2 + num3;
		}
		
		

	// Ex4
		public static char verificaSinal(int num) {
			char saida = ' ';
			if (num <= 0 ) {
				saida = 'N';
			}	
			if (num > 0 ) {
				saida = 'P';
			}	
			return saida;
		}
		
		
		// Ex5
		public static float somaImposto(float taxaImposto, float custo) {
			float saida = taxaImposto * custo;
			return saida;
		}
		
		// Ex6
		public static int converteHoras(int hora) {
			if (hora > 12) {
				hora = hora % 12;
			}
			return hora;
		}
		
	
		// Ex6 - parte2
		public static String amPm(int hora) {
			String saida = "";
			if (hora < 12 || hora == 24) {
				saida = "A.M.";
			} else if (hora >= 12) {
				saida = "P.M.";
			}
			return saida;
		}	
	
	
		//Ex7
		public static float valorPagamento(float valorPrestacao, int diasAtraso) {
			float saida = 0;
			float multa = 0;
			float taxaJuro = 0;
			if (diasAtraso == 0) {
				saida = valorPrestacao;
			} else if (diasAtraso > 0) {
				multa = valorPrestacao * 0.03f;
				taxaJuro = valorPrestacao * 0.001f * diasAtraso;
				saida = valorPrestacao + multa + taxaJuro;
			}
			return saida;
		}
	
		
		// Ex8
		public static String contaDigitos(int num) {
			String saida = Integer.toString(num);
			return saida;
		}
		
		
		// Ex9
		public static String Reverte(long num) {
			String direto = String.valueOf(num);  
			char [] separados = direto.toCharArray();
			char [] reverso = new char[separados.length];
				
			
			for (int i = 0; i < separados.length; i++) {
				reverso[i] = separados[(separados.length - 1) - i];
			}
			
			StringBuilder saida = new StringBuilder();
			for (int i = 0; i < reverso.length; i++) {
				saida.append(reverso[i]);
				saida.append("");
			}
			
			return saida.toString();
		}
		
		
		
		// Ex10
		public static int AleatorioNoIntervalo(int n1, int n2) {
			int aleatorio = n1 + (int) Math.round(Math.random() * (n2 - 1)); 
			return aleatorio;
		}
		
		
		//Ex11
				public static String dataFormato(String data) {
					
					String juntos[] = new String[3];
					int separados[] = new int[3];
					StringBuilder saida = new StringBuilder();
					String meses = "";
					
					juntos = data.split("/");
					
					for(int i = 0 ; i < separados.length; i++) {
						separados[i] = Integer.parseInt(juntos[i]);
					}
					
					if (separados[1] == 01) {
						meses = "janeiro";
					}
					if (separados[1] == 02) {
						meses = "fevereiro";
					}
					if (separados[1] == 03) {
						meses = "março";
					}
					if (separados[1] == 4) {
						meses = "abril";
					}
					if (separados[1] == 5) {
						meses = "maio";
					}
					if (separados[1] == 6) {
						meses = "junho";
					}
					if (separados[1] == 7) {
						meses = "julho";
					}
					if (separados[1] == 8) {
						meses = "agosto";
					}
					if (separados[1] == 9) {
						meses = "setembro";
					}
					if (separados[1] == 10) {
						meses = "outubro";
					}
					if (separados[1] == 11) {
						meses = "novembro";
					}
					if (separados[1] == 12) {
						meses = "dezembro";
					}
					if (separados[0]<=0 || separados[1]<=0 || separados[2]<=0) {
						saida.append("NULL");
					}else {
						saida.append(juntos[0]);
						saida.append(" de " + meses + " de ");
						saida.append(juntos[2] + ".");
					}
					return saida.toString();
					
				}
		
				
				// Ex12
				public static StringBuilder embaralhador(String str) {
					
					StringBuilder saida = new StringBuilder();
					String [] res = str.split("");
							
					List<String> embaralhar  = Arrays.asList(res);
					Collections.shuffle(embaralhar);
								
					String embaralhada = String.join("", embaralhar);
					saida.append(embaralhada);
						
					return saida;
				}
				
				//Ex13 
				public static String desenhaRetangulo(int col, int lin){
					
					if (col < 1 || col > 20) {
						col = 10;
					}
					
					if (lin < 1 || lin > 20) {
						lin = 7;
					}
					
					StringBuilder saida = new StringBuilder();
					
					for (int i = 0; i < lin; i++) {
						
						if (i == 0||i == lin-1) {
							saida.append("+");
						}else {
							saida.append("|");
						}
						
						
						for (int j = 0; j < col; j++) {
							saida.append("-");
						}
						
						
						if (i == 0||i == lin-1) {
							saida.append("+");
						}else {
							saida.append("|");
						}
						
						saida.append("\n");
					}
					
					return saida.toString();
					
				}

				
}
		