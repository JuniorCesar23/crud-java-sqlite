package com.junior;

import java.sql.Connection;

import com.junior.connections.FecharConexao;
import com.junior.connections.IniciarConexao;
import com.junior.database.CriarTabela;
import com.junior.database.InserirDados;

public class App {
    public static void main(String[] args) {
    
        Connection connection = IniciarConexao.iniciarConexao();

        CriarTabela.criarTabela(connection); 

        InserirDados.inserirDados(connection);

        FecharConexao.fecharConexao(connection);
    
    }
}
