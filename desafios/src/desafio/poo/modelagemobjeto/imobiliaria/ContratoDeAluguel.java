package desafio.poo.modelagemobjeto.imobiliaria;

public class ContratoDeAluguel {

//	String tempoDeLocacao;
//	String dataInicioAluguel;
//	String dataFinalAluguel;

	Locador locador;
	Locatario locatario;
	Imovel imovel;

	void exibirContrato() {
		System.out.println("                     CONTRATO DE LOCAÇÃO DE IMOVÉL\n");
		System.out.println("LOCADOR(A): " + locador.nome + " brasileiro, " + locador.estadoCivil + ", " + locador.ocupacao + ", \n"
						+ "portador da Cédula de Identidade RG nº " + locador.rg + ", inscrito(a) no CPF sob o nº "
								+ locador.cpf + ", \nresidente na " + locador.endereco + ", CEP: " + locador.cep + ", \ne"
										+ " endereço eletrônico " + locador.email + ".\n");
		System.out.println("LOCATÁRIO(A): " + locatario.nome + " brasileiro, " + locatario.estadoCivil + ", " + locatario.ocupacao + ", \n"
				+ "portador da Cédula de Identidade RG nº " + locatario.rg + ", inscrito(a) no CPF sob o nº "
				+ locatario.cpf + ", \nresidente na " + locatario.endereco + ", CEP: " + locatario.cep + ", \ne"
				+ " endereço eletrônico " + locatario.email + ".\n");
		
		System.out.println("OBJETO\n\n" + "Cláusula 1. O presente Contrato tem por objeto a locação do imóvel de uso residencial , situado"
				+ " na \nRua Melchior Giola, 100, Paraisópolis, São Paulo - SP, CEP: 00000000, composto por: " + imovel.cozinha + " "
						+ "cozinha, \n" + imovel.quarto + " quarto(s), " + imovel.sala + " sala " + ", " + imovel.banheiro + " banheiro "
								+ imovel.varanda + " varanda,  com o total de 20 metros quadrados(imóvel).");
		
	}

}