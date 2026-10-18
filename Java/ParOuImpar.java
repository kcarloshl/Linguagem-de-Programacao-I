import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n;

        System.out.println("Digite um número:");

        n = cin.nextInt();

        if (n % 2 == 0) {

            System.out.println("Par.");
        } else {

            System.out.println("Impar.");
        }
        cin.close();
    }
    
}
