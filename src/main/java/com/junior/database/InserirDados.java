package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InserirDados {

    public static void inserirDados(Connection connection) {

        String sql = "INSERT INTO pessoa (nome, email)"
                + " VALUES ('Júnior', 'junior@gmail.com') ";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.executeUpdate();

            System.out.println("Dados inseridos");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
