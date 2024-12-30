package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {
    private static final String URL = "jdbc:mysql://localhost:3306/clientes_java";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Estabelecendo a conexão
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão bem-sucedida!");

            // Realizando operações CRUD
            createCliente(connection, "Carlos Silva", "carlos@example.com");
            createCliente(connection, "Silas Kando", "silas@kando.com.br");
            createCliente(connection, "Renato Por Deus Furtado", "renatinho@gmail.com");
            createCliente(connection, "Jacinto Alegria", "jacinto@teste.com");
            readClientes(connection);
            updateCliente(connection, 1, "Carlos S.");
            deleteCliente(connection, 1);
            readClientes(connection);

        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        } finally {
            // Fechando a conexão
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexão encerrada.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }

    // Método para criar um novo cliente
    private static void createCliente(Connection connection, String nome, String email) throws SQLException {
        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("Cliente adicionado: " + nome);
        }
    }

    // Método para ler todos os clientes
    private static void readClientes(Connection connection) throws SQLException {
        String sql = "SELECT * FROM clientes";
        try (PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            System.out.println("Lista de Clientes:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);
            }
        }
    }

    // Método para atualizar um cliente
    private static void updateCliente(Connection connection, int id, String novoNome) throws SQLException {
        String sql = "UPDATE clientes SET nome = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, novoNome);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Cliente atualizado: ID " + id + " para Nome " + novoNome);
        }
    }

    // Método para deletar um cliente
    private static void deleteCliente(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Cliente deletado: ID " + id);
        }
    }
}