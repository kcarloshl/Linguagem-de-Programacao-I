package ExemploErrado;
public class Main {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro("ABC-123");
        Estacionamento e = new EstacionamentoGratuito();

        e.estacionarCarro(carro);
        e.getCapacidade();
        e.sairDaVagaComCarro(carro);
    }
}
