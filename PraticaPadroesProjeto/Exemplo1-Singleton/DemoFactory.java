public class DemoFactory {

    public static void main(String[] args) {

        Logistica logistica1 = new LogisticaRodoviaria();
        logistica1.realizarEntrega();
        
        Logistica logistica2 = new LogisticaMaritima();
        logistica2.realizarEntrega();
    }
}

interface Transporte {

    void entregar();
}

class Caminhao implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega via terra.");
    }
}

class Navio implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega via mar.");
    }
}

abstract class Logistica {

    public abstract Transporte criarTransporte();

    public void realizarEntrega() {

        Transporte t = criarTransporte();

        t.entregar();
    }
}

class LogisticaRodoviaria extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}

class LogisticaMaritima extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}