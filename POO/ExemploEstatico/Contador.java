package ExemploEstatico;

public class Contador {
    private static int total = 0;

    public Contador() {
        total++;
    }

    public static int getTotal() {
        return total;
    }
}
