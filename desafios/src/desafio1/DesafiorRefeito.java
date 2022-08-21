
package desafio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DesafiorRefeito {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream arquivo = new FileInputStream("texto.txt");
		PrintStream salvarArquivo = new PrintStream("textoModificado.txt");
		
		Scanner teclado = new Scanner(System.in);
		

		Integer contadorLinhas = 0;
		Integer contadorPalavras = 0;
		Integer linhaComMaiorNumeroCaracteres = 0;
		Integer linhaComMaiorNumeroPalavras = 0;
		Integer palavraComMaiorNumeroDeCaracteres = 0;
		String maiorPalavra = "";

//		----------------------------------------- CONSOLE -----------------------------------------

		System.out.println("----------- DESAFIO N�MERO 01 DO VAI NA WEB/PAGSEGURO -----------");
		System.out.println();

		System.out.println("                 >>>>>>>>>> DESCRI��O <<<<<<<<<<                 ");
		System.out.println();
		System.out.println("[ Fazer um programa que leia um arquivo texto e imprima no terminal os seguintes dados: ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 1) Quantas linhas o arquivo tem.                                                      ]\n"
				+ "[ 2) Quantas palavras o arquivo tem.                                                    ]\n"
				+ "[ 3) Quantas palavras a maior linha do arquivo tem.                                     ]\n"
				+ "[ 4) Quantos caracteres a maior linha do arquivo tem.                                   ]\n"
				+ "[ 5) Quantos caracteres a maior palavra do arquivo tem.                                 ]\n"
				+ "[                                                                                       ]\n"
				+ "[ Junto com isso, o programa deve gerar um novo arquivo a partir do arquivo original,   ]\n"
				+ "[ fazendo essas modifica��es no novo arquivo                                            ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 1) Todas as palavras devem ter sua primeira letra MAI�SCULO e as demais min�sculas,   ]\n"
				+ "[ exceto alguma palavra espec�fica que o programa deve perguntar para o usu�rio no      ]\n"
				+ "[ in�cio, essa palavra deve ficar sempre em MAI�SCULO (e tanto faz seu digitar essa     ]\n"
				+ "[ palavra em minusculo ou maiusculo.)                                                   ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 2) Como usu�rio, eu quero adicionar �...� (3 pontinhos) nas linhas do arquivo         ]\n"
				+ "[ original e que quando o novo arquivo for gerado, tudo que vier na linha antes         ]\n"
				+ "[ desses 3 pontinhos, deve ser ignorado no novo arquivo                                 ]\n");
		System.out.println();
		System.out.println();

		System.out.println("                 >>>>>>>>>> PROGRAMA <<<<<<<<<<                 ");
		System.out.println();

		System.out.println("TEXTO ORIGINAL:");
		System.out.println();

		Scanner leitorParaExibirTextoNoConsole = new Scanner(new FileInputStream("textoOriginal.txt"));
		while (leitorParaExibirTextoNoConsole.hasNextLine()) {
			String lerTextoOriginal = leitorParaExibirTextoNoConsole.nextLine();
			System.out.println(lerTextoOriginal);
		}
		System.out.println();

//	----------------------------------------- PROGRAMA -----------------------------------------	

		System.out.print("Digite a palavra que ficar� em MAI�SCULO no texto novo: ");
		String palavraSelecionada = teclado.nextLine();
		System.out.println();
//
//		System.out.println("TEXTO MODIFICADO:");
//		System.out.println();

		Scanner leitorLinhas = new Scanner(arquivo);
		while (leitorLinhas.hasNextLine()) {
			String linhaNoTexto = leitorLinhas.nextLine();

			contadorLinhas++;
			Integer numeroCaracteresPorLinha = 0;
			Integer numeroPalavrasPorLinha = 0;
			Integer numeroCaracteresPorPalavra = 0;
			String textoModificado = "";
			
			Scanner leitorPalavras = new Scanner(linhaNoTexto);
			while (leitorPalavras.hasNext()) {
				String palavras = leitorPalavras.next();
				

				String primeiraLetra = palavras.substring(0, 1).toUpperCase();
				String restantePalavra = palavras.substring(1).toLowerCase();
				String palavraCompleta = primeiraLetra + restantePalavra;
				
				if (palavraCompleta.equalsIgnoreCase(palavraSelecionada)) {
					palavraCompleta = palavraSelecionada.toUpperCase();
				}else if(palavraCompleta.contains("..")) {
					palavraCompleta = "";
				}
				textoModificado = textoModificado + palavraCompleta + " ";
				
				
				contadorPalavras++;

				numeroCaracteresPorLinha = numeroCaracteresPorLinha + palavras.length();
				linhaComMaiorNumeroCaracteres = Math.max(linhaComMaiorNumeroCaracteres, numeroCaracteresPorLinha);

				numeroPalavrasPorLinha = numeroPalavrasPorLinha + 1;
				linhaComMaiorNumeroPalavras = Math.max(linhaComMaiorNumeroPalavras, numeroPalavrasPorLinha);

				numeroCaracteresPorPalavra = palavras.length();
				palavraComMaiorNumeroDeCaracteres = Math.max(palavraComMaiorNumeroDeCaracteres,
						numeroCaracteresPorPalavra);

				if (palavras.length() > maiorPalavra.length()) {
					maiorPalavra = palavras;
				}
			}
			System.out.println(textoModificado);
		}

//			salvarArquivo.println(textoFinal);

		System.out.println();
		System.out.println("                 >>>>>>>>>> ESTAT�STICAS <<<<<<<<<<                 ");
		System.out.println();

		System.out.print(" [ S ] - VISUALIZAR  [ N ] - N�O VISUALIZAR: ");
		String escolha = teclado.nextLine();
		if (escolha.equalsIgnoreCase("S")) {
			System.out.println();
			System.out.println("[        Quantidade de linhas -> " + contadorLinhas
					+ "                                                     ]");
			System.out.println("[        Quantidade de palavras -> " + contadorPalavras
					+ "                                                  ]");
			System.out.println("[        Linha com maior n�mero de palavras -> " + linhaComMaiorNumeroPalavras
					+ "                                      ]");
			System.out.println("[        Linha com maior n�mero de caracteres -> " + linhaComMaiorNumeroCaracteres
					+ "                                    ]");
			System.out.println("[        Palavra -> " + maiorPalavra + " <- " + "contem o maior n�mero de caracteres que � -> "
					+ +palavraComMaiorNumeroDeCaracteres + "         ]");
		} else if (escolha.equalsIgnoreCase("N")) {
			System.out.println();
			System.out.println("ARQUIVO SALVO E PROGRAMA FINALIZADO...");
		}
	}
}
