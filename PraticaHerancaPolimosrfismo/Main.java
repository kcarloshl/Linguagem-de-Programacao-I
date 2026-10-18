public class Main {
    
    public static void main(String[] args) {
        Funcionario F = new Funcionario("Pedro", 1, 1200);
        Gerente G = new Gerente(F.getNome(), F.getCpf(), F.getSalario(), "RH");

        /*
        F.Imprimir();
        System.out.println("\n");
        G.Imprimir();
        System.out.println("\n");

        G.alterarInformacao("Italo", 4, 3200, "Financeiro");
        */
        G.Imprimir();
    }
}
