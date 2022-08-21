package desafio4Calculadora;

import java.util.Scanner;

public class Calculadora {

	private static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		double resultado = 0;
		
		System.out.println(">>>>>>>>>> CALCULADORA <<<<<<<<<<\n");
		
		double valorInicial = pedeValorInteiro("Digite um valor inicial");
		String variavelTexto = "";
		
		while(!variavelTexto.equalsIgnoreCase("sair")) {
			String operacoes = pedeValorString("Digite uma operação");
			double segundoValor = pedeValorInteiro("Digite outro valor");
			
			 
			if(operacoes.equals("+")) {
				valorInicial = valorInicial + segundoValor;
			}else if(operacoes.equals("-")) {
				valorInicial = valorInicial - segundoValor;
			}else if(operacoes.equals("*")) {
				valorInicial = valorInicial * segundoValor;
			}else if(operacoes.equals("/")){
				valorInicial = valorInicial / segundoValor;
			}
			System.out.println("Resultado " + valorInicial);
			variavelTexto = pedeValorString("\nDigite continuar ou sair");	
			System.out.println();
		}
		System.out.println(">>>>> CALCULADORA DESLIGADA <<<<<");
	}

	static int pedeValorInteiro(String instrucao) {
		return Integer.parseInt(pedeValorString(instrucao));
	}

	static String pedeValorString(String instrucao) {
		System.out.print(instrucao + ": ");
		return TECLADO.nextLine();
	}
}
