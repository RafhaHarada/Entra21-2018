package br.com.Sistema.DAO;

import br.com.Sistema.Bean.ExpedicaoBean;
import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class ExpedicaoDAO {
    public List<ExpedicaoBean> obterTodos() {
        List<ExpedicaoBean> expedicoes = new ArrayList<>();
        String sql = "SELECT * FROM expedicao";
        
        try{
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while(resultSet.next()){
                ExpedicaoBean expedicao = new ExpedicaoBean();
                expedicao.setId(resultSet.getInt("id"));
                expedicao.setTipo(resultSet.getString("tipo"));
                expedicao.setNome(resultSet.getString("nome"));
                expedicao.setData_expedicao(resultSet.getDate("data_expedicao"));
                expedicao.setHora_expedicao(resultSet.getTime("hora_expedicao"));
                expedicao.setCusto(resultSet.getDouble("custo"));
                
                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("id_usuario"));
                expedicao.setUsuario(usuario);
                
                FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(resultSet.getInt("id_funcionario"));
                expedicao.setFuncionario(funcionario);
                
                expedicoes.add(expedicao);
            }
            }catch(SQLException e){
                    e.printStackTrace();
            }finally{
            Conexao.fecharConexao();
        }return expedicoes;
    }
    
    public List<ExpedicaoBean> obterTodosPorUsuario(int id_usuario) {
        List<ExpedicaoBean> expedicoes = new ArrayList<>();
        String sql = "SELECT * FROM expedicao WHERE id_usuario = ?";
        
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                ExpedicaoBean expedicao = new ExpedicaoBean();
                expedicao.setId(resultSet.getInt("id"));
                expedicao.setTipo(resultSet.getString("tipo"));
                expedicao.setNome(resultSet.getString("nome"));
                expedicao.setData_expedicao(resultSet.getDate("data_expedicao"));
                expedicao.setHora_expedicao(resultSet.getTime("hora_expedicao"));
                expedicao.setCusto(resultSet.getDouble("custo"));
                
                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("id_usuario"));
                expedicao.setUsuario(usuario);
                
                FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(resultSet.getInt("id_funcionario"));
                expedicao.setFuncionario(funcionario);
                
                expedicoes.add(expedicao);
            }
            }catch(SQLException e){
                    e.printStackTrace();
            }finally{
            Conexao.fecharConexao();
        }return expedicoes;
    }
    
    public List<ExpedicaoBean> obterTodosPorFuncionario(int id_funcionario) {
        List<ExpedicaoBean> expedicoes = new ArrayList<>();
        String sql = "SELECT * FROM expedicao WHERE id_funcionario = ?";
        
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id_funcionario);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                ExpedicaoBean expedicao = new ExpedicaoBean();
                expedicao.setId(resultSet.getInt("id"));
                expedicao.setTipo(resultSet.getString("tipo"));
                expedicao.setNome(resultSet.getString("nome"));
                expedicao.setData_expedicao(resultSet.getDate("data_expedicao"));
                expedicao.setHora_expedicao(resultSet.getTime("hora_expedicao"));
                expedicao.setCusto(resultSet.getDouble("custo"));
                
                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("id_usuario"));
                expedicao.setUsuario(usuario);
                
                FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(resultSet.getInt("id_funcionario"));
                expedicao.setFuncionario(funcionario);
                
                expedicoes.add(expedicao);
            }
            }catch(SQLException e){
                    e.printStackTrace();
            }finally{
            Conexao.fecharConexao();
        }return expedicoes;
    }
    
    public ExpedicaoBean obterPeloId(int id){
        ExpedicaoBean expedicao = null;
        String sql = "SELECT * FROM expedicao ex JOIN usuarios us ON us.id = ex.id_usuario JOIN funcionarios fn ON fn.id = ex.id_funcionario WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()){
                expedicao = new ExpedicaoBean();
                expedicao.setId(resultSet.getInt("ex.id"));
                expedicao.setTipo(resultSet.getString("ex.tipo"));
                expedicao.setNome(resultSet.getString("ex.nome"));
                expedicao.setData_expedicao(resultSet.getDate("ex.data_expedicao"));
                expedicao.setHora_expedicao(resultSet.getTime("ex.hora_expedicao"));
                expedicao.setCusto(resultSet.getDouble("ex.custo"));
                
                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("ex.id_usuario"));
                expedicao.setUsuario(usuario);
                
                FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(resultSet.getInt("ex.id_funcionario"));
                expedicao.setFuncionario(funcionario);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return expedicao;
    }
    public int adicionar(ExpedicaoBean expedicao) {
        String sql = "INSERT INTO expedicao (id_usuario, id_funcionario, tipo, nome, data_expedicao, hora_expedicao, custo) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, expedicao.getId_usuario());
            ps.setInt(2, expedicao.getId_funcionario());
            ps.setString(3, expedicao.getTipo());
            ps.setString(4, expedicao.getNome());
            ps.setDate(5, expedicao.getData_expedicao());
            ps.setTime(6, expedicao.getHora_expedicao());
            ps.setDouble(7, expedicao.getCusto());
            
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return -1;
    }
    public boolean alterar(ExpedicaoBean expedicao){
        try{
            String sql = "UPDATE expedicao SET id_usuario = ?, id_funcionario = ?, tipo = ?, data_expedicao = ?, hora_expedicao = ?, custo = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, expedicao.getUsuario().getId());
            ps.setInt(2, expedicao.getFuncionario().getId());
            ps.setString(3, expedicao.getTipo());
            ps.setDate(4, expedicao.getData_expedicao());
            ps.setTime(5, expedicao.getHora_expedicao());
            ps.setDouble(6, expedicao.getCusto());
            ps.setInt(7, expedicao.getId());
            
            return ps.executeUpdate()==1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return false;
    }
    
    public boolean apagar(int id){
        String sql = "DELETE FROM expedicao WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate()==1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return false;
    }
}
