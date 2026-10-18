package Exercicio6;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Notebook");
        p.setPreco(3500.00);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
    }
}
