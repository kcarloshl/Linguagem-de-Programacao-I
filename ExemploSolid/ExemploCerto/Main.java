package ExemploCerto;

public class Main {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro("ABC-123");
        EstacionamentoGratuito e1 = new EstacionamentoGratuito();
        EstacionamentoPago e2 = new EstacionamentoPago();

        e1.estacionarCarro(carro);
        e1.getCapacidade();
        e2.sairDaVagaComCarro(carro);
    }
}
