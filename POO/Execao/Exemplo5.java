package Execao;

public class Exemplo5 {

    public static void verificarIdade(int idade) {

        if (idade < 18) {
            throw new IllegalArgumentException("Menores de 18 não são permitidos!");
        }

        System.out.println("Acesso permitido!");
    }

    public static void main(String[] args) {

        try {
            verificarIdade(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Excesso de capturas " + e.getMessage());
        }
    }
}