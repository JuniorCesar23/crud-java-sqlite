package com.junior.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class VerDados {

    public static void verDados(Connection connection) {

        String sql = "select * from pessoa";

        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("=== DADOS DO BANCO ===");

            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt("id"));
                System.out.println("Nome: " + resultSet.getString("nome"));
                System.out.println("E-mail: " + resultSet.getString("email"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
