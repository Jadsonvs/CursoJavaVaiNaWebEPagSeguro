package gestaodealunos;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class InterfaceConsole {
	
	Scanner teclado = new Scanner(System.in);

	String perguntaTexto(String instrucao) {
		System.out.print(instrucao);
		return teclado.next();
	}

	int perguntaNumero(String instrucao) {
		final String resposta = perguntaTexto(instrucao);
		try {
			return Integer.parseInt(resposta);
		} catch (Exception e) {
			System.out.println("Resposta inv�lida! digite um valor n�merico!");
			System.out.println("---------------");
			return perguntaNumero(instrucao);
		}
	}

	String perguntaComEscolha(String instrucao, Map<String, String> opcoes) {
		do {
			System.out.print(instrucao);
			for (Entry<String, String> opcao : opcoes.entrySet()) {
				System.out.printf("\n\t%s para %s", opcao.getKey(), opcao.getValue());
			}
			System.out.print("\nResposta: ");
			final String resposta = teclado.next().toLowerCase();
			if (opcoes.containsKey(resposta)) {
				return resposta.trim();
			} else {
				System.out.println("Resposta inv�lida! Digite uma das op��es!");
				System.out.println("---------------");
			}
		} while (true);
	}

	public void exibirTitulo(String texto) {
		System.out.printf("----- %s ----- \n", texto);

	}

	public void pulaLinhas(int qtde) {
		for (int i = 0; i < qtde; i++) {
			System.out.print("\n");
		}
	}

}
