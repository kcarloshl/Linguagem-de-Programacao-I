package Construtores;

public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {

        this.ladoA = this.ladoB = this.ladoC = 1;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(Triangulo outro) {
        this.ladoA = outro.ladoA;
        this.ladoB = outro.ladoB;
        this.ladoC = outro.ladoC;
    }

    public void setLadoA(double ladoA) {
        if (ladoA <= 0) {
            ladoA = 1;
        }
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void mostra() {

        System.out.println("Lado A: " + this.getLadoA());
        System.out.println("Lado B: " + this.getLadoB());
        System.out.println("Lado C: " + this.getLadoC());
    }

    public double calcularPerimetro() {
        double resultado;
        resultado = this.ladoA + this.ladoB + this.ladoC;

        return resultado;
    }

    public String tipoTrinagulo() {

        String resultado;

        if (this.ladoA == this.ladoB && this.ladoA == this.ladoC) {
            resultado = "Equilatero";
        } else if (this.ladoA != this.ladoB && this.ladoA != this.ladoC && this.ladoB != this.ladoC) {
            resultado = "Escaleno";
        } else {
            resultado = "Isoceles";
        }

        return resultado;
    }
}
