package br.com.Sistema.DAO;

import br.com.Sistema.Bean.ServicosBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Cidmar da Silva Ribeiro (cidmardsr@gmail.com)
 */
public class ServicosDAO {
    
    public List<ServicosBean> obterTodos(){
        List<ServicosBean> servicos = new ArrayList<>();
        String sql = "SELECT FROM servicos id_fucionario, nome, decricao, tipo";
        try{
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            
            while(resultSet.next()){
                ServicosBean servico = new ServicosBean();
                servico.setId(resultSet.getInt("id"));
                servico.setId_funcionario(resultSet.getInt("id_funcionario"));
                servico.setNome(resultSet.getString("nome"));
                servico.setDescricao(resultSet.getString("descricao"));
                servico.settipo(resultSet.getString("tipo"));
                //servico.setTempo_execucao(resultSet.getDate("tempo_execucao"));
                servicos.add(servico);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return servicos;
    }
    
    public ServicosBean obterPeloId(int id){
        ServicosBean servico = null;
        String sql = "SELECT id, id_funcionario, nome, descricao, tipo FROM servicos WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                servico = new ServicosBean();
                servico.setId(resultSet.getInt("id"));
                servico.setId_funcionario(resultSet.getInt("id_funcionario"));
                servico.setNome(resultSet.getString("nome"));
                servico.setDescricao(resultSet.getString("descricao"));
                servico.settipo(resultSet.getString("tipo"));
               // servico.setTempo_execucao(resultSet.getDate("tempo_execucao"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return servico;
    }
    
    public int adicionar(ServicosBean servico){
        String sql = "INSERT INTO servicos(id_funcionario, nome, descricao, tipo)"
                   + "VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, servico.getId_funcionario());
            ps.setString(2, servico.getNome());
            ps.setString(3, servico.getDescricao());
            ps.setString(4, servico.gettipo());
            //ps.setDate(4, servico.getTempo_execucao());
            ps.execute();
            
            ResultSet resultSet = ps.getGeneratedKeys();
            if(ResultSet.next()){
                return resultSet.getInt(1);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
                    
        }return -1;
    }
    
    public boolean alterar(ServicosBean servico){
        try{
            String sql = "UPDATE servicos SET id_funcionario, nome, descricao, tipo WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, servico.getId_funcionario());
            ps.setString(2, servico.getNome());
            ps.setString(3, servico.getDescricao());
            ps.setString(4, servico.gettipo());
            ps.setInt(5, servico.getId());
            //ps.setDate(4, servico.getTempo_execucao());
            return ps.executeUpdate() ==1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return false;
    }
    
    public boolean apagar(int id){
        String sql = "DELETE FROM servicos WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() ==1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return false;
        
    }
    public  List<ServicosBean> obterUltimos(){
        List<ServicosBean> servicos = new ArrayList<>();
        String sql = "SELECT * FROM servicos ORDER BY id";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            
            while (resultSet.next()) {
                ServicosBean servico = new ServicosBean();
                servico.setId(resultSet.getInt("id"));
                servico.setId_funcionario(resultSet.getInt("id_funcionario"));
                servico.setNome(resultSet.getString("nome"));
                servico.setDescricao(resultSet.getString("descricao"));
                servico.settipo(resultSet.getString("tipo"));
                servicos.add(servico);
                //servico.setTempo_execucao(resultSet.getDate("tempo_execucao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return servicos;
    }

    public List<HashMap<String, Object>> obterTodosParaDataTable() {
        List<HashMap<String, Object>> servicos = new ArrayList<>();
        String sql = "SELECT * FROM servicos ORDER BY id DESC LIMIT 5";
        
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            
            while (resultSet.next()) {
                
                HashMap<String, Object> servico = new HashMap<>();
                servico.put("id", resultSet.getInt("id"));
                servico.put("funcionario", resultSet.getInt("id_funcionario"));
                servico.put("nome", resultSet.getString("nome"));
                servico.put("descricao", resultSet.getString("descricao"));
                servico.put("tipo", resultSet.getString("tipo"));
                servicos.add(servico);
                //servico.put("tempo_execucao", resultSet.getDate("tempo_execucao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return servicos;
    }
}
