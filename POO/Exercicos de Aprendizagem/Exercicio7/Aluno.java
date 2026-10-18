public class Aluno {

    String nomealuno;
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNome(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public void setNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar a situação do aluno
    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 60) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
