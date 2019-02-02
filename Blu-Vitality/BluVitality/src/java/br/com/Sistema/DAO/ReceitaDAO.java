package br.com.Sistema.DAO;

import br.com.Sistema.Bean.ReceitaBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class ReceitaDAO {

    public List<ReceitaBean> obterTodos() {
        List<ReceitaBean> receitas = new ArrayList<>();
        String sql = "SELECT * FROM receita";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                ReceitaBean receita = new ReceitaBean();
                receita.setId(resultSet.getInt("id"));
                receita.setPagamentoConvenio(resultSet.getInt("pagamento_convenio"));
                receita.setPagamentoAVista(resultSet.getDouble("pagamento_a_vista"));
                receita.setDataReceita(resultSet.getDate("data_receita"));
                receitas.add(receita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return receitas;
    }

    public ReceitaBean obterPeloId(int id) {
        String sql = "SELECT * FROM receita WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()) {
                ReceitaBean receita = new ReceitaBean();
                receita.setId(resultSet.getInt(id));
                receita.setPagamentoConvenio(resultSet.getInt("pagamento_convenio"));
                receita.setPagamentoAVista(resultSet.getDouble("pagamento_a_vista"));
                receita.setDataReceita(resultSet.getDate("data_receita"));
                return receita;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }

    public int adicionar(ReceitaBean receita) {
        String sql = "INSERT INTO receita (pagamento_convenio,pagamento_a_vista,data_receita)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            int quantidade = 1;
            ps.setDouble(quantidade++, receita.getPagamentoConvenio());
            ps.setDouble(quantidade++, receita.getPagamentoAVista());
            ps.setDate(quantidade++, receita.getDataReceita());
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

    public boolean alterar(ReceitaBean receita) {
        try {
            String sql = "UPDATE receita SET pagamento_convenio = ?, pagamento_a_vista = ?, data_receita = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            int quantidade = 1;
            ps.setDouble(quantidade++, receita.getPagamentoConvenio());
            ps.setDouble(quantidade++, receita.getPagamentoAVista());
            ps.setDate(quantidade++, receita.getDataReceita());
            ps.setInt(quantidade++, receita.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM receita WHERE id = ?";
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
}
