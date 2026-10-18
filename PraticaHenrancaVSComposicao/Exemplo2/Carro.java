package Exemplo2;
public class Carro {
    
    private Motor motor;

    public Carro () {
        this.motor = new Motor();
        System.out.println("\nCarro montado com um novo motor.");
    }

    public void dirigir() {

        System.out.println("\nIniciando...");
        motor.ligar();
        System.out.println("Carro esta se movendo.");
    }
}
