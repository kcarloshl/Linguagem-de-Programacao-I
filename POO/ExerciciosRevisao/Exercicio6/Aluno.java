package ExerciciosRevisao.Exercicio6;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private int idade;

    public Aluno(String nome, int matricula, String curso, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
    }

    public void informacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Universidade: " + Universidade.getNomeInstituicao());
        System.out.println();
    }
}
