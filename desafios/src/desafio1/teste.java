package desafio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new FileInputStream("texto.txt"));
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a palavra que ficará em MAIÚSCULO no texto novo: ");
		String palavraSelecionada = teclado.nextLine();

		while (leitor.hasNextLine()) {
			String ler = leitor.nextLine();
			
			String novaLinha = "";

			Scanner linhas = new Scanner(ler);
			while (linhas.hasNext()) {
				String palavras = linhas.next();

				String primeiraLetra = palavras.substring(0, 1).toUpperCase();
				String restantePalavra = palavras.substring(1, palavras.length()).toLowerCase();
				String palavraCompleta = primeiraLetra + restantePalavra;

				if (palavraCompleta.equalsIgnoreCase(palavraSelecionada)) {
					palavraCompleta = palavraSelecionada.toUpperCase();
				}
				
				if(palavraCompleta.contains("..")) {
					palavraCompleta = "";
				}
				
				novaLinha = novaLinha + palavraCompleta + " ";

			}
			System.out.println(novaLinha);

		}

	}

}
