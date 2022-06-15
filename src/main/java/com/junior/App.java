package com.junior;

import java.sql.Connection;
import java.sql.Statement;

import com.junior.connections.FecharConexao;
import com.junior.connections.IniciarConexao;
import com.junior.database.AtualizarDados;
import com.junior.database.CriarTabela;
import com.junior.database.DeletarDados;
import com.junior.database.DeletarTabela;
import com.junior.database.InserirDados;
import com.junior.database.VerDados;

public class App {
    public static void main(String[] args) {

        Connection connection = IniciarConexao.iniciarConexao();

        InserirDados.inserirDados(connection);

        VerDados.verDados(connection);

        FecharConexao.fecharConexao(connection);

    }
}
