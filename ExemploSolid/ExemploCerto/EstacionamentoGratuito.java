package ExemploCerto;
public class EstacionamentoGratuito implements ControleDeVagas {
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
}
