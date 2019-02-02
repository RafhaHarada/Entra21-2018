package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CargosBean;
import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
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
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class FuncionarioDAO {

    public List<FuncionarioBean> obterTodos() {
        List<FuncionarioBean> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                FuncionarioBean funcionario = new FuncionarioBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));

                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("us.id"));
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("cr.id"));
                funcionario.setCargo(cargo);

                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionarios;
    }

    public List<FuncionarioBean> obterCargos() {
        List<FuncionarioBean> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                FuncionarioBean funcionario = new FuncionarioBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));

                UsuarioBean usuario = new UsuarioDAO().obterPeloId(resultSet.getInt("fn.id_usuario"));
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("cr.id"));
                funcionario.setCargo(cargo);

                funcionarios.add(funcionario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionarios;
    }

    public FuncionarioBean obterPeloId(int id) {
        FuncionarioBean funcionario = null;
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                funcionario = new FuncionarioBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));

                UsuarioBean usuario = new UsuarioDAO().obterPeloId(id);
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("id_cargo"));
                funcionario.setCargo(cargo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionario;
    }

    public FuncionarioBean obterPeloIdUsuario(int id) {
        FuncionarioBean funcionario = null;
        String sql = "SELECT * FROM funcionarios WHERE id_usuario = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                funcionario = new FuncionarioBean();
                funcionario.setId(resultSet.getInt("id"));
                funcionario.setId_cargo(resultSet.getInt("id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("id_usuario"));
                funcionario.setTipo(resultSet.getString("tipo"));

                UsuarioBean usuario = new UsuarioDAO().obterPeloId(id);
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("id_cargo"));
                funcionario.setCargo(cargo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionario;
    }

    public int adicionar(FuncionarioBean funcionario) {
        String sql = "INSERT INTO funcionarios(id_cargo, id_usuario, tipo) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, funcionario.getId_cargo());
            ps.setInt(2, funcionario.getId_usuario());
            ps.setString(3, funcionario.getTipo());
            
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean alterar(FuncionarioBean funcionario) {
        try {
            String sql = "UPDATE funcionarios SET id_cargo = ?, id_usuario = ?, tipo = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, funcionario.getId_cargo());
            ps.setInt(2, funcionario.getId_usuario());
            ps.setString(3, funcionario.getTipo());
            ps.setInt(5, funcionario.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM funcionarios WHERE id = ?";
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
        List<HashMap<String, Object>> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn "
                + "\nJOIN cargos cr ON cr.id = fn.id_cargo "
                + "\nJOIN usuarios us ON us.id = fn.id_usuario";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {

                HashMap<String, Object> funcionario = new HashMap<>();
                funcionario.put("id", resultSet.getInt("fn.id"));
                funcionario.put("usuario", resultSet.getString("us.nome"));
                funcionario.put("cargo", resultSet.getString("cr.nome"));
                funcionario.put("id_usuario", resultSet.getInt("fn.id_usuario"));

                funcionarios.add(funcionario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionarios;
    }
}
