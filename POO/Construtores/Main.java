package Construtores;

public class Main {

    public static void main(String[] args) {

        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo(10, 20, 20);
        Triangulo c = new Triangulo(b);

        c.setLadoA(50);
        a.setLadoB(80);
        a.setLadoC(99);

        System.out.println("\nTriangulo A:");
        a.mostra();

        System.out.println("\nTriangulo B:");
        b.mostra();

        System.out.println("\nTriangulo C:");
        c.mostra();

        System.out.println("\n Soma do Perimetro e Tipo do Triangulo A:");
        System.out.println("  " + a.calcularPerimetro());
        System.out.println("  " + a.tipoTrinagulo());

        System.out.println("\n Soma do Perimetro e Tipo do Triangulo B:");
        System.out.println("  " + b.calcularPerimetro());
        System.out.println("  " + b.tipoTrinagulo());

        System.out.println("\n Soma do Perimetro e Tipo do Triangulo C:");
        System.out.println("  " + c.calcularPerimetro());
        System.out.println("  " + c.tipoTrinagulo());
    }
}
