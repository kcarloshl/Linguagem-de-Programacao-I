import java.util.Scanner;

public class PrimoOuNao {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);

        int n, aux = 0;

        System.out.println("Digite um número;");
        n = cin.nextInt();

        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                aux++;
            }
        }

        if (aux >= 2) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
        cin.close();
    }

}
