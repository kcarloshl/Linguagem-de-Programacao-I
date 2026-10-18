package Execao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo4 {

    public static void main(String[] args) {

        try {
            int x = Integer.parseInt("1");
            BufferedReader br = new BufferedReader(
                    new FileReader("arquivo.txt"));
        } catch (NumberFormatException e) {
            System.out.println("Falha na conversão.");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage() + e.getClass());
        }
    }
}
