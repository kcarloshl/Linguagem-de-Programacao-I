/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Cliente c = new Cliente();
        c.setNome("Carlos Henrique");
        c.inserir();
        
        Cliente c2 = new Cliente();
        c2.carregar(6);
        System.out.println("Nome atual: " + c2.getNome());
        
        Cliente c3 = new Cliente();
        c3.setNome("Carlos Lima");
        c2.alterar(c3);
        
        c2.excluir();
    }
    
}
