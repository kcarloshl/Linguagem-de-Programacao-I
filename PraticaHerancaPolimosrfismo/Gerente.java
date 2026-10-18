public class Gerente extends Funcionario {

    private String setorResponsavel;

    public Gerente(String nome, int cpf, int salario, String setorResponsavel) {

        super(nome, cpf, salario);
        this.setorResponsavel = setorResponsavel;

    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Setor Responsavel: " + getSetorResponsavel());
    }

    public void alterarInformacao(String novoNome, int novoCPF, int novoSalario, String novoSetorResponsavel) {
        setNome(novoNome);
        setCpf(novoCPF);
        setSalario(novoSalario);
        setSetorResponsavel(novoSetorResponsavel);
    }

    // O diretivo @Override serve para indicar que o metodo a seguir esta
    // sobrescrevendo
    // a implementacao da class pai, o metodo esta implementado la e sera modificado
    // aqui.
    @Override
    public double getBonificacao() {
        return (getSalario() * 0.15) + 1000;
        // return super.getBonificacao() + 1000;
    }

}
