package EquacaoSegundoGrau;

public class EquacaoSegundoGrau {

    private float a;
    private float b;
    private float c;

    public void SetA(float a) {
        this.a = a;
    }

    public void SetB(float b) {
        this.b = b;
    }

    public void SetC(float c) {
        this.c = c;
    }

    public void CalcularRaiz() {

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raizes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A unica raiz da equação é " + x);
        } else {
            double y = (-b + Math.sqrt(delta)) / (2 * a);
            double z = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(" Raizes:\nx\' = " + y + "\nx\'\' = " + z);
        }
    }

}
