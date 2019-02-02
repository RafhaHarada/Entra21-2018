package br.com.Sistema.DAO;

import br.com.Sistema.Bean.EventosBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cidmar da Silva Ribeiro (cidmardsr@gmail.com)
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
public class EventosDAO {
    public List<EventosBean> obterTodos() {
        List<EventosBean> eventos = new ArrayList<>();
        String sql = "SELECT id, nome, data_evento, custo, receita FROM eventos";
        
        try{
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while(resultSet.next()){
                EventosBean evento = new EventosBean();
                evento.setId(resultSet.getInt("id"));
                evento.setNome(resultSet.getString("nome"));
                evento.setData_evento(resultSet.getDate("data_evento"));
                evento.setCusto(resultSet.getDouble("custo"));
                evento.setReceita(resultSet.getDouble("receita"));
            }
            }catch(SQLException e){
                    e.printStackTrace();
            }finally{
            Conexao.fecharConexao();
        }return eventos;
    }
    
    public EventosBean obterPeloId(int id){
        EventosBean evento = null;
        String sql = "SELECT id, nome, data_evento, custo, receita FROM eventos WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                evento = new EventosBean();
                evento.setId(resultSet.getInt("id"));
                evento.setNome(resultSet.getString("nome"));
                evento.setData_evento(resultSet.getDate("data_evento"));
                evento.setCusto(resultSet.getDouble("custo"));
                evento.setReceita(resultSet.getDouble("receita"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return evento;
    }
    
    public int adicionar(EventosBean evento) {
        String sql = "INSERT INTO eventos (id, nome, data_evento, custo, receita) "
                + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setString(1, evento.getNome());
            ps.setDate(2, evento.getData_evento());
            ps.setDouble(3, evento.getCusto());
            ps.setDouble(4, evento.getReceita());
            
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
    public boolean alterar(EventosBean evento){
        try{
            String sql = "UPDATE eventos SET nome = ?, data_evento = ?, custo = ?, receita = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, evento.getNome());
            ps.setDate(2, evento.getData_evento());
            ps.setDouble(3, evento.getCusto());
            ps.setDouble(4, evento.getReceita());
            ps.setInt(5, evento.getId());
            
            return ps.executeUpdate() ==1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return false;
    }
    
    public boolean apagar(int id){
        String sql = "DELETE FROM eventos WHERE id = ?";
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
}
