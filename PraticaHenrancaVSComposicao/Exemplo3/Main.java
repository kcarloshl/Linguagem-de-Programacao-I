package Exemplo3;
interface Arma {
    void usar();
}

class Espada implements Arma {
    public void usar() {
        System.out.println("\nEspada Equipada!");
    }
}

class Arco implements Arma {
    public void usar() {
        System.out.println("\nArco Equipado!");
    }
}

class Personagem {
    private Arma arma;
    public Personagem(Arma a) {
        this.arma = a;
    }

    public void setArma(Arma a) {
        this.arma = a;
    }

    void atacar() {
        arma.usar();
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Personagem p = new Personagem(new Espada());
        p.atacar();
        p.setArma(new Arco());
        p.atacar();
    }
}
