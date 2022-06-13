package com.junior.connections;

import java.sql.Connection;
import java.sql.SQLException;

public class FecharConexao {

    public static void fecharConexao(Connection connection){
        if (connection != null){
            try {
                connection.close();
                System.out.println("Conexão fechada!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
