package desafio3UsandoEstruturaDeControle;

import java.util.Scanner;

public class DescubraSeuSignoComSwitchCaseValidacaoRefeita {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mesesCom30Dias = 30;
		
		System.out.println(">>>>>>>>>> DESCUBRA SEU SIGNO <<<<<<<<<<\n");
		
		System.out.println("     >>>>>>>>>> REGRAS <<<<<<<<<<\n");
		System.out.println("DIGITE UM M�S DE 1 A 12 OU UM DIA DE 1 A 31.");
		System.out.println("M�S COM 28 DIAS -> FEVEREIRO\n"
				+ "MESES COM 30 DIAS -> ABRIL, JUNHO, SETEMBRO E NOVEMBRO\n"
				+ "MESES COM 31 DIAS -> JANEIRO, MAR�O, JULHO E AGOSTO\n");
		
		System.out.print("Digite o m�s do seu nascimento: ");
		int mesDoNascimento = input.nextInt();
		
		System.out.print("Digite o dia do seu nascimento: ");
		int diaDoNascimento = input.nextInt();
			
//		VALIDA��O DOS DADOS DE ENTRADA
		
		if(mesDoNascimento <1 || mesDoNascimento > 12) {
			System.err.println("\n             M�S OU DIA INV�LIDO");
			System.err.println("  SIGA A TABELA ACIMA NO INICIO DO PROGRAMA");
		}else if(mesDoNascimento == 1 || mesDoNascimento == 3 ) {
			System.err.println("\n             M�S OU DIA INV�LIDO");
			System.err.println("  SIGA A TABELA ACIMA NO INICIO DO PROGRAMA");
		}
		
		
		
		
		
		
		
		
		else {
			System.out.println("\n>>>>>>>>>> SEU SIGNO �... <<<<<<<<<<\n");
		}
		
//		VALIDA��O DA REGRA DE NEG�CIO
		
		switch(mesDoNascimento) {
		
		case 1: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Capric�rnio"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= 31) {
			System.out.println("Aqu�rio"); 
		}break;
		
		case 2: if(diaDoNascimento >= 1 && diaDoNascimento <= 19) {
			System.out.println("Aqu�rio"); break;
		}else if(diaDoNascimento >= 20 && diaDoNascimento <= 28) {
			System.out.println("Peixes"); 
		}break;
			
		
		case 3: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Peixes"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <=31) {
			System.out.println("�ries"); 
		}break;
		
		case 4: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("�ries"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) {
			System.out.println("Touro");
		}break;
		
		case 5: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("Touro"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= 31) {
			System.out.println("G�meos"); 
		}break;
		
		case 6: if(diaDoNascimento >= 1 && diaDoNascimento <= 20) {
			System.out.println("G�meos"); break;
		}else if(diaDoNascimento >= 21 && diaDoNascimento <= mesesCom30Dias) {
			System.out.println("C�ncer"); 
		}break;
		
		case 7: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("C�ncer"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= 31) {
			System.out.println("Le�o"); 
		}break;
		
		case 8: if(diaDoNascimento >= 1 && diaDoNascimento <= 22) {
			System.out.println("Le�o"); break;
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
			System.out.println("Escorpi�o"); 
		}break;
	
		case 11: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("Escorpi�o"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= mesDoNascimento) {
			System.out.println("Sagit�rio"); 
		}break;
		
		case 12: if(diaDoNascimento >= 1 && diaDoNascimento <= 21) {
			System.out.println("Sagit�rio"); break;
		}else if(diaDoNascimento >= 22 && diaDoNascimento <= 31) {
			System.out.println("Capric�rnio"); 
		}break;
	 }
}}