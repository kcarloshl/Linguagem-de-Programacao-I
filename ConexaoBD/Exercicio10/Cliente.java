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
public class Cliente {

    private int id;
    private String nome;

    public Cliente() {
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserir() {
        String sql = "insert into clientes (nome) values (?)";
        try (Connection conn = Conexoes.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, this.nome);
            stmt.executeUpdate();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir: " + e.getMessage());
        }
    }

    public void alterar(Cliente novoCliente) {
        String sql = "update clientes set nome = ? where id_cliente = ?";
        try (Connection conn = Conexoes.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoCliente.getNome());
            stmt.setInt(2, this.id);
            stmt.executeUpdate();

            this.nome = novoCliente.getNome();
            System.out.println("Cliente do ID " + this.id + " alterado");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao alterar cliente: " + e.getMessage());
        }
    }

    public void carregar(int id) {
        String sql = "select * from clientes where id_cliente = ?";
        try (Connection conn = Conexoes.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    this.id = rs.getInt("id_cliente");
                    this.nome = rs.getString("nome");
                } else {
                    System.out.println("Cliente não encontrado.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao carregar: " + e.getMessage());
        }
    }

    public void excluir() {
        String sql = "DELETE FROM clientes WHERE id_cliente = ?";
        try (Connection conn = Conexoes.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, this.id);
            stmt.executeUpdate();
            System.out.println("Cliente excluído.");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir: " + e.getMessage());
        }
    }   
}
