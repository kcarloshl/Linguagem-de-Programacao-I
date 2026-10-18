package ExerciciosRevisao.Exercicio6;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Carlos", 1, "Sistemas de Informação", 20);
        Aluno a2 = new Aluno("Suzane", 2, "Administração", 19);

        System.out.println("\nAntes da mudança:\n");
        a1.informacoes();
        a2.informacoes();

        Universidade.setNomeInstituicao("Universidade Federal de Minas Gerais - UFMG");

        System.out.println("\nDepois da mudança:\n");
        a1.informacoes();
        a2.informacoes();
    }
}
