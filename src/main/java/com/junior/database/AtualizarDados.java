package com.junior.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AtualizarDados {

    public static void atualiarDados(Connection connection){
        
        String sql = "UPDATE pessoa "
        + "SET nome = 'César'"
        + "WHERE (email = 'junior@gmail.com')";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.executeUpdate();

            System.out.println("Dado atualizado!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
