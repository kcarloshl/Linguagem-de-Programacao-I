public class Main {

    public static void main(String[] args) {

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        p1.setX(2);
        p1.setY(3);

        p2.setX(7);
        p2.setY(9);

        System.out.print("Ponto 1: ");
        p1.exibirCoordenadas();

        System.out.print("Ponto 2: ");
        p2.exibirCoordenadas();

        // Calculando e exibindo a distância
        double distancia = p1.calcularDistancia(p2);
        System.out.println("Distância entre os pontos: " + distancia);
    }
}
