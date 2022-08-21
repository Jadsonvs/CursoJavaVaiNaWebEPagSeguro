package desafio2UsandoEstruturaDeControle;

import java.util.Scanner;

public class MediaDasNotas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double somaDasnotas = 0;
		double numerodDeNotas = 0;
		double mediaNotas = 0;
		
		System.out.println(">>>>>>>>>> CALCULE SUA NOTA <<<<<<<<<<");
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite sua " + (i + 1) + "ª nota: ");
			double notas = input.nextDouble();
			
			numerodDeNotas++;
			somaDasnotas += notas;
		}
		mediaNotas = somaDasnotas / numerodDeNotas;
		
		System.out.println();
		System.out.println(">>>>>>>>>>    RESULTADO    <<<<<<<<<<\n");
		if(mediaNotas >= 6) {
			System.out.println("=D Parabéns! Você foi aprovado. =D");
		}else {
			System.out.println("=| Infelizmente você foi reprovado. =|");
		}
	}

}
