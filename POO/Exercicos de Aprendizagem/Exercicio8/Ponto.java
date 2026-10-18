public class Ponto {

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método para exibir as coordenadas do ponto
    public void exibirCoordenadas() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outro) {
        double dx = outro.x - this.x;
        double dy = outro.y - this.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}