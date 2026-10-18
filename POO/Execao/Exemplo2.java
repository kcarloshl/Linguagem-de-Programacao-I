package Execao;

import java.util.concurrent.ExecutionException;

public class Exemplo2 {
    
    public static void main(String[] args) {
        
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Erro! Divisão por zero.");
        }

        System.out.println("Programa Continuando!");
    }
}
