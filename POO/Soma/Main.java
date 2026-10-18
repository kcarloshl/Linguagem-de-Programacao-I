package Soma;

public class Main {

    public static void main(String[] args) {

        // Criar um objeto da classe soma
        Soma s; //s é uma referência (ponteiro)
        s = new Soma(); // Instanciando o objeto
        //Chamando (invocando) métodos do objeto
        // Enviando mensagens para o objeto
        s.inicializa(10, 20);
        int x = s.soma();
        System.out.println(x);

    }
}
