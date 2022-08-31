package desafio7Metodos;

public class Imovel {

	int id;
	int cozinha;
	int sala;
	int quarto;
	int banheiro;
	int varanda;
	String cor;
	double aluguel;

	Locatario locatario;
	Situacao disponibilidade;

	void exibirDescricaoImovel() {
		System.out.println(
				"Kitnet " + id + "\n" + "\nDESCRIÇÃO" + "\ncozinha: " + cozinha + "\nsala: " + sala + "\nquarto: "
						+ quarto + "\nbanheiro: " + banheiro + "\nvaranda: " + varanda + "\ncor: " + cor + "\naluguel: "
						+ aluguel);
	}
	
}
