
package desafio5ConversorTemperaturaComMetodo;

import java.util.Scanner;

public class ConversaoTemperaturaComMetodo {

	public static void main(String[] args) {

		view(celsiusToFahrenheitdouble(input()));

	}

	static void view(double resultado) {
		System.out.println("Valor convertido em Fahrenheit: " + resultado);
	}

	static double input() {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celcius: ");
		double celcius = leitor.nextDouble();
		return celcius;
	}

	static double celsiusToFahrenheitdouble(double celcius) {
//		  Fórmula: fahrenheit = (celcius * 5/9) + 32	
		final Double FATOR = 32.0;
		final Double CALCULO_DE_SUBTRACAO = 9.0 / 5.0;

		Double resultado = (celcius * CALCULO_DE_SUBTRACAO) + FATOR;
		return resultado;
	}

}
