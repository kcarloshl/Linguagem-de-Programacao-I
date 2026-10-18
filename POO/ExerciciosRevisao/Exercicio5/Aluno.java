package ExerciciosRevisao.Exercicio5;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private int idade;

    public Aluno() {
        System.out.println("Construtor sem parâmetros chamado!\n");
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, String curso, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void informacoes() {
        System.out.println("\nAluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }

}