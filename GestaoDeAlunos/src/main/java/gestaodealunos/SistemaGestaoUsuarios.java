package gestaodealunos;

import java.util.HashMap;
import java.util.Map;

public class SistemaGestaoUsuarios {
  
	final InterfaceConsole console;

	final ServicoUsuario servicoUsuario;

	final BancoDados bancoDados;

	public SistemaGestaoUsuarios() {
		this.console = new InterfaceConsole();
		this.bancoDados = new BancoDadosAlunos();
		this.servicoUsuario = new ServicoUsuario(bancoDados, console);
	}

	public static void main(String[] args) {
		final SistemaGestaoUsuarios sistema = new SistemaGestaoUsuarios();
		sistema.executar();
	}

	void executar() {
		Map<String, String> opcoesMenu = new HashMap<String, String>();
		opcoesMenu.put("1", "cadastrar usu�rio");
		opcoesMenu.put("2", "mostrar detalhes de um usu�rio");
		opcoesMenu.put("3", "remover usu�rio");
		opcoesMenu.put("4", "listar todos usu�rios");
		opcoesMenu.put("5", "sair do programa");

		String resposta;
		do {
			console.exibirTitulo("Sistema de gest�o de usu�rios");
			resposta = console.perguntaComEscolha("O que voc� deseja fazer?", opcoesMenu);
			console.pulaLinhas(2);
			switch (resposta) {
			case "1":
				console.exibirTitulo("Cadastrar usu�rio");
				servicoUsuario.cadastrarUsuario();
				break;
			case "2":
				console.exibirTitulo("Detalhar usu�rio");
				servicoUsuario.detalharUsuario();
				break;
			case "3":
				console.exibirTitulo("Excluir usu�rio");
				servicoUsuario.excluirUsuario();
				break;
			case "4":
				console.exibirTitulo("Listar usu�rios");
				servicoUsuario.listarUsuarios();
			}
			console.pulaLinhas(2);
		} while (!resposta.equals("5"));
		System.out.println("Obrigado por usar o sistema de gest�o de usu�rios vers�o 1.0");
	}
}


