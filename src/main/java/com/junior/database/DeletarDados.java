package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletarDados {

    public static void deletarDados(Connection connection) {

        String sql = "DELETE FROM pessoa WHERE email = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);) {

            System.out.println("Informe o E-mail que será deletado: ");
            String email = scanner.next();

            preparedStatement.setString(1, email);

            int linhasAfetadas = preparedStatement.executeUpdate();

            // VERIFICAR SE O E-MAIL INFORMADO REALMENTE FOI DELETADO
            if (linhasAfetadas == 0){
                System.out.println("! ERRO !");
                throw new Exception("E-mail não encontrado");
            }

            System.out.println("Dado deletado com sucesso! Linhas afetadas: " + linhasAfetadas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
