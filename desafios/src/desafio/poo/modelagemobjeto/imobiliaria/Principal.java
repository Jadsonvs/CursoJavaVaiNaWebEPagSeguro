package desafio.poo.modelagemobjeto.imobiliaria;

public class Principal {

	public static void main(String[] args) {
		Imovel kitnet = new Imovel();
		kitnet.id = 01;
		kitnet.cozinha = 1;
		kitnet.sala = 1;
		kitnet.quarto = 2;
		kitnet.banheiro = 1;
		kitnet.cor = "branca";
		kitnet.aluguel = 500;
		
		Pagamento pagamento = new Pagamento(kitnet);
		
		Locador locador = new Locador();
		locador.nome = "Jadson Viana dos Santos";
		locador.estadoCivil = "Solteiro";
		locador.ocupacao = "Empregado";
		locador.rg = 123456789;
		locador.cpf = 000000000000;
		locador.endereco = "Rua Melchior Giola, 100, Paraisópolis, São Paulo - SP";
		locador.cep = 00000000;
		locador.idade = 22;
		locador.email = "email@email.com";
		
		Locatario locatario01 = new Locatario();
		locatario01.nome = "Jadson Viana dos Santos";
		locatario01.estadoCivil = "Solteiro";
		locatario01.ocupacao = "Empregado";
		locatario01.rg = 000000000;
		locatario01.cpf = 000000000000;
		locatario01.endereco = "Rua Melchior Giola, 100, Paraisópolis, São Paulo - SP";
		locatario01.cep = 00000000;
		locatario01.idade = 22;
		locatario01.email = "email@email.com";
		
		ContratoDeAluguel contrato01 = new ContratoDeAluguel();
		contrato01.locador = locador;
		contrato01.locatario = locatario01;
		contrato01.imovel = kitnet;
		
//		contrato01.exibirContrato(); Descomentar para visualizar.
		kitnet.exibirDescricaoImovel(); 
		pagamento.exibirPagamento();
		
	}

}
