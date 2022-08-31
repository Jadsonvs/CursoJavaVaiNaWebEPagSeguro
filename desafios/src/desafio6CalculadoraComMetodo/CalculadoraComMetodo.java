package desafio6CalculadoraComMetodo;

import java.util.Scanner;

public class CalculadoraComMetodo {

	private static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		String variavelTexto = "";
		
		calculadora(variavelTexto);
		
	}

	static int pedeValorInteiro(String instrucao) {
		return Integer.parseInt(pedeValorString(instrucao));
	}

	static String pedeValorString(String instrucao) {
		System.out.print(instrucao + ": ");
		return TECLADO.nextLine();
	}
	
	static double somar(double valorInicial, double segundoValor) {
		 valorInicial = valorInicial + segundoValor;
		 return valorInicial;
	}
	
	static double subtrair(double valorInicial, double segundoValor) {
		  valorInicial = valorInicial - segundoValor;
		 return valorInicial;
	}
	
	static double multiplicar(double valorInicial, double segundoValor) {
		 valorInicial = valorInicial * segundoValor;
		 return valorInicial;
	}
	
	static double dividir(double valorInicial, double segundoValor) {
		 valorInicial = valorInicial / segundoValor;
		 return valorInicial;
	}
	
	static double calculadora(String variavelTexto) {
		System.out.println(">>>>>>>>>> CALCULADORA <<<<<<<<<<\n");
		double valorInicial = pedeValorInteiro("Digite um valor inicial");
		
		
		while(!variavelTexto.equalsIgnoreCase("sair")) {
			String operacoes = pedeValorString("Digite uma operação");
			double segundoValor = pedeValorInteiro("Digite outro valor");
			
			if(operacoes.equals("+")) {
				valorInicial = somar(valorInicial, segundoValor);
			}else if(operacoes.equals("-")) {
				valorInicial = subtrair(valorInicial, segundoValor);
			}else if(operacoes.equals("*")) {
				valorInicial = multiplicar(valorInicial, segundoValor);
			}else if(operacoes.equals("/")){
				valorInicial = dividir(valorInicial, segundoValor);
			}
			System.out.println("Resultado " + valorInicial);
			variavelTexto = pedeValorString("\nDigite continuar ou sair");	
			System.out.println();
		}
		System.out.println(">>>>> CALCULADORA DESLIGADA <<<<<");
		return valorInicial;
	
	}
}
