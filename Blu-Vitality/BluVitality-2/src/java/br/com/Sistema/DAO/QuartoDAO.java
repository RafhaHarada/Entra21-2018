package br.com.Sistema.DAO;

/**
 * @author Cidimar
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
import br.com.Sistema.Bean.QuartoBean;
import br.com.Sistema.Database.Conexao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Alunos
 */
public class QuartoDAO {

    public List<QuartoBean> obterTodos() {
        List<QuartoBean> quartos = new ArrayList<>();
        String sql = "SELECT  * FROM quartos";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                QuartoBean quarto = new QuartoBean();
                quarto.setId(resultSet.getInt("id"));
                quarto.setNumero_quarto(resultSet.getInt("numero_quarto"));
                quarto.setId_usuario(resultSet.getInt("id_usuario"));
                quarto.setId_funcionario(resultSet.getInt("id_funcionario"));
                quarto.setTipo(resultSet.getString("tipo"));
                quarto.setData_entrada(resultSet.getDate("data_entrada"));
                quarto.setData_saida(resultSet.getDate("data_saida"));
                quarto.setStatus(resultSet.getString("estado"));
                quartos.add(quarto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return quartos;
    }

    public QuartoBean obterPeloId(int id) {
        String sql = "SELECT * FROM quartos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()) {
                QuartoBean quarto = new QuartoBean();
                quarto.setId(resultSet.getInt("id"));
                quarto.setNumero_quarto(resultSet.getInt("numero_quarto"));
                quarto.setId_usuario(resultSet.getInt("id_usuario"));
                quarto.setId_funcionario(resultSet.getInt("id_funcionario"));
                quarto.setTipo(resultSet.getString("tipo"));
                quarto.setData_entrada(resultSet.getDate("data_entrada"));
                quarto.setData_saida(resultSet.getDate("data_saida"));
                quarto.setStatus(resultSet.getString("estado"));
                return quarto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }

    public int adicionarQuarto(QuartoBean quarto) {
        String sql = "INSERT INTO quartos ( numero_quarto, tipo) "
                + "VALUES(?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, quarto.getNumero_quarto());
            ps.setString(2, quarto.getTipo());

            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean alterar(QuartoBean quarto) {
        try {
            String sql = "UPDATE quartos SET numero_quarto = ?, id_usuario = ?, id_funcionario = ?,  tipo = ?, data_entrada = ?, data_saida = ?, status = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, quarto.getNumero_quarto());
            ps.setInt(2, quarto.getId_usuario());
            ps.setInt(3, quarto.getId_funcionario());
            ps.setString(4, quarto.getTipo());
            ps.setDate(5, quarto.getData_entrada());
            ps.setDate(6, quarto.getData_saida());
            ps.setString(7, quarto.getStatus());
            ps.setInt(8, quarto.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM quartos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public List<HashMap<String, Object>> obterTodosParaDataTable() {
        List<HashMap<String, Object>> quartos = new ArrayList<>();
        String sql = "SELECT * FROM quartos";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                HashMap<String, Object> quarto = new HashMap<>();
                quarto.put("id", resultSet.getInt("id"));
                quarto.put("numero_quarto", resultSet.getInt("numero_quarto"));
                quarto.put("tipo", resultSet.getString("tipo"));
                quarto.put("estado", resultSet.getString("estado"));
                quartos.add(quarto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return quartos;
    }

    public List<HashMap<String, String>> obterTodosParaSelect2(String termo) {
        List<HashMap<String, String>> quartos = new ArrayList<HashMap<String, String>>();
        String sql = "SELECT * FROM quartos WHERE numero_quarto LIKE ? ORDER BY numero_quarto";

        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, "%" + termo + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                HashMap<String, String> atual = new HashMap<>();
                atual.put("id", String.valueOf(resultSet.getInt("id")));
                atual.put("text", String.valueOf(resultSet.getInt("numero_quarto")));
                quartos.add(atual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return quartos;
    }
}
