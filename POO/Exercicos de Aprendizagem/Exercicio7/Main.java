public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Carlos");
        aluno.setNotas(70, 85, 50);

        double media = aluno.calcularMedia();
        String situacao = aluno.verificarSituacao();

        System.out.println("Aluno: " + aluno.nomealuno);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}
