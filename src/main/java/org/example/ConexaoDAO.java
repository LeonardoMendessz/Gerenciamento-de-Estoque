package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conetardb(){
        Connection conexao = null;

        try{
            String url = "jdbc:mysql://localhost:3306/estoque";
            String usuario = "root";
            String senha = "Leo3242@";
            conexao = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexao feita com sucesso!");


        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return conexao;
    }
}
