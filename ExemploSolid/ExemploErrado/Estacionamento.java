package ExemploErrado;
public interface Estacionamento {

	void estacionarCarro(Carro carro);
	void sairDaVagaComCarro(Carro carro);
	void getCapacidade();
	void calcularTaxa(Carro carro);
	void pagar(Carro carro);
}

class EstacionamentoGratuito implements Estacionamento {

	@Override
	public void estacionarCarro(Carro carro) {
		System.out.println("Carro de Placa: " + carro.getPlaca() + " Estacionado.");
	}

	@Override
	public void sairDaVagaComCarro(Carro carro) {
		System.out.println("Carro de Placa: " + carro.getPlaca() + " Saiu do Estacionamento.");
	}

	@Override
	public void getCapacidade() {
		System.out.println("Existe X vagas no estacionamento.");
	}

	@Override
	public void calcularTaxa(Carro carro) {
		System.out.println("Taxa calculada.");
		
	}

	@Override
	public void pagar(Carro carro) {
		System.out.println("Pagamento bem sucessido.");
	}

}
