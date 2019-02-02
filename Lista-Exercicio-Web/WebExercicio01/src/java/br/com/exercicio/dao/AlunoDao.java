package br.com.exercicio.dao;

import br.com.exercicio.bean.AlunoBean;
import br.com.exercicio.database.ConnectionFactory;
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
public class AlunoDao {

    private String sql;
    
    
    public int add(AlunoBean aluno){
        Connection con = ConnectionFactory.takingConnection();
        sql = "INSERT INTO alunos(nome,matricula,nota1,nota2,nota3,media,frequencia,status) VALUES(?,?,?,?,?,?,?,?)";
        if(con != null){
            try {
                PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, aluno.getNome());
                ps.setString(2, aluno.getMatricula());
                ps.setDouble(3, aluno.getNota1());
                ps.setDouble(4, aluno.getNota2());
                ps.setDouble(5, aluno.getNota3());
                ps.setDouble(6, aluno.getMedia());
                ps.setByte(7, aluno.getFrequencia());
                ps.setString(8, aluno.getStatus());
                ps.execute();
                
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return -1;
    }
    
    public boolean edit(AlunoBean aluno){
        Connection con = ConnectionFactory.takingConnection();
        sql = "UPDATE alunos SET nome = ?,matricula = ?,nota1 = ?,nota2 = ?,nota3 = ?,media = ?,frequencia = ?,status = ? WHERE id = ?";
        if(con != null){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, aluno.getNome());
                ps.setString(2, aluno.getMatricula());
                ps.setDouble(3, aluno.getNota1());
                ps.setDouble(4, aluno.getNota2());
                ps.setDouble(5, aluno.getNota3());
                ps.setDouble(6, aluno.getMedia());
                ps.setByte(7, aluno.getFrequencia());
                ps.setString(8, aluno.getStatus());
                ps.setInt(9, aluno.getId());
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return false;
    }
    
    public boolean delete(int id){
        Connection con = ConnectionFactory.takingConnection();
        sql = "DELETE FROM alunos WHERE id = ?";
        if(con != null){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                return ps.executeUpdate() == 1;
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return false;
    }
    
    public List<AlunoBean> allAdded(){
        Connection con = ConnectionFactory.takingConnection();
        sql = "SELECT * FROM alunos";
        List<AlunoBean> alunos = new ArrayList<>();
        if(con != null){
            try {
                Statement s = con.createStatement();
                s.execute(sql);
                ResultSet rs = s.getResultSet();
                while(rs.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(rs.getInt("id"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setMatricula(rs.getString("matricula"));
                    aluno.setNota1(rs.getDouble("nota1"));
                    aluno.setNota2(rs.getDouble("nota2"));
                    aluno.setNota3(rs.getDouble("nota3"));
                    aluno.setMedia(rs.getDouble("media"));
                    aluno.setFrequencia(rs.getByte("frequencia"));
                    aluno.setStatus(rs.getString("status"));
                    alunos.add(aluno);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return alunos;
    }
    public AlunoBean returnById(int id) {
        Connection con = ConnectionFactory.takingConnection();
        String sql = "SELECT * FROM alunos WHERE id = ?";
        if(con != null){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                ResultSet rs = ps.getResultSet();
                if(rs.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(id);
                    aluno.setNome(rs.getString("nome"));
                    aluno.setMatricula(rs.getString("matricula"));
                    aluno.setNota1(rs.getDouble("nota1"));
                    aluno.setNota2(rs.getDouble("nota2"));
                    aluno.setNota3(rs.getDouble("nota3"));
                    aluno.setMedia(rs.getDouble("media"));
                    aluno.setFrequencia(rs.getByte("frequencia"));
                    aluno.setStatus(rs.getString("status"));
                    return aluno;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return null;
    }
}
