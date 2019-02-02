package dao;

import database.Conexao;
import bean.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class FilmeDAO {

    public int cadastrar(Filme filme) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO filmes (ano,ator_principal,categoria,diretor,dublado,faixa_etaria,faturamento,idioma_original,legendado,nome,orcamento,tempo_filme) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                int i = 1;
                ps.setByte(i++, filme.getAno());
                ps.setString(i++, filme.getAtorPrincipal());
                ps.setString(i++, filme.getCategoria());
                ps.setString(i++, filme.getDiretor());
                ps.setBoolean(i++, filme.isDublado());
                ps.setString(i++, filme.getFaixaEtaria());
                ps.setDouble(i++, filme.getFaturamento());
                ps.setString(i++, filme.getIdiomaOriginal());
                ps.setBoolean(i++, filme.isLegenda());
                ps.setString(i++, filme.getNome());
                ps.setDouble(i++, filme.getOrcamento());
                ps.setShort(i++, filme.getTempoFilme());
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

    public boolean editar(Filme filme) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "UPDATE filmes SET ano=? ,ator_principal=? ,categoria=?, diretor=?, dublado=?, faixa_etaria=?, faturamento=?, idioma_original=?, legendado=?, nome=?, orcamento=?, tempo_filme=? WHERE id=?";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                int i = 1;
                ps.setByte(i++, filme.getAno());
                ps.setString(i++, filme.getAtorPrincipal());
                ps.setString(i++, filme.getCategoria());
                ps.setString(i++, filme.getDiretor());
                ps.setBoolean(i++, filme.isDublado());
                ps.setString(i++, filme.getFaixaEtaria());
                ps.setDouble(i++, filme.getFaturamento());
                ps.setString(i++, filme.getIdiomaOriginal());
                ps.setBoolean(i++, filme.isLegenda());
                ps.setString(i++, filme.getNome());
                ps.setDouble(i++, filme.getOrcamento());
                ps.setShort(i++, filme.getTempoFilme());
                ps.setInt(i++, filme.getId());
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
    }

    public boolean excluir(int identificador) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "DELETE FROM filmes WHERE id=?";
            try {
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

    public Filme obterPeloId(int identificador) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "SELECT * FROM filmes WHERE id = ?";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, identificador);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Filme filme = new Filme();
                    filme.setAno(rs.getByte("ano"));
                    filme.setAtorPrincipal(rs.getString("ator_principal"));
                    filme.setCategoria(rs.getString("categoria"));
                    filme.setDiretor(rs.getString("diretor"));
                    filme.setDublado(rs.getBoolean("dublado"));
                    filme.setFaixaEtaria(rs.getString("faixa_etaria"));
                    filme.setFaturamento(rs.getDouble("faturamento"));
                    filme.setId(identificador);
                    filme.setIdiomaOriginal(rs.getString("idioma_original"));
                    filme.setLegenda(rs.getBoolean("legendado"));
                    filme.setNome(rs.getString("nome"));
                    filme.setOrcamento(rs.getDouble("orcamento"));
                    filme.setTempoFilme(rs.getShort("tempo_filme"));
                    return filme;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return null;
    }

}
