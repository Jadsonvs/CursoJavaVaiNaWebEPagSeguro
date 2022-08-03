
package desafios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Desafio1Metodos {

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
		InterfacePrograma.interfaceDoPrograma();
		
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
			contadorLinhas++;
			
			exibiLinhasDepoisDosPontos(palavraModificada(palavraSeparada, palavraSelecionada));
			
			mensagem(exibiLinhasDepoisDosPontos(palavraModificada(palavraSeparada, palavraSelecionada)));
			salvarArquivo.println(exibiLinhasDepoisDosPontos(palavraModificada(palavraSeparada, palavraSelecionada)));

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
		
		exibirEstatisticas(teclado, contadorLinhas, contadorPalavras, linhaComMaiorNumeroPalavras,
							linhaComMaiorNumeroCaracteres, palavraComMaiorNumeroDeCaracteres, contadorPalavras);
		
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
	
	static String exibiLinhasDepoisDosPontos(String separada) {
		int inicio = separada.indexOf(".");
		int fim = separada.lastIndexOf(" ");
		String textoFinal = separada.substring(inicio + 1, fim);
		
		return textoFinal;
	}
	
	static String palavraModificada(String[] palavraSeparada, String palavraSelecionada) {
		String separada = "";
		StringBuffer stringBuffer = new StringBuffer();
		
		for (String palavra : palavraSeparada) {	
			String primeiraLetra = "";
			String restanteDaPalavra = "";
			
			if(palavra.length() == 0) {
				primeiraLetra = palavra.substring(0);
			}else {
				primeiraLetra = palavra.substring(0, 1).toUpperCase();
				restanteDaPalavra = palavra.substring(1, palavra.length()).toLowerCase();
			}
			
			String palavraComppleta = primeiraLetra + restanteDaPalavra;
			
			if (palavraComppleta.equalsIgnoreCase(palavraSelecionada)) {
				palavraComppleta = palavraSelecionada.toUpperCase();
			}
			stringBuffer.append(palavraComppleta + " ");
		}
		return separada = stringBuffer.toString();
	}
	
	static void exibirEstatisticas(Scanner teclado, Integer contadorLinhas, Integer contadorPalavras, Integer linhaComMaiorNumeroPalavras,
									Integer linhaComMaiorNumeroCaracteres, Integer palavraComMaiorNumeroDeCaracteres, Integer maiorPalavra) {
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
		}else {
			espaco();
			mensagem("ARQUIVO SALVO E PROGRAMA FINALIZADO...");
		}
		
	}	
}