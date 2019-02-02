package dao;

import bean.AlunoBean;
import conexao.ConexaoAlunos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Airam
 */
public class AlunoDAO {

    public int inserir(AlunoBean aluno) {
        Connection conexao = ConexaoAlunos.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO alunos"
                    + "\n(id, nome, nota1, nota2, nota3, nota4, materia, descricao)"
                    + "\nVALUES(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conexao
                        .prepareStatement(sql,
                                PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setInt(1, aluno.getId());
                preparedStatement.setString(2, aluno.getNome());
                preparedStatement.setDouble(3, aluno.getNota1());
                preparedStatement.setDouble(4, aluno.getNota2());
                preparedStatement.setDouble(5, aluno.getNota3());
                preparedStatement.setDouble(6, aluno.getNota4());
                preparedStatement.setString(7, aluno.getMateria());
                preparedStatement.setString(8, aluno.getDescricao());
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoAlunos.fecharConexao();
            }
        }
        return 0;
    }

    public boolean alterar(AlunoBean aluno) {
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?;";
        Connection conexao = ConexaoAlunos.obterConexao();
        if (conexao != null) {
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoAlunos.fecharConexao();
            }
        }
        return false;
    }

    public AlunoBean obterClientePeloId(int id) {
        String sql = "SELECT id, nome, Nota1, Nota2, Nota3, Nota4, materia, descricao "
                + "FROM alunos WHERE id = ?;";
        Connection conexao = ConexaoAlunos.obterConexao();
        if (conexao != null) {
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                ResultSet resultSet = ps.getResultSet();
                if (resultSet.next()) {
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setNome(resultSet.getString("nome"));
                    aluno.setNota1(resultSet.getDouble("nota1"));
                    aluno.setNota2(resultSet.getDouble("nota2"));
                    aluno.setNota3(resultSet.getDouble("nota3"));
                    aluno.setNota4(resultSet.getDouble("nota4"));
                    aluno.setMateria(resultSet.getString("materia"));
                    aluno.setDescricao(resultSet.getString("descricao"));
                    return aluno;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoAlunos.fecharConexao();
            }
        }
        return null;
    }

    public List<AlunoBean> obterClientes() {
        List<AlunoBean> alunos = new ArrayList<>();
        Connection conexao = ConexaoAlunos.obterConexao();
        if (conexao != null) {
            String sql = "SELECT id, nome, nota1, nota2, nota3, nota4,"
                    + "materia, descricao FROM alunos";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    AlunoBean aluno = new AlunoBean();
                    aluno.setId(resultSet.getInt("id"));
                    aluno.setNome(resultSet.getString("nome"));
                    aluno.setNota1(resultSet.getDouble("nota1"));
                    aluno.setNota2(resultSet.getDouble("nota2"));
                    aluno.setNota3(resultSet.getDouble("nota3"));
                    aluno.setNota4(resultSet.getDouble("nota4"));
                    aluno.setMateria(resultSet.getString("materia"));
                    aluno.setDescricao(resultSet.getString("descricao"));
                    alunos.add(aluno);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoAlunos.fecharConexao();
            }
        }
        return alunos;
    }
}
