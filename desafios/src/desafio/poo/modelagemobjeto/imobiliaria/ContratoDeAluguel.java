package desafio.poo.modelagemobjeto.imobiliaria;

public class ContratoDeAluguel {

//	String tempoDeLocacao;
//	String dataInicioAluguel;
//	String dataFinalAluguel;

	Locador locador;
	Locatario locatario;
	Imovel imovel;

	void exibirContrato() {
		System.out.println("                     CONTRATO DE LOCA��O DE IMOV�L\n");
		System.out.println("LOCADOR(A): " + locador.nome + " brasileiro, " + locador.estadoCivil + ", " + locador.ocupacao + ", \n"
						+ "portador da C�dula de Identidade RG n� " + locador.rg + ", inscrito(a) no CPF sob o n� "
								+ locador.cpf + ", \nresidente na " + locador.endereco + ", CEP: " + locador.cep + ", \ne"
										+ " endere�o eletr�nico " + locador.email + ".\n");
		System.out.println("LOCAT�RIO(A): " + locatario.nome + " brasileiro, " + locatario.estadoCivil + ", " + locatario.ocupacao + ", \n"
				+ "portador da C�dula de Identidade RG n� " + locatario.rg + ", inscrito(a) no CPF sob o n� "
				+ locatario.cpf + ", \nresidente na " + locatario.endereco + ", CEP: " + locatario.cep + ", \ne"
				+ " endere�o eletr�nico " + locatario.email + ".\n");
		
		System.out.println("OBJETO\n\n" + "Cl�usula 1. O presente Contrato tem por objeto a loca��o do im�vel de uso residencial , situado"
				+ " na \nRua Melchior Giola, 100, Parais�polis, S�o Paulo - SP, CEP: 00000000, composto por: " + imovel.cozinha + " "
						+ "cozinha, \n" + imovel.quarto + " quarto(s), " + imovel.sala + " sala " + ", " + imovel.banheiro + " banheiro "
								+ imovel.varanda + " varanda,  com o total de 20 metros quadrados(im�vel).");
		
	}

}