package desafios;

public class InterfacePrograma {

	public static void interfaceDoPrograma() {
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
	}
	
	public static void mensagemSemEspaco(String texto) {
		System.out.print(texto);
	}
	
	public static void mensagem(String texto) {
		System.out.println(texto);
	}
	
	public static void espaco() {
		System.out.println();
	}
	
}
