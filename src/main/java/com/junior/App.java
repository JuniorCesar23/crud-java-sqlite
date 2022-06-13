package com.junior;

import java.sql.Connection;

import com.junior.connections.FecharConexao;
import com.junior.connections.IniciarConexao;

public class App {
    public static void main(String[] args) {
    
        Connection connection = IniciarConexao.iniciarConexao();

        FecharConexao.fecharConexao(connection);
    
    }
}
