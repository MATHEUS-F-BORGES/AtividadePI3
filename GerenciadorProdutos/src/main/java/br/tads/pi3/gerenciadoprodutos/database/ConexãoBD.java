package br.tads.pi3.gerenciadoprodutos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author marcos.sbrito2
 */
public class ConexãoBD {

    public static Connection getConnection() throws SQLException {
        //Conexão para abertura e fechamento
        Connection conexão = null;
        //Só tenta abrir uma conexão se não existir ou estiver fechada            
        //Endereço de conexão com o banco de dados
        String dbURL = "jdbc:mysql://localhost:3306/produtobd";
        //Propriedades para armazenamento de usuário e senha
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "");
        properties.put("serverTimezone", "UTC");
        //Realiza a conexão com o banco
        conexão = DriverManager.getConnection(dbURL, properties);
        //Retorna a conexão
        return conexão;
    }

}
