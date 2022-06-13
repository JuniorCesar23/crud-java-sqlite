package com.junior.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IniciarConexao {

    private static Connection connection = null;

    public static Connection iniciarConexao() {
        if (connection == null) {
            try {
                String url = "jdbc:sqlite::memory";
                connection = DriverManager.getConnection(url);
                System.out.println("Conexão iniciada!");
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return connection;
    }
}
