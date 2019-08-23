package br.tads.pi3.gerenciadoprodutos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConexaoBD {

    public static Connection getConnection() throws SQLException {
        //Conexão para abertura e fechamento
        Connection conexao = null;
        //Só tenta abrir uma conexao se não existir ou estiver fechada            
        //Endereço de conexao com o banco de dados
        String dbURL = "jdbc:mysql://localhost:3307/produtobd";
        //Propriedades para armazenamento de usuário e senha
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "");
        properties.put("serverTimezone", "UTC");
        //Realiza a conexao com o banco
        conexao = DriverManager.getConnection(dbURL, properties);
        //Retorna a conexao
        return conexao;
    }

}
