package desafio2UsandoEstruturaDeControle;

import java.util.Scanner;

public class MediaDasNotasComDoWhile {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		double somaDasNotas = 0;
		double mediaDasNotas = 0;
		String continuar = "";
		
		do {
			System.out.print("Insira uma nota: ");
			double nota = input.nextInt();
			
			System.out.print("\nDeseja inserir mais notas?\n");
			System.out.print("[S] - sim [N] - não: ");
			continuar = input.next();
			System.out.println();
			
			contador++;
			somaDasNotas = somaDasNotas + nota;
			
			
		}while(continuar.equalsIgnoreCase("S"));
		
		mediaDasNotas = somaDasNotas / contador;
		
		if(mediaDasNotas >= 6) {
			System.out.println("\n=D Parabéns! Você foi aprovado. =D");
		}else {
			System.out.println("=( Infelizmente, você foi reprovado. =(");
		}
	}

}
