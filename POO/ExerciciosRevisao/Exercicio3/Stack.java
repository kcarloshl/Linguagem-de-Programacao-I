package ExerciciosRevisao.Exercicio3;

public class Stack {

    private Node top;
    private int size;

    public Stack() { // Criando uma pilha vazia.
        this.top = null;
        this.size = 0;
    }

    public void push(int item) { // Empilhar.
        Node t = new Node(item);
        t.next = this.top;
        this.top = t;
        this.size++;
    }

    public boolean isEmpty() { // Verificar se está vazia.
        return this.top == null;
    }

    public int size() { // Retorna tamanho
        return this.size;
    }

    public int pop() { // Desempilhar
        if (this.isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        int item = this.top.item;
        this.top = this.top.next;
        this.size--;
        return item;
    }

    public int top() { // Retorna o item do topo.
        if (this.isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return this.top.item;
    }

    public Stack(Stack outro) { // Construtor de copia
        Node t = outro.top;
        Stack S = new Stack();

        while (t != null) {
            S.push(t.item);
            t = t.next;
        }
        this.top = null;
        this.size = 0;

        while (!S.isEmpty()) {
            this.push(S.pop());
        }
    }

    public void show() { // Metodo para imprimir
        Node t = this.top;

        while (t != null) {
            System.out.println(t.item);
            t = t.next;
        }
    }

    public Stack(int n) { // Criando pilha apartir de um n
        this.top = null;
        this.size = 0;

        for (int i = 1; i <= n; i++) {
            this.push(i);
        }
    }

    public static boolean equals(Stack A, Stack B) { // Verificando se duas pilhas são iguais

        if (A.size != B.size) {
            return false;
        } else {
            Node t1 = A.top;
            Node t2 = B.top;

            while (t1 != null) {
                if (t1.item != t2.item) {
                    return false;
                }
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return true;
    }

}

class Node {

    public int item;
    public Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }
}
