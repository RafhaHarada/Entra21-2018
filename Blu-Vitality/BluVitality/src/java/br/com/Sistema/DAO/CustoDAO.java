package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CustoBean;
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
public class CustoDAO {

    public List<CustoBean> obterTodos() {
        List<CustoBean> custos = new ArrayList<>();
        String sql = "SELECT * FROM custo";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                CustoBean custo = new CustoBean();
                custo.setId(resultSet.getInt("id"));
                custo.setDataCusto(resultSet.getDate("data_custo"));
                custo.setManutencao(resultSet.getDouble("manutencao"));
                custo.setSalarioFuncionarios(resultSet.getDouble("salario_funcionarios"));
                custos.add(custo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return custos;
    }

    public CustoBean obterPeloId(int id) {
        String sql = "SELECT * FROM custo WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()) {
                CustoBean custo = new CustoBean();
                custo.setId(resultSet.getInt(id));
                custo.setManutencao(resultSet.getDouble("manutencao"));
                custo.setSalarioFuncionarios(resultSet.getDouble("salario_funcionarios"));
                custo.setDataCusto(resultSet.getDate("data_custo"));
                return custo;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }

    public int adicionar(CustoBean custo) {
        String sql = "INSERT INTO custo (manutencao,salario_funcionarios,data_custo)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            int quantidade = 1;
            ps.setDouble(quantidade++, custo.getManutencao());
            ps.setDouble(quantidade++, custo.getSalarioFuncionarios());
            ps.setDate(quantidade++, custo.getDataCusto());
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

    public boolean alterar(CustoBean custo) {
        try {
            String sql = "UPDATE custo SET manutencao = ?, salario_funcionarios = ?, data_custo = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            int quantidade = 1;
            ps.setDouble(quantidade++, custo.getManutencao());
            ps.setDouble(quantidade++, custo.getSalarioFuncionarios());
            ps.setDate(quantidade++, custo.getDataCusto());
            ps.setInt(quantidade++, custo.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM custo WHERE id = ?";
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
