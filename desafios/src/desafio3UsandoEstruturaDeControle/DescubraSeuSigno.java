package desafio3UsandoEstruturaDeControle;

import java.util.Scanner;

public class DescubraSeuSigno {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mesesCom30Dias = 30;
		
		System.out.println(">>>>>>>>>> DESCUBRA SEU SIGNO <<<<<<<<<<\n");
		
		System.out.println("     >>>>>>>>>> REGRAS <<<<<<<<<<\n");
		System.out.println("DIGITE UM MÊS DE 1 A 12 OU UM DIA DE 1 A 31.");
		System.out.println("MÊS COM 28 DIAS -> FEVEREIRO\n"
				+ "MESES COM 30 DIAS -> ABRIL, JUNHO, SETEMBRO E NOVEMBRO\n"
				+ "MESES COM 31 DIAS -> JANEIRO, MARÇO, JULHO E AGOSTO\n");
		
		System.out.print("Digite o mês do seu nascimento: ");
		int mesDoNascimento = input.nextInt();
		
		System.out.print("Digite o dia do seu nascimento: ");
		int diaDoNascimento = input.nextInt();
			
		System.out.println(">>>>>>>>>> SEU SIGNO É... <<<<<<<<<<\n");
		
		if((mesDoNascimento == 3 && diaDoNascimento >= 21 && diaDoNascimento <= 31) || (mesDoNascimento == 4 && diaDoNascimento >= 1 && diaDoNascimento <= 20)) {
			System.out.println("Áries");
		}else if((mesDoNascimento == 4 && diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) || (mesDoNascimento == 5 && diaDoNascimento >= 1 && diaDoNascimento <= 20)) {
			System.out.println("Touro");
		}else if((mesDoNascimento == 5 && diaDoNascimento >= 21 && diaDoNascimento <= 31) || (mesDoNascimento == 6 && diaDoNascimento >= 1 && diaDoNascimento <= 20)) {
			System.out.println("Gêmeos");
		}else if((mesDoNascimento == 6 && diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) || (mesDoNascimento == 7 && diaDoNascimento >= 1 && diaDoNascimento <= 21)) {
			System.out.println("Câncer");
		}else  if((mesDoNascimento == 7 && diaDoNascimento >= 22 && diaDoNascimento <= 31) || (mesDoNascimento == 8 && diaDoNascimento >= 1 && diaDoNascimento <= 22)) {
			System.out.println("Leão");
		}else if((mesDoNascimento == 8 && diaDoNascimento >= 23 && diaDoNascimento <= 31) || (mesDoNascimento == 9 && diaDoNascimento >= 1 && diaDoNascimento <= 22)) {
			System.out.println("Virgem");
		}else if((mesDoNascimento == 9 && diaDoNascimento >= 23 && diaDoNascimento <= mesesCom30Dias) || (mesDoNascimento == 10 && diaDoNascimento >= 1 && diaDoNascimento <= 22)) {
			System.out.println("Libra");
		}else if((mesDoNascimento == 10 && diaDoNascimento >= 23 && diaDoNascimento <= 31) || (mesDoNascimento == 11 && diaDoNascimento >= 1 && diaDoNascimento <= 21)) {
			System.out.println("Escorpião");
		}else if((mesDoNascimento == 11 && diaDoNascimento >= 22 && diaDoNascimento <= mesesCom30Dias) || (mesDoNascimento == 12 && diaDoNascimento >= 1 && diaDoNascimento <= 21)) {
			System.out.println("Sagitário");
		}else if((mesDoNascimento == 12 && diaDoNascimento >= 22 && diaDoNascimento <= 31) || (mesDoNascimento == 1 && diaDoNascimento >= 1 && diaDoNascimento <= 20)) {
			System.out.println("Capricórnio");
		}else if((mesDoNascimento == 1 && diaDoNascimento >= 21 && diaDoNascimento <= 31) || (mesDoNascimento == 2 && diaDoNascimento >= 1 && diaDoNascimento <= 19)) {
			System.out.println("Aquário");
		}else if((mesDoNascimento == 2 && diaDoNascimento >= 20 && diaDoNascimento <= 28) || (mesDoNascimento == 3 && diaDoNascimento >= 1 && diaDoNascimento <= 20)) {
			System.out.println("Peixes");
		}else if((mesDoNascimento <1 || mesDoNascimento > 12) || (diaDoNascimento < 1 || diaDoNascimento > 31) || (diaDoNascimento < 1 || diaDoNascimento > mesesCom30Dias)) {
			System.err.println("\n             MÊS OU DIA INVÁLIDO");
			System.err.println("  SIGA A TABELA ACIMA NO INICIO DO PROGRAMA");
		}	
	
	}
}
