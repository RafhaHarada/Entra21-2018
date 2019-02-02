package dao;

import bean.Macarrao;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class MacarraoDAO {

    public int cadastrar(Macarrao macarrao) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO macarroes (tipo, peso, marca, aldente, po) VALUES (?,?,?,?,?)";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                int i = 1;
                ps.setString(i++, macarrao.getTipo());
                ps.setDouble(i++, macarrao.getPeso());
                ps.setString(i++, macarrao.getMarca());
                ps.setBoolean(i++, macarrao.isAldente());
                ps.setBoolean(i++, macarrao.isPo());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return -1;
    }

    public Macarrao obterPeloId(int identificador) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "SELECT * FROM macarroes WHERE id = ?";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, identificador);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Macarrao macarrao = new Macarrao();
                    macarrao.setId(identificador);
                    macarrao.setTipo(rs.getString("tipo"));
                    macarrao.setMarca(rs.getString("marca"));
                    macarrao.setPeso(rs.getDouble("peso"));
                    macarrao.setAldente(rs.getBoolean("aldente"));
                    macarrao.setPo(rs.getBoolean("po"));
                    return macarrao;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return null;
    }

    public boolean alterar(Macarrao macarrao) {
        Connection conexao = Conexao.conectar();
        if(conexao != null){
            try {
                String sql = "UPDATE macarroes SET tipo=?, marca=?, peso=?, aldente=?, po=? WHERE id=?";
                PreparedStatement ps = conexao.prepareStatement(sql);
                int i = 1;
                ps.setString(i++, macarrao.getTipo());
                ps.setString(i++, macarrao.getMarca());
                ps.setDouble(i++, macarrao.getPeso());
                ps.setBoolean(i++, macarrao.isAldente());
                ps.setBoolean(i++, macarrao.isPo());
                ps.setInt(i++, macarrao.getId());
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
    }

    public boolean apagar(int identificador) {
        Connection conexao = Conexao.conectar();
        if(conexao != null){
            try {
                String sql = "DELETE FROM macarroes WHERE id=?";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, identificador);
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
    }

}
