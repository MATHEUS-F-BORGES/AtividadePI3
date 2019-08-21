package br.tads.pi3.gerenciadoprodutos.database;

import br.tads.pi3.gerenciadoprodutos.models.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class daoProduto {

    public static void inserir(Produto produto)
            throws SQLException, Exception {
        String sql = "INSERT INTO produto (NOME, DESCRICAO, PRECO_COMPRA, "
                + "PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO) "
                + "VALUES (?,?,?,?,?,?,?)";

        Connection conexao = null;

        PreparedStatement preparedStatement = null;
        try {
            conexao = ConexaoBD.getConnection();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setFloat(3, produto.getpCompra());
            preparedStatement.setFloat(4, produto.getpVenda());
            preparedStatement.setInt(5, produto.getQuantidade());
            preparedStatement.setBoolean(6, true);
            Timestamp dtCadastro = new Timestamp(System.currentTimeMillis());
            preparedStatement.setTimestamp(7,dtCadastro);

            preparedStatement.execute();

        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public static void atualizar(Produto produto)
            throws SQLException, Exception {
       String sql = "UPDATE produto SET NOME=?, DESCRICAO=?, PRECO_COMPRA=?, "
               + "PRECO_VENDA=?, QUANTIDADE=?, DISPONIVEL=?, DT_CADASTRO=? WHERE (ID = ?)";

        Connection conexao = null;

        PreparedStatement preparedStatement = null;

        try {
           conexao = ConexaoBD.getConnection();;
            preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setFloat(3, produto.getpCompra());
            preparedStatement.setFloat(4, produto.getpVenda());
            preparedStatement.setInt(5, produto.getQuantidade());
            preparedStatement.setBoolean(6, true);
            Timestamp dtCadastro = new Timestamp(System.currentTimeMillis());
            preparedStatement.setTimestamp(7,dtCadastro);
            preparedStatement.setInt(8, produto.getID());
            preparedStatement.execute();
               
            
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }        }

    }

    public static void excluir(Integer id)
            throws SQLException, Exception {
        String sql = "UPDATE produto set DISPONIVEL=? where (ID = ?)";

        Connection conexao = null;

        PreparedStatement preparedStatement = null;
        try {
            conexao = ConexaoBD.getConnection();
            preparedStatement = conexao.prepareCall(sql);
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (conexao != null && conexao.isClosed()) {
                conexao.close();
            }

        }

    }

    public static List<Produto> listar()
            throws SQLException, Exception {
        String sql = "SELECT * FROM produto WHERE (DISPONIVEL=?)";
        List<Produto> listaProdutos = null;
        Connection conexao = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conexao = ConexaoBD.getConnection();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setID(result.getInt("ID"));
                produto.setNome(result.getString("NOME"));
                produto.setDescricao(result.getString("DESCRICAO"));
                produto.setQuantidade(result.getInt("QUANTIDADE"));
                produto.setpCompra(result.getFloat("PRECO_COMPRA"));
                produto.setpVenda(result.getInt("PRECO_VENDA"));
                listaProdutos.add(produto);
            }

        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }

        return listaProdutos;

    }

   

    public static Produto obter(Integer Id)
            throws SQLException, Exception {
        String sql = "SELECT * FROM produto WHERE (ID=? AND DISPONIVEL=?)";
        Connection conexao = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conexao = ConexaoBD.getConnection();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, Id);
            preparedStatement.setBoolean(2, true);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                Produto produto = new Produto();
                produto.setID(result.getInt("ID"));
                produto.setNome(result.getString("NOME"));
                produto.setDescricao(result.getString("DESCRICAO"));               
                produto.setpCompra(result.getFloat("PRECO_COMPRA"));
                produto.setpVenda(result.getFloat("PRECO_VENDA"));              
                produto.setQuantidade(result.getInt("QUANTIDADE"));
                
                
                return produto;
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }

        return null;
    }

}
