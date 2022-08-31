package desafio7Metodos;

public class Principal {

	public static void main(String[] args) {
		Imovel kitnet = new Imovel();
		Locatario locatario01 = new Locatario();
		Situacao situacao =  new Situacao();
		
		locatario01.nome = "Jadson Viana dos Santos";
		locatario01.idade = 22;
		locatario01.contato = "953962743";
		locatario01.estadoCivil = "Solteiro";
		locatario01.ocupacao = "Empregado";
		locatario01.cpf = 000000000000;
		locatario01.rg = 000000000;
		locatario01.tempoDeLocacao = "6 meses";
		
		kitnet.id = 01;
		kitnet.cozinha = 1;
		kitnet.sala = 1;
		kitnet.quarto = 2;
		kitnet.banheiro = 1;
		kitnet.cor = "branca";
		kitnet.aluguel = 700;
		
		situacao.situacao = "Alugado";
		
		kitnet.exibirDescricaoImovel();
		locatario01.exibirNomeLocatario();
		situacao.exibirSituacao();
		
	}

}
