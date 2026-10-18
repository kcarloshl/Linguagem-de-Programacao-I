package ExerciciosRevisao.Exercicio4;

public class Main {
    
    public static void main(String[] args) {
        
        Aluno A = new Aluno();
        Aluno B = new Aluno();
        Aluno C = new Aluno();

        A.setNome("Carlos");
        A.setIdade(20);
        A.setMatricula(1);
        A.setCurso("Sistema de Informações");

        B.setNome("Suzane");
        B.setIdade(19);
        B.setMatricula(2);
        B.setCurso("Administração");

        C.setNome("Felipe");
        C.setIdade(20);
        C.setMatricula(3);
        C.setCurso("Engenharia Florestal");

        A.informacoes();
        B.informacoes();
        C.informacoes();
    }
}
