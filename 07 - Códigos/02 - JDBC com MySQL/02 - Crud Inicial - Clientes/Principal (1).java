package com.example.jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal extends JFrame {
    private static final String URL = "jdbc:mysql://localhost:3306/clientes_java";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private JTextField nomeField;
    private JTextField emailField;
    private JTextField idField;
    private JTextArea outputArea;

    public Principal() {
        setTitle("Cadastro de Clientes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        idField = new JTextField(5);
        nomeField = new JTextField(15);
        emailField = new JTextField(15);
        JButton addButton = new JButton("Adicionar Cliente");
        JButton listButton = new JButton("Listar Clientes");
        JButton updateButton = new JButton("Atualizar Cliente");
        JButton deleteButton = new JButton("Excluir Cliente");

        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(nomeField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);
        inputPanel.add(listButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String email = emailField.getText();
                if (!nome.isEmpty() && !email.isEmpty()) {
                    try {
                        createCliente(nome, email);
                        outputArea.append("Cliente adicionado: " + nome + "\n");
                        nomeField.setText("");
                        emailField.setText("");
                    } catch (SQLException ex) {
                        outputArea.append("Erro ao adicionar cliente: " + ex.getMessage() + "\n");
                    }
                } else {
                    outputArea.append("Por favor, preencha todos os campos.\n");
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idText = idField.getText();
                String novoNome = nomeField.getText();
                String novoEmail = emailField.getText();
                if (!idText.isEmpty() && !novoNome.isEmpty() && !novoEmail.isEmpty()) {
                    int id = Integer.parseInt(idText);
                    try {
                        updateCliente(id, novoNome, novoEmail);
                        outputArea.append("Cliente atualizado: ID " + id + " para Nome " + novoNome + " e Email " + novoEmail + "\n");
                        nomeField.setText("");
                        emailField.setText("");
                        idField.setText("");
                    } catch (SQLException ex) {
                        outputArea.append("Erro ao atualizar cliente: " + ex.getMessage() + "\n");
                    }
                } else {
                    outputArea.append("Por favor, preencha todos os campos.\n");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idText = idField.getText();
                if (!idText.isEmpty()) {
                    int id = Integer.parseInt(idText);
                    try {
                        deleteCliente(id);
                        outputArea.append("Cliente deletado: ID " + id + "\n");
                        idField.setText("");
                    } catch (SQLException ex) {
                        outputArea.append("Erro ao deletar cliente: " + ex.getMessage() + "\n");
                    }
                } else {
                    outputArea.append("Por favor, insira o ID do cliente.\n");
                }
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    readClientes();
                } catch (SQLException ex) {
                    outputArea.append("Erro ao listar clientes: " + ex.getMessage() + "\n");
                }
            }
        });
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void createCliente(String nome, String email) throws SQLException {
        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
        }
    }

    private void readClientes() throws SQLException {
        String sql = "SELECT * FROM clientes";
        StringBuilder output = new StringBuilder();
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            output.append("Lista de Clientes:\n");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                output.append("ID: " + id + ", Nome: " + nome + ", Email: " + email + "\n");
            }
        }
        outputArea.setText(output.toString());
    }

    private void updateCliente(int id, String novoNome, String novoEmail) throws SQLException {
        String sql = "UPDATE clientes SET nome = ?, email = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, novoNome);
            pstmt.setString(2, novoEmail);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        }
    }

    private void deleteCliente(int id) throws SQLException {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Principal app = new Principal();
            app.setVisible(true);
   });
}
}