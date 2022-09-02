package desafio.poo.modelagemobjeto.imobiliaria;

public class Imovel {

	int id;
	int cozinha;
	int sala;
	int quarto;
	int banheiro;
	int varanda;
	String cor;
	double aluguel;
	
	SituacaoImovel situacao;
	
	Imovel(){
		situacao = SituacaoImovel.DISPONIVEL;
	}

	void exibirDescricaoImovel() {
		System.out.println(
				"Kitnet " + id + "\n" + "\nDESCRIÇÃO" + "\ncozinha: " + cozinha + "\nsala: " + sala + "\nquarto: "
						+ quarto + "\nbanheiro: " + banheiro + "\nvaranda: " + varanda + "\ncor: " + cor + "\naluguel: "
						+ aluguel + "\nsituação: " + situacao);
	}
	
	SituacaoImovel trocarSituacao(SituacaoImovel novaSituacao) {
		//TODO
		return novaSituacao;
	}
	
}
