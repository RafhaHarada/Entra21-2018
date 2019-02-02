package br.com.entra21java.dao;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael Alipio Harada
 */
public class AlimentoDAO {

    public int adicionar(AlimentoBean alimento) {
        Connection conexao = Conexao.obterConexao();
        String sql = "INSERT INTO alimentos(nome, preco, quantidade, descricao)"
                + "\nVALUES(?,?,?,?)";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, alimento.getNome());
                ps.setDouble(2, alimento.getPreco());
                ps.setByte(3, alimento.getQuantidade());
                ps.setString(4, alimento.getDescricao());
                ps.execute();
                ResultSet resultSet = ps.getGeneratedKeys();
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                Conexao.fecharConexao();
            }
        }
        return -1;
    }
    
    public boolean alterar(AlimentoBean alimento){
        Connection conexao = Conexao.obterConexao();
        String sql = "UPDATE alimentos "
                + "\nSET nome = ?, preco = ?, quantidade = ?, descricao = ?"
                + "\nWHERE id = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, alimento.getNome());
                ps.setDouble(2, alimento.getPreco());
                ps.setByte(3, alimento.getQuantidade());
                ps.setString(4, alimento.getDescricao());
                ps.setInt(5, alimento.getId());
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                Conexao.fecharConexao();
            }
        }
        return false;
    }
    
    public boolean excluir(int id){
        Connection conexao = Conexao.obterConexao();
        String sql = "DELETE FROM alimentos "
                + "\nWHERE id = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                Conexao.fecharConexao();
            }
        }
        
        return false;
    }
    
    public List<AlimentoBean> obterTodos(){
        Connection conexao = Conexao.obterConexao();
        List<AlimentoBean> alimentos = new ArrayList<>();
        String sql = "SELECT id,nome,preco,quantidade FROM alimentos";
        if(conexao != null){
            try {
                Statement s = Conexao.obterConexao().createStatement();
                s.execute(sql);
                ResultSet resultSet = s.getResultSet();
                while(resultSet.next()){
                    AlimentoBean alimento = new AlimentoBean();
                    alimento.setId(resultSet.getInt("id"));
                    alimento.setNome(resultSet.getString("nome"));
                    alimento.setPreco(resultSet.getDouble("preco"));
                    alimento.setQuantidade(resultSet.getByte("quantidade"));
                    alimentos.add(alimento);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                Conexao.fecharConexao();
            }
        }
        return alimentos;
    }

    public AlimentoBean obterPeloId(int id) {
        Connection conexao = Conexao.obterConexao();
        String sql = "SELECT id,nome,preco,quantidade,descricao FROM alimentos WHERE id = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                ResultSet resultSet = ps.getResultSet();
                if(resultSet.next()){
                    AlimentoBean alimento = new AlimentoBean();
                    alimento.setId(id);
                    alimento.setNome(resultSet.getString("nome"));
                    alimento.setPreco(resultSet.getDouble("preco"));
                    alimento.setQuantidade(resultSet.getByte("quantidade"));
                    alimento.setDescricao(resultSet.getString("descricao"));
                    return alimento;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                Conexao.fecharConexao();
            }
        }
        return null;
    }
}
