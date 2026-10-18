import java.util.Scanner;

public class Combustiveis {

    public static void main(String[] args) {

        float alcool, gasolina, eficiencia;

        Scanner cin = new Scanner(System.in);

        System.out.println("Digite o preço do Etanol:");
        alcool = cin.nextFloat();

        System.out.println("Digite o preço da Gasolina:");
        gasolina = cin.nextFloat();

        eficiencia = alcool / gasolina;

        if (eficiencia <= 0.7) {
            System.out.println("Abasteça com Etanol.");
        } else {
            System.out.println("Abasteça com Gasolina.");
        }
        cin.close();
    }
}
