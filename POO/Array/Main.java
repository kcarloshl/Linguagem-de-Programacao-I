package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();

        A.add(10);
        A.add(20);
        A.add(30);
        A.add(1, 50);
        A.set(3, 90);

        System.out.println("Tamanho: " + A.size());

        System.out.println("Elementos: ");
        for(int i = 0; i < A.size(); i++)
        {
            System.out.print(A.get(i) + " ");
        }
        
        
        /*int[] A = new int[5];

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < A.length; i++)
        {
            System.out.println("Digite um numero: ");
            A[i] = in.nextInt();
        }
        
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }

        in.close();*/
    }
}
