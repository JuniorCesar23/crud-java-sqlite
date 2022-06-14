package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeletarDados {

    public static void deletarDados(Connection connection){

        String sql = "delete from pessoa where email = 'junior@gmail.com'";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.executeUpdate();

            System.out.println("Dado deletado");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
