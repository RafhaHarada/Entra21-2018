package dao;

import bean.AlunoBean;
import conexao.ConnectionFactory;
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
public class AlunoDAO {
    
    String sql = "";
    List<AlunoBean> codigoRepetido;
            
    public int inserir(AlunoBean aluno){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "INSERT INTO alunos"
                + "\n(nome,codigo_matricula,nota_1,nota_2,nota_3,media,frequencia,status) "
                + "\nVALUES(?,?,?,?,?,?,?,?)";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1,aluno.getNome());
                ps.setString(2,aluno.getCodigo_matricula());
                ps.setFloat(3,aluno.getNota_1());
                ps.setFloat(4,aluno.getNota_2());
                ps.setFloat(5,aluno.getNota_3());
                ps.setFloat(6,aluno.getMedia());
                ps.setByte(7,aluno.getFrequencia());
                ps.setString(8,aluno.getStatus());
                ps.execute();
                ResultSet resultSet = ps.getGeneratedKeys();
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                ConnectionFactory.closeConnection();
            }
        }
        return 0;
    }
    
    public boolean alterar(AlunoBean aluno){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "UPDATE alunos"
                + "\nSET nome = ?,codigo_matricula = ?,nota_1 = ?,nota_2 = ?,nota_3 = ?,media = ?,frequencia = ?,status = ?"
                + "WHERE id = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1,aluno.getNome());
                ps.setString(2,aluno.getCodigo_matricula());
                ps.setFloat(3,aluno.getNota_1());
                ps.setFloat(4,aluno.getNota_2());
                ps.setFloat(5,aluno.getNota_3());
                ps.setFloat(6,aluno.getMedia());
                ps.setByte(7,aluno.getFrequencia());
                ps.setString(8,aluno.getStatus());
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
    
    public boolean apagar(int id){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "DELETE FROM alunos"
                + "\nWHERE id = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1,id);
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
    
    public AlunoBean obterAlunoPelaMatricula(String codigo_matricula){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "SELECT id,nome,codigo_matricula,nota_1,nota_2,nota_3,media,frequencia,status"
                + "\nFROM alunos"
                + "\nWHERE codigo_matricula = ?";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, codigo_matricula);
                ps.execute();
                ResultSet resultSet = ps.getResultSet();
                if(resultSet.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setNome(resultSet.getString("nome"));
                    aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                    aluno.setNota_1(resultSet.getFloat("nota_1"));
                    aluno.setNota_2(resultSet.getFloat("nota_2"));
                    aluno.setNota_3(resultSet.getFloat("nota_3"));
                    aluno.setMedia(resultSet.getFloat("media"));
                    aluno.setFrequencia(resultSet.getByte("frequencia"));
                    aluno.setStatus(resultSet.getString("status"));
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
    
    public AlunoBean obterAlunoPeloId(int id){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "SELECT id,nome,codigo_matricula,nota_1,nota_2,nota_3,media,frequencia,status"
                + "\nFROM alunos"
                + "\nWHERE id = ?;";
        if(conexao != null){
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                ResultSet resultSet = ps.getResultSet();
                if(resultSet.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setNome(resultSet.getString("nome"));
                    aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                    aluno.setNota_1(resultSet.getFloat("nota_1"));
                    aluno.setNota_2(resultSet.getFloat("nota_2"));
                    aluno.setNota_3(resultSet.getFloat("nota_3"));
                    aluno.setMedia(resultSet.getFloat("media"));
                    aluno.setFrequencia(resultSet.getByte("frequencia"));
                    aluno.setStatus(resultSet.getString("status"));
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
    
    public List<AlunoBean> obterAlunos(){
        Connection conexao = ConnectionFactory.getConnection();
        sql = "SELECT id,nome,codigo_matricula,nota_1,nota_2,nota_3,media,frequencia,status"
                + "\nFROM alunos;";
        List<AlunoBean> alunos = new ArrayList<>();
        if(conexao != null){
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while(resultSet.next()){
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setNome(resultSet.getString("nome"));
                    aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                    aluno.setNota_1(resultSet.getFloat("nota_1"));
                    aluno.setNota_2(resultSet.getFloat("nota_2"));
                    aluno.setNota_3(resultSet.getFloat("nota_3"));
                    aluno.setMedia(resultSet.getFloat("media"));
                    aluno.setFrequencia(resultSet.getByte("frequencia"));
                    aluno.setStatus(resultSet.getString("status"));
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
    
}
