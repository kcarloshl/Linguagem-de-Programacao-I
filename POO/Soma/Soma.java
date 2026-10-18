package Soma;
public class Soma {

    // ATributos Privados.
    private int a;
    private int b;
    private int c;

    // Metodos públicos.
    public void inicializa(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        this.c = this.a + this.b;

        return this.c;
    }
}
