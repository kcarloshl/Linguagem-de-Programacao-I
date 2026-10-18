package EquacaoSegundoGrau;

public class Main {
    
    public static void main(String[] args) {
        
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau();

        eq.SetA(2);
        eq.SetB(-3);
        eq.SetC(-5);

        eq.CalcularRaiz();
    }
}
