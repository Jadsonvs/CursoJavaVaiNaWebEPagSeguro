
package desafios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream arquivoOriginal = new FileInputStream("textoOriginal.txt");
		PrintStream salvarArquivo = new PrintStream("textoModificado.txt");
		
		Scanner teclado = new Scanner(System.in);

		Integer contadorLinhas = 0;
		Integer contadorPalavras = 0;
		Integer linhaComMaiorNumeroCaracteres = 0;
		Integer linhaComMaiorNumeroPalavras = 0;
		Integer palavraComMaiorNumeroDeCaracteres = 0;
		String maiorPalavra = "";
		
//		----------------------------------------- CONSOLE -----------------------------------------
		
		mensagem("----------- DESAFIO NÚMERO 01 DO VAI NA WEB/PAGSEGURO -----------");
		espaco();
		
		mensagem("                 >>>>>>>>>> DESCRIÇÃO <<<<<<<<<<                 ");
		espaco();
		mensagem("[ Fazer um programa que leia um arquivo texto e imprima no terminal os seguintes dados: ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 1) Quantas linhas o arquivo tem.                                                      ]\n"
				+ "[ 2) Quantas palavras o arquivo tem.                                                    ]\n"
				+ "[ 3) Quantas palavras a maior linha do arquivo tem.                                     ]\n"
				+ "[ 4) Quantos caracteres a maior linha do arquivo tem.                                   ]\n"
				+ "[ 5) Quantos caracteres a maior palavra do arquivo tem.                                 ]\n"
				+ "[                                                                                       ]\n"
				+ "[ Junto com isso, o programa deve gerar um novo arquivo a partir do arquivo original,   ]\n" 
				+ "[ fazendo essas modificações no novo arquivo                                            ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 1) Todas as palavras devem ter sua primeira letra MAIÚSCULO e as demais minúsculas,   ]\n"
				+ "[ exceto alguma palavra específica que o programa deve perguntar para o usuário no      ]\n"
				+ "[ início, essa palavra deve ficar sempre em MAIÚSCULO (e tanto faz seu digitar essa     ]\n"
				+ "[ palavra em minusculo ou maiusculo.)                                                   ]\n"
				+ "[                                                                                       ]\n"
				+ "[ 2) Como usuário, eu quero adicionar “...” (3 pontinhos) nas linhas do arquivo         ]\n" 
				+ "[ original e que quando o novo arquivo for gerado, tudo que vier na linha antes         ]\n"
				+ "[ desses 3 pontinhos, deve ser ignorado no novo arquivo                                 ]\n");
		espaco();
		espaco();
		
		mensagem("                 >>>>>>>>>> PROGRAMA <<<<<<<<<<                 ");
		espaco();
		
		mensagem("TEXTO ORIGINAL:");
		espaco();
		
		Scanner leitorParaExibirTextoNoConsole = new Scanner(new FileInputStream("textoOriginal.txt"));
		while(leitorParaExibirTextoNoConsole.hasNextLine()) {
			String lerTextoOriginal = leitorParaExibirTextoNoConsole.nextLine();
			mensagem(lerTextoOriginal);
		}
		espaco();
		
//	----------------------------------------- PROGRAMA -----------------------------------------	
		
		mensagemSemEspaco("Digite a palavra que ficará em MAIÚSCULO no texto novo: ");
		String palavraSelecionada = teclado.nextLine();
		espaco();
		
		mensagem("TEXTO MODIFICADO:");
		espaco();
		
		Scanner leitorLinhas = new Scanner(arquivoOriginal);
				
		while (leitorLinhas.hasNextLine()) {
			String linhaNoTexto = leitorLinhas.nextLine();

			String[] palavraSeparada = linhaNoTexto.split(" ");
			String separada = "";

			StringBuffer stringBuffer = new StringBuffer();
			for (String palavra : palavraSeparada) {
				
				Integer posicao = 0;
				String primeiraLetra = "";
				String restanteDaPalavra = "";
				if(palavra.length() == 0) {
					primeiraLetra = palavra.substring(0);
				}else {
					primeiraLetra = palavra.substring(0, 1).toUpperCase();
					restanteDaPalavra = palavra.substring(1, palavra.length()).toLowerCase();
				}
				
				String palavraComppleta = primeiraLetra + restanteDaPalavra;
				
//				String primeiraLetra = palavra.substring(0, 1).toUpperCase();
//				String restanteDaPalavra = palavra.substring(1, palavra.length()).toLowerCase();
//				String palavraComppleta = primeiraLetra + restanteDaPalavra;
//				palavraComppleta = palavraComppleta.trim();

				if (palavraComppleta.equalsIgnoreCase(palavraSelecionada)) {
					palavraComppleta = palavraSelecionada.toUpperCase();
				}
				stringBuffer.append(palavraComppleta + " ");
			}
			separada = stringBuffer.toString();

			int inicio = separada.indexOf(".");
			int fim = separada.lastIndexOf(" ");
			String textoFinal = separada.substring(inicio + 1, fim);
			
			mensagem(textoFinal);
			salvarArquivo.println(textoFinal);

			contadorLinhas++;
			Integer numeroCaracteresPorLinha = 0;
			Integer numeroPalavrasPorLinha = 0;
			Integer numeroCaracteresPorPalavra = 0;
		
			Scanner leitorPalavras = new Scanner(linhaNoTexto);
			while (leitorPalavras.hasNext()) {
				String palavras = leitorPalavras.next();
				
				contadorPalavras++;
				
				numeroCaracteresPorLinha = numeroCaracteresPorLinha + palavras.length();			
				linhaComMaiorNumeroCaracteres = Math.max(linhaComMaiorNumeroCaracteres, numeroCaracteresPorLinha);
				
				numeroPalavrasPorLinha = numeroPalavrasPorLinha + 1;
				linhaComMaiorNumeroPalavras = Math.max(linhaComMaiorNumeroPalavras, numeroPalavrasPorLinha);
				
				numeroCaracteresPorPalavra = palavras.length();
				palavraComMaiorNumeroDeCaracteres = Math.max(palavraComMaiorNumeroDeCaracteres, numeroCaracteresPorPalavra);
					
				if(palavras.length() > maiorPalavra.length()) {
					maiorPalavra = palavras;
				}	
			}
		}
		espaco();
		mensagem("                 >>>>>>>>>> ESTATÍSTICAS <<<<<<<<<<                 ");
		espaco();
		
		
		mensagemSemEspaco(" [ S ] - VISUALIZAR  [ N ] - NÃO VISUALIZAR: ");
		String escolha = teclado.nextLine();
		if(escolha.equalsIgnoreCase("S")) {
			espaco();
			mensagem("[        Quantidade de linhas -> " + contadorLinhas + "                                                     ]");
			mensagem("[        Quantidade de palavras -> " + contadorPalavras + "                                                  ]");
			mensagem("[        Linha com maior número de palavras -> " + linhaComMaiorNumeroPalavras + "                                      ]");
			mensagem("[        Linha com maior número de caracteres -> " + linhaComMaiorNumeroCaracteres + "                                    ]");
			mensagem("[        Palavra -> " +  maiorPalavra +" <- " + "contem o maior número de caracteres que é -> " + + palavraComMaiorNumeroDeCaracteres + "         ]");	
		}else if(escolha.equalsIgnoreCase("N")){
			espaco();
			mensagem("ARQUIVO SALVO E PROGRAMA FINALIZADO...");
		}
		
	}
	
	static void mensagemSemEspaco(String texto) {
		System.out.print(texto);
	}
	
	static void mensagem(String texto) {
		System.out.println(texto);
	}
	
	static void espaco() {
		System.out.println();
	}
}
