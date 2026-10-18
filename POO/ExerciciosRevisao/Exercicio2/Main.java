package ExerciciosRevisao.Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n;

        System.out.println("\nDigite um numero:");
        n = cin.nextInt();
        Stack C = new Stack(n);
        System.out.println("\nElememto(s):");
        C.show();
        System.out.println("\nRemovido(s): ");
        while (!C.isEmpty()) {
            System.out.println(C.pop());
        }

        cin.close();
    }
}
