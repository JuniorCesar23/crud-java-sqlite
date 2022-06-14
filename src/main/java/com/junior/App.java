package com.junior;

import java.sql.Connection;

import com.junior.connections.FecharConexao;
import com.junior.connections.IniciarConexao;
import com.junior.database.CriarTabela;

public class App {
    public static void main(String[] args) {
    
        Connection connection = IniciarConexao.iniciarConexao();

        CriarTabela.criarTabela(connection);

        FecharConexao.fecharConexao(connection);
    
    }
}
