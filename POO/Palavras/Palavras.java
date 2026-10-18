package Palavras;

public class Palavras {
    
    private static final int MAX = 50;
    private String[] elementos;
    private int qtd;

    Palavras() {
        this.qtd = 0;
        this.elementos = new String[MAX];
    }

    public void add (String p) {
        if (this.qtd >= MAX) {
            System.out.println("Lista cheia.");
            return;
        }

        this.elementos[this.qtd] = p;
        this.qtd++;
    }

    public void mostra() {
        for(int i = 0; i < this.qtd; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public String obterPalavra (int idx) {
        return this.elementos[idx];
    }

    public int tamanho () {
        return this.qtd;
    }

}
