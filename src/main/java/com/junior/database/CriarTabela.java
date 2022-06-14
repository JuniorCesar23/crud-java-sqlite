package com.junior.database;

import java.sql.Connection;
import java.sql.Statement;

public class CriarTabela {

    public static void criarTabela(Connection connection) {

        try (Statement statement = connection.createStatement()) {

            String criarTabela = "CREATE TABLE IF NOT EXISTS pessoa ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nome VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(50) NOT NULL"
                    + ")";

            statement.execute(criarTabela);

            System.out.println("Tabela criada");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
