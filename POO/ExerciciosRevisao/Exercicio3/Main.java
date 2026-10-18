package ExerciciosRevisao.Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n, m;

        System.out.println("\nDigite um numero:");
        n = cin.nextInt();
        Stack D = new Stack(n);

        System.out.println("\nDigite um numero:");
        m = cin.nextInt();
        Stack E = new Stack(m);

        System.out.println("\nElememto(s) D:");
        D.show();
        System.out.println("\nElememto(s) E:");
        E.show();

        if (Stack.equals(D, E)) {
            System.out.println("\nAs Pilhas são verdadeiras");
        } else {
            System.out.println("\nAs pilhas são diferentes.");
        }

        cin.close();
    }
}