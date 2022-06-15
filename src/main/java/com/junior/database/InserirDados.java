package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InserirDados {

    public static void inserirDados(Connection connection) {

        String sql = "INSERT INTO pessoa (nome, email)"
                + " VALUES (?, ?) ";

        try (
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);) {

            System.out.println("=== REALIZAR CADASTRO ===");

            System.out.println("Nome: ");
                String nome = scanner.nextLine();

            System.out.println("E-mail: ");
                String email = scanner.next();

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);

            int linhasAfetadas = preparedStatement.executeUpdate();

            System.out.println("Cadastro realizado com sucesso! Linhas afetadas: " + linhasAfetadas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
