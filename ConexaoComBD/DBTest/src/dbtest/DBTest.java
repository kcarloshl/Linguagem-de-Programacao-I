package dbtest;

import java.sql.*;
import java.util.Scanner;

public class DBTest {

    public static void main(String[] args) {
       
        // Parametros de conexão
        String url = "jdbc:mysql://localhost/dbtest";
        String user = "root";
        String pwd = "root";
        
        Connection conn = null;
        try {
            // Selecionar o drive JBDC para aplicação
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelecer a conexão com o BD
            conn = DriverManager.getConnection(url, user, pwd);
            
            String nome;
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Informe um nome: ");
            nome = scan.next();
            
            String sql = "insert into Clientes (nome) values ( ? );";
            
            // Preparar o comando sql
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            
            int linhas = stmt.executeUpdate();
            
            if (linhas > 0) {
                System.out.println("Cliente inserido com sucesso.");
            }
            else {
                System.out.println("Nenhum cliente foi inserido.");
            }
            
            sql = "select * from Clientes;";
            
            Statement stmt2 = conn.createStatement();
            ResultSet rs = stmt2.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("\nCódigo: " + rs.getString("id_cliente"));
                System.out.println("Nome: " + rs.getString("nome"));
            }
            
            conn.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro no BD: " + ex.getMessage());
        }
        
    }
    
}
