public class Funcionario {

    protected String nome;
    protected int cpf;
    protected int salario;

    Funcionario(String nome, int cpf, int salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCpf(int novoCPF) {
        this.cpf = novoCPF;
    }

    public void setSalario(int novoSalario) {
        this.salario = novoSalario;
    }

    public void Imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bonificacao: " + getBonificacao());

    }

    public double getBonificacao() {
        return(getSalario() * 0.10);
    }
 }