package com.junior.database;

import java.sql.Connection;
import java.sql.Statement;

public class CriarTabela {

    public static void criarTabela(Connection connection) {

        try (Statement statement = connection.createStatement()) {

            String criarTabela = "CREATE TABLE pessoa ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "nome VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(50) NOT NULL UNIQUE"
                    + ")";

            statement.execute(criarTabela);

            System.out.println("Tabela criada");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
