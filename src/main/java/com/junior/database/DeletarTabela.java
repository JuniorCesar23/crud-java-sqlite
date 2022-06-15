package com.junior.database;

import java.sql.Connection;
import java.sql.Statement;

public class DeletarTabela {

    public static void deletarTabela(Connection connection){
        try (Statement statement = connection.createStatement()) {
            
            statement.execute("drop table pessoa");

            System.out.println("Tabela deletada");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
