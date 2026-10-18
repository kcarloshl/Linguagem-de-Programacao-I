package ExerciciosRevisao.Exercicio4;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String curso;
    private int idade;

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
        System.out.println("Aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }

}