package ExerciciosRevisao.Exercicio1;

public class Main {

    public static void main(String[] args) {

        Stack A = new Stack();

        //try {

            A.push(10);
            A.push(20);
            A.push(30);

            Stack B = new Stack(A);
            A.pop();

            System.out.println("\nAqui é A:");
            A.show();

            System.out.println("\nAqui é B:");
            B.show();

       /* } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}
