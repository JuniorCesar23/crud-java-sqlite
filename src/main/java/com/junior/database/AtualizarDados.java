package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AtualizarDados {

    public static void atualiarDados(Connection connection) {

        String sql = "UPDATE pessoa "
                + "SET nome = ?"
                + "WHERE (email = ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);) {

            System.out.println("--- ATUALIZAR DADOS ---");

            System.out.println("Novo nome: ");
            String nome = scanner.nextLine();

            System.out.println("E-mail: ");
            String email = scanner.next();

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);

            int linhasAfetadas = preparedStatement.executeUpdate();

            // VERIFICAR SE O E-MAIL INFORMADO FOI ENCONTRADO
            if (linhasAfetadas == 0){
                throw new Exception("Nenhuma alteração feita!");
            }

            System.out.println("Dado atualizado! Linhas afetadas: " + linhasAfetadas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
