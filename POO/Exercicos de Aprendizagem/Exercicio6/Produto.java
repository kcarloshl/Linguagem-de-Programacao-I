package Exercicio6;

public class Produto {
    
    private String nome;
    private double preco;

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para definir o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para consultar o nome
    public String getNome() {
        return nome;
    }

    // Método para consultar o preço
    public double getPreco() {
        return preco;
    }
}
