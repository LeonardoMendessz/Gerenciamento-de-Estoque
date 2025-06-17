package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {

    public void inserirProduto(Produto p){ // ja passo no parametro o objeto produto
        ConexaoDAO conexaoDao = new ConexaoDAO();
        Connection conexao = conexaoDao.conetardb();

        try{
            String sql = "INSERT INTO produto (id,nome,preco) VALUES (?,?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,p.getId());
            stmt.setString(2,p.getNome());
            stmt.setDouble(3,p.getPreco());
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas > 0){
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Não foi possivel cadastrar o produto!");
            }

            conexao.close();
            stmt.close();
        } catch (SQLException e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    public void Listar(){
        try{
            ConexaoDAO conexaoDao = new ConexaoDAO();
            Connection conexao = conexaoDao.conetardb();

            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            while(res.next()){
                int id = res.getInt("id");
                String nome = res.getString("nome");
                double preco = res.getDouble("preco");
                System.out.println("-----------------" );
                System.out.println("ID: " + id );
                System.out.println("NOME: " + nome );
                System.out.println("PREÇO: " + preco );
                System.out.println("-----------------" );

            }
            stmt.close();
            conexao.close();
        } catch (SQLException e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    public void deletarProduto(int id){
        ConexaoDAO conexaoDao = new ConexaoDAO();
        Connection conexao = conexaoDao.conetardb();

        try{
            String sql = "DELETE FROM produto WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,id);
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas > 0 ){
                System.out.println("Produto deletado com sucesso!");
            } else {
                System.out.println("Erro ao deletar Produto!");
            }
            conexao.close();
            stmt.close();
        }catch (SQLException e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }
}
