package ExerciciosRevisao.Exercicio5;

public class Main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setIdade(20);
        a1.setMatricula(1);
        a1.setCurso("Sistemas de Informação");

        Aluno a2 = new Aluno("Suzane", 2);
        a2.setCurso("Administração");
        a2.setIdade(19);

        Aluno a3 = new Aluno("Felipe", 3, "Engenharia Florestal", 20);

        a1.informacoes();
        a2.informacoes();
        a3.informacoes();
    }
}
