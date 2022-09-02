package desafio.poo.modelagemobjeto.imobiliaria;

public class Pagamento {
	
	double valor;
	double desconto;
	double juros;
	double total;
	
	Imovel imovel;
	SituacaoPagamento situacaoPagamento;
	
	
	Pagamento(Imovel imovel){
		valor = imovel.aluguel;
		situacaoPagamento = SituacaoPagamento.PENDENTE;
	}
	
	void exibirPagamento() {
		System.out.println("\n---------- PAGAMENTO ----------");
		System.out.println("SITUAÇÃO: " + situacaoPagamento + "\nVALOR: " + valor + "\nJUROS: " + juros + "\nDESCONTO: " + desconto + "\nTOTAL: " + total);
	}
	
	double pagar(){
		//TODO
		return 0;
	}
	
	double calcularTotal(Pagamento valor, Pagamento juros, Pagamento desconto) {
		//TODO
		return 0;
	}
	
	SituacaoPagamento trocarSituacaoPagamento(SituacaoPagamento novaSituacao) {
		//TODO
		return novaSituacao;
	}
	


}
