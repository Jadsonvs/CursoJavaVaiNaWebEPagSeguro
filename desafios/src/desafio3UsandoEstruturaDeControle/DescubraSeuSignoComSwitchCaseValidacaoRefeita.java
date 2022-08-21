package desafio3UsandoEstruturaDeControle;

import java.util.Scanner;

public class DescubraSeuSignoComSwitchCaseValidacaoRefeita {

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
			
//		VALIDAÇÃO DOS DADOS DE ENTRADA
		
		if(mesDoNascimento <1 || mesDoNascimento > 12) {
			System.err.println("\n             MÊS OU DIA INVÁLIDO");
			System.err.println("  SIGA A TABELA ACIMA NO INICIO DO PROGRAMA");
		}else if(mesDoNascimento == 1 || mesDoNascimento == 3 ) {
			System.err.println("\n             MÊS OU DIA INVÁLIDO");
			System.err.println("  SIGA A TABELA ACIMA NO INICIO DO PROGRAMA");
		}
		
		
		
		
		
		
		
		
		else {
			System.out.println("\n>>>>>>>>>> SEU SIGNO É... <<<<<<<<<<\n");
		}
		
//		VALIDAÇÃO DA REGRA DE NEGÓCIO
		
		switch(mesDoNascimento) {
		
		case 1: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Capricórnio"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= 31) {
			System.out.println("Aquário"); 
		}break;
		
		case 2: if(diaDoNascimento >= 1 && diaDoNascimento <= 19) {
			System.out.println("Aquário"); break;
		}else if(diaDoNascimento >= 20 && diaDoNascimento <= 28) {
			System.out.println("Peixes"); 
		}break;
			
		
		case 3: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Peixes"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <=31) {
			System.out.println("Áries"); 
		}break;
		
		case 4: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Áries"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) {
			System.out.println("Touro");
		}break;
		
		case 5: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Touro"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= 31) {
			System.out.println("Gêmeos"); 
		}break;
		
		case 6: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Gêmeos"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) {
			System.out.println("Câncer"); 
		}break;
		
		case 7: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("Câncer"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= 31) {
			System.out.println("Leão"); 
		}break;
		
		case 8: if(diaDoNascimento >= 1 && diaDoNascimento <= 22) {
			System.out.println("Leão"); break;
		}else if(diaDoNascimento >= 23 && diaDoNascimento <= 31) {
			System.out.println("Virgem"); 
		}break;
		
		case 9: if(diaDoNascimento >= 1 && diaDoNascimento <= 22) {
			System.out.println("Virgem"); break;
		}else if(diaDoNascimento >= 23 && diaDoNascimento <= mesesCom30Dias) {
			System.out.println("Libra"); 
		}break;
		
		case 10: if(diaDoNascimento >= 1 && diaDoNascimento <= 22) {
			System.out.println("Libra"); break;
		}else if(diaDoNascimento >= 23 && diaDoNascimento <= 31) {
			System.out.println("Escorpião"); 
		}break;
	
		case 11: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("Escorpião"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= mesDoNascimento) {
			System.out.println("Sagitário"); 
		}break;
		
		case 12: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("Sagitário"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= 31) {
			System.out.println("Capricórnio"); 
		}break;
	 }
}}