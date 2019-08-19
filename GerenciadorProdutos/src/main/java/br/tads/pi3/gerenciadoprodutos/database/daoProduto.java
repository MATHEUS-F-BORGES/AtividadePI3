package br.tads.pi3.gerenciadoprodutos.database;

import br.tads.pi3.gerenciadoprodutos.models.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class daoProduto {

    public static void inserir(Produto produto)
            throws SQLException, Exception {
        String sql = "INSERT INTO produto (NOME, DESCRICAO, PRECO_COMPRA, "
                + "PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO) "
                + "VALUES (?,?,?,?,?,?,?)";

        Connection conexão = null;

        PreparedStatement preparedStatement = null;
        try {
            conexão = ConexãoBD.getConnection();
            preparedStatement = conexão.prepareStatement(sql);
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
            if (conexão != null && !conexão.isClosed()) {
                conexão.close();
            }
        }
    }

//    public static void atualizar(Produto produto)
//            throws SQLException, Exception {
//        String sql = "UPDATE produto SET Nome=?, Preco=?, Genero=?, Plataforma=?, Quantidade=? WHERE (produto.IdProduto = ?)";
//
//        Connection conexão = null;
//
//        PreparedStatement preparedStatement = null;
//
//        try {
//            conexão = ConexãoBD.getConnection();
//            preparedStatement = conexão.prepareStatement(sql);
//            preparedStatement.setString(1, produto.getnome());
//            preparedStatement.setDouble(2, produto.getpreco());
//            preparedStatement.setString(3, produto.getgenero());
//            preparedStatement.setString(4, produto.getplataforma());
//            preparedStatement.setInt(5, produto.getquantidade());
//            preparedStatement.setInt(6, produto.getId());
//            
//            preparedStatement.execute();
//            
//        } finally {
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            if (conexão != null && !conexão.isClosed()) {
//                conexão.close();
//            }
//        }
//
//    }

//    public static void excluir(Integer id)
//            throws SQLException, Exception {
//        String sql = "UPDATE produto set enabled=? where (IdProduto = ?)";
//
//        Connection conexão = null;
//
//        PreparedStatement preparedStatement = null;
//        try {
//            conexão = ConexãoBD.getConnection();
//            preparedStatement = conexão.prepareCall(sql);
//            preparedStatement.setBoolean(1, false);
//            preparedStatement.setInt(2, id);
//            preparedStatement.execute();
//        } finally {
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            if (conexão != null && conexão.isClosed()) {
//                conexão.close();
//            }
//
//        }
//
//    }
//
//    public static List<Produto> listar()
//            throws SQLException, Exception {
//        String sql = "SELECT * FROM produto WHERE (enabled=?)";
//        List<Produto> listaProdutos = null;
//        Connection conexão = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet result = null;
//        try {
//            conexão = ConexãoBD.getConnection();
//            preparedStatement = conexão.prepareStatement(sql);
//            preparedStatement.setBoolean(1, true);
//            result = preparedStatement.executeQuery();
//            while (result.next()) {
//                if (listaProdutos == null) {
//                    listaProdutos = new ArrayList<Produto>();
//                }
//                Produto produto = new Produto();
//                produto.setId(result.getInt("IdProduto"));
//                produto.setnome(result.getString("Nome"));
//                produto.setgenero(result.getString("Genero"));
//                produto.setplataforma(result.getString("Plataforma"));
//                produto.setpreco(result.getDouble("Preco"));
//                produto.setquantidade(result.getInt("Quantidade"));
//                listaProdutos.add(produto);
//            }
//
//        } finally {
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            if (conexão != null && !conexão.isClosed()) {
//                conexão.close();
//            }
//        }
//
//        return listaProdutos;
//
//    }
//
//    public static List<Produto> procurar(String valor)
//            throws SQLException, Exception {
//        String sql = "SELECT * FROM produto WHERE ((UPPER(Nome) "
//                + "LIKE UPPER(?) OR UPPER (produto.Nome) LIKE UPPER (?)) AND enabled=?)";
//
//        List<Produto> listaProdutos = null;
//        Connection conexão = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet result = null;
//        try {
//            conexão = ConexãoBD.getConnection();
//            preparedStatement = conexão.prepareStatement(sql);
//            preparedStatement.setString(1, "%" + valor + "%");
//            preparedStatement.setString(2, "%" + valor + "%");
//            preparedStatement.setBoolean(3, true);
//            result = preparedStatement.executeQuery();
//            while (result.next()) {
//                if (listaProdutos == null) {
//                    listaProdutos = new ArrayList<Produto>();
//                }
//                Produto produto = new Produto();
//                produto.setId(result.getInt("IdProduto"));
//                produto.setnome(result.getString("Nome"));
//                produto.setgenero(result.getString("Genero"));
//                produto.setplataforma(result.getString("Plataforma"));
//                produto.setpreco(result.getDouble("Preço"));
//                produto.setquantidade(result.getInt("Quantidade"));
//                listaProdutos.add(produto);
//            }
//        } finally {
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            if (conexão != null && !conexão.isClosed()) {
//                conexão.close();
//            }
//        }
//        return listaProdutos;
//    }
//
//    public static Produto obter(Integer Id)
//            throws SQLException, Exception {
//        String sql = "SELECT * FROM produto WHERE (IdProduto=? AND enabled=?)";
//        Connection conexão = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet result = null;
//        try {
//            conexão = ConexãoBD.getConnection();
//            preparedStatement = conexão.prepareStatement(sql);
//            preparedStatement.setInt(1, Id);
//            preparedStatement.setBoolean(2, true);
//            result = preparedStatement.executeQuery();
//            if (result.next()) {
//                Produto produto = new Produto();
//                produto.setId(result.getInt("IdProduto"));
//                produto.setnome(result.getString("nome"));
//                produto.setpreco(result.getDouble("preco"));               
//                produto.setgenero(result.getString("genero"));
//                produto.setplataforma(result.getString("plataforma"));              
//                produto.setquantidade(result.getInt("quantidade"));
//                
//                return produto;
//            }
//        } finally {
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            if (conexão != null && !conexão.isClosed()) {
//                conexão.close();
//            }
//        }
//
//        return null;
//    }

}
