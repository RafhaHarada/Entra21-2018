package br.com.Sistema.DAO;

import br.com.Sistema.Bean.LucroBean;
import br.com.Sistema.Database.Conexao;
import java.sql.Date;
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
public class LucroDAO {

    public List<LucroBean> obterTodos() {
        List<LucroBean> lucros = new ArrayList<>();
        String sql = "SELECT * FROM lucro";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                LucroBean lucro = new LucroBean();
                lucro.setId(resultSet.getInt("id"));
                lucro.setIdCusto(resultSet.getInt("id_custo"));
                lucro.setIdReceita(resultSet.getInt("id_receita"));
                lucro.setDataLucro(resultSet.getDate("data_lucro"));
                lucro.setTotal(resultSet.getDouble("total"));
                lucro.setCusto(new CustoDAO().obterPeloId(lucro.getIdCusto()));
                lucro.setReceita(new ReceitaDAO().obterPeloId(lucro.getIdReceita()));
                lucros.add(lucro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return lucros;
    }

    public LucroBean obterPeloId(int id) {
        String sql = "SELECT * FROM lucro WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()) {
                LucroBean lucro = new LucroBean();
                lucro.setId(resultSet.getInt("id"));
                lucro.setIdCusto(resultSet.getInt("id_custo"));
                lucro.setIdReceita(resultSet.getInt("id_receita"));
                lucro.setDataLucro(resultSet.getDate("data_lucro"));
                lucro.setTotal(resultSet.getDouble("total"));
                lucro.setCusto(new CustoDAO().obterPeloId(lucro.getIdCusto()));
                lucro.setReceita(new ReceitaDAO().obterPeloId(lucro.getIdReceita()));
                return lucro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }
    public LucroBean obterPelaData(Date dataLucro) {
        String sql = "SELECT * FROM lucro WHERE data_lucro = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDate(1, dataLucro);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()) {
                LucroBean lucro = new LucroBean();
                lucro.setId(resultSet.getInt("id"));
                lucro.setIdCusto(resultSet.getInt("id_custo"));
                lucro.setIdReceita(resultSet.getInt("id_receita"));
                lucro.setDataLucro(resultSet.getDate("data_lucro"));
                lucro.setTotal(resultSet.getDouble("total"));
                lucro.setCusto(new CustoDAO().obterPeloId(lucro.getIdCusto()));
                lucro.setReceita(new ReceitaDAO().obterPeloId(lucro.getIdReceita()));
                return lucro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }

    public int adicionar(LucroBean lucro) {
        String sql = "INSERT INTO lucro (id_receita,id_custo,data_lucro,total)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            int quantidade = 1;
            ps.setInt(quantidade++, lucro.getIdReceita());
            ps.setInt(quantidade++, lucro.getIdCusto());
            ps.setDate(quantidade++, lucro.getDataLucro());
            ps.setDouble(quantidade++, lucro.getTotal());
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

    public boolean alterar(LucroBean lucro) {
        try {
            String sql = "UPDATE lucro SET id_receita = ? ,id_custo = ? ,data_lucro = ? ,total = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            int quantidade = 1;
            ps.setInt(quantidade++, lucro.getIdReceita());
            ps.setInt(quantidade++, lucro.getIdCusto());
            ps.setDate(quantidade++, lucro.getDataLucro());
            ps.setDouble(quantidade++, lucro.getTotal());
            ps.setInt(quantidade++, lucro.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM lucro WHERE id = ?";
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
