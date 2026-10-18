/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;
import java.sql.*;

/**
 *
 * @author carlo
 */
public class Conexoes {
    
    private static final String url = "jdbc:mysql://localhost/exercicio10";
    private static final String user = "root";
    private static final String pwd = "kaka";
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pwd);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro: Driver JDBC não encontrado. " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexao com banco de dados: " + e.getMessage());
        }
    }
}
