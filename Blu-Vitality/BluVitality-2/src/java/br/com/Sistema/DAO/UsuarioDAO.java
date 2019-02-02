package br.com.Sistema.DAO;

/**
 * @author Cidmar da Silva Ribeiro (cidmardsr@gmail.com)
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Cidmar da Silva Ribeiro (cidmardsr@gmail.com)
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class UsuarioDAO {

    public List<UsuarioBean> obterTodos() {
        List<UsuarioBean> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                UsuarioBean usuario = new UsuarioBean();

                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setColaborador(resultSet.getBoolean("colaborador"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }

        return usuarios;
    }

    public int adicionar(UsuarioBean usuario) {
        String sql = "INSERT INTO usuarios(nome, estado_civil, idade, sexo, login, senha, "
                + "cpf, rg, telefone, email, endereco, complemento, uf, cidade, naturalidade, "
                + "data_nascimento, nome_fic, tipo_sanguineo, contato_emergencia, colaborador)"
                + "\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            int quantidade = 1;
            ps.setString(quantidade++, usuario.getNome());
            ps.setString(quantidade++, usuario.getEstado_civil());
            ps.setByte(quantidade++, usuario.getIdade());
            ps.setString(quantidade++, String.valueOf(usuario.getSexo()));
            ps.setString(quantidade++, usuario.getLogin());
            ps.setString(quantidade++, usuario.getSenha());
            ps.setString(quantidade++, usuario.getCpf());
            ps.setString(quantidade++, usuario.getRg());
            ps.setString(quantidade++, usuario.getTelefone());
            ps.setString(quantidade++, usuario.getEmail());
            ps.setString(quantidade++, usuario.getEndereco());
            ps.setString(quantidade++, usuario.getComplemento());
            ps.setString(quantidade++, usuario.getUf());
            ps.setString(quantidade++, usuario.getCidade());
            ps.setString(quantidade++, usuario.getNaturalidade());
            ps.setDate(quantidade++, usuario.getData_nascimento());
            ps.setString(quantidade++, usuario.getNome_fic());
            ps.setString(quantidade++, usuario.getTipo_sanguineo());
            ps.setString(quantidade++, usuario.getContato_emergencia());
            ps.setBoolean(quantidade++, false);
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

    public boolean excluir(int id) {
        String sql = "DELETE FROM usuarios WHERE id =?";
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

    public boolean alterar(UsuarioBean usuario) {
        String sql = "UPDATE usuarios SET nome = ?, estado_civil = ?, idade = ?, "
                + "sexo = ?, login = ?, senha = ?, cpf = ?, rg = ?, telefone = ?, "
                + "email = ?, endereco = ?, complemento = ?, uf = ?, cidade = ?, "
                + "naturalidade = ?, data_nascimento = ?, nome_fic = ?, tipo_sanguineo = ?, "
                + "contato_emergencia = ?, colaborador = ? WHERE id = ?";

        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            int quantidade = 1;

            ps.setString(quantidade++, usuario.getNome());
            ps.setString(quantidade++, usuario.getEstado_civil());
            ps.setByte(quantidade++, (byte) usuario.getIdade());
            ps.setString(quantidade++, String.valueOf(usuario.getSexo()));
            ps.setString(quantidade++, usuario.getLogin());
            ps.setString(quantidade++, usuario.getSenha());
            ps.setString(quantidade++, usuario.getCpf());
            ps.setString(quantidade++, usuario.getRg());
            ps.setString(quantidade++, usuario.getTelefone());
            ps.setString(quantidade++, usuario.getEmail());
            ps.setString(quantidade++, usuario.getEndereco());
            ps.setString(quantidade++, usuario.getComplemento());
            ps.setString(quantidade++, usuario.getUf());
            ps.setString(quantidade++, usuario.getCidade());
            ps.setString(quantidade++, usuario.getNaturalidade());
            ps.setDate(quantidade++, usuario.getData_nascimento());
            ps.setString(quantidade++, usuario.getNome_fic());
            ps.setString(quantidade++, usuario.getTipo_sanguineo());
            ps.setString(quantidade++, usuario.getContato_emergencia());
            ps.setBoolean(quantidade++, usuario.isColaborador());
            ps.setInt(quantidade++, usuario.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public UsuarioBean obterPeloId(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                UsuarioBean usuario = new UsuarioBean();

                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setColaborador(resultSet.getBoolean("colaborador"));
                return usuario;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return null;
    }
    public UsuarioBean obterPeloCPF(String cpf ) {
        String sql = "SELECT * FROM usuarios WHERE cpf = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, cpf);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                UsuarioBean usuario = new UsuarioBean();

                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setColaborador(resultSet.getBoolean("colaborador"));
                return usuario;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return null;
    }
    
    public UsuarioBean autenticar(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                UsuarioBean usuario = new UsuarioBean();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setColaborador(resultSet.getBoolean("colaborador"));
                return usuario;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return null;
    }
    public  List<HashMap<String, Object>> obterTodosParaDatatable(){
        List<HashMap<String, Object>> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
           
            while (resultSet.next()) {
                HashMap<String, Object> usuario = new HashMap<>();
                usuario.put("id", resultSet.getInt("id"));
                usuario.put("nome", resultSet.getString("nome"));
                usuario.put("idade", resultSet.getByte("idade"));
                usuario.put("estado_civil", resultSet.getString("estado_civil"));
                usuario.put("sexo", resultSet.getString("sexo").charAt(0));
                usuario.put("login", resultSet.getString("login"));
                usuario.put("senha", resultSet.getString("senha"));
                usuario.put("cpf", resultSet.getString("cpf"));
                usuario.put("rg", resultSet.getString("rg"));
                usuario.put("telefone", resultSet.getString("telefone"));
                usuario.put("email",resultSet.getString("email"));
                usuario.put("endereco",resultSet.getString("endereco"));
                usuario.put("complemento",resultSet.getString("complemento"));
                usuario.put("cidade", resultSet.getString("cidade"));
                usuario.put("uf", resultSet.getString("uf"));
                usuario.put("naturalidade", resultSet.getString("naturalidade"));
                usuario.put("data_nascimento", resultSet.getDate("data_nascimento"));
                usuario.put("nome_fic", resultSet.getString("nome_fic"));
                usuario.put("tipo_sanguineo", resultSet.getString("tipo_sanguineo"));
                usuario.put("contato_emergencia", resultSet.getString("contato_emergencia"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return usuarios;
    }

    public List<HashMap<String, String>> obterTodosParaAutoComplete(String termo) {
        List<HashMap<String, String>> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios WHERE nome LIKE ? ORDER BY nome";
        
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, "%" + termo + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {                
                HashMap<String, String> atual = new HashMap<>();
                atual.put("id", String.valueOf(resultSet.getInt("id")));
                atual.put("text", resultSet.getString("nome"));
                usuarios.add(atual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return usuarios;
    }
    
    public List<HashMap<String, String>> obterTodosParaSelect2(String termo){
        List<HashMap<String, String>> usuarios = new ArrayList<HashMap<String, String>>();
        String sql = "SELECT * FROM usuarios WHERE nome LIKE ? ORDER BY nome";
        
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, "%" + termo + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                HashMap<String, String> atual = new HashMap<>();
                atual.put("id", String.valueOf(resultSet.getInt("id")));
                atual.put("text", resultSet.getString("nome"));
                usuarios.add(atual);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return usuarios;
            
            
    }
}
