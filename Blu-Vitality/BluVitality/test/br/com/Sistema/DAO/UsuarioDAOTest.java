/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.DAO;

import br.com.Sistema.Bean.UsuarioBean;
import java.sql.Date;
import java.util.List;
import static oracle.jrockit.jfr.events.Bits.byteValue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author 
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @Test
    public void ObterTodos() {
        UsuarioBean usuario = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome("Gustavo");
        usuario.setEstado_civil("solteiro");
        usuario.setIdade(byteValue(21));
        usuario.setSexo('M');
        usuario.setLogin("GustavoBeleza");
        usuario.setSenha("G#b147896");
        usuario.setCpf("123.789.456-09");
        usuario.setRg("984.321.75-2");
        usuario.setTelefone("47974185296");
        usuario.setEmail("gustavobeleza@outlook.com");
        usuario.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuario.setComplemento("qualquer coisa");
        usuario.setCidade("Blumenau");
        usuario.setUf("sc");
        usuario.setNaturalidade("GO");
        usuario.setData_nascimento(Date.valueOf("1996-02-19"));
        usuario.setNome_fic("Gus");
        usuario.setTipo_sanguineo("A+");
        usuario.setContato_emergencia("47997835153");
        
        List<UsuarioBean> referencia = new UsuarioDAO().obterTodos();
    }

    @Test
    public void Adicionar() {
        UsuarioBean usuarios = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuarios.setNome("Gustavo");
        usuarios.setEstado_civil("solteiro");
        usuarios.setIdade(byteValue(21));
        usuarios.setSexo('M');
        usuarios.setLogin("GustavoBeleza");
        usuarios.setSenha("G#b147896");
        usuarios.setCpf("123.789.456-09");
        usuarios.setRg("984.321.75-2");
        usuarios.setTelefone("47974185296");
        usuarios.setEmail("gustavobeleza@outlook.com");
        usuarios.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuarios.setComplemento("qualquer coisa");
        usuarios.setCidade("Blumenau");
        usuarios.setUf("sc");
        usuarios.setNaturalidade("GO");
        usuarios.setData_nascimento(Date.valueOf("1996-02-19"));
        usuarios.setNome_fic("Gus");
        usuarios.setTipo_sanguineo("A+");
        usuarios.setContato_emergencia("47997835153");
        
        int referencia = new UsuarioDAO().adicionar(usuarios);
        usuarios.setId(referencia);
    }

    @Test
    public void Excluir() {
        UsuarioBean usuario = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome("Gustavo");
        usuario.setEstado_civil("solteiro");
        usuario.setIdade(byteValue(21));
        usuario.setSexo('M');
        usuario.setLogin("GustavoBeleza");
        usuario.setSenha("G#b147896");
        usuario.setCpf("123.789.456-09");
        usuario.setRg("984.321.75-2");
        usuario.setTelefone("47974185296");
        usuario.setEmail("gustavobeleza@outlook.com");
        usuario.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuario.setComplemento("qualquer coisa");
        usuario.setCidade("Blumenau");
        usuario.setUf("sc");
        usuario.setNaturalidade("GO");
        usuario.setData_nascimento(Date.valueOf("1996-02-19"));
        usuario.setNome_fic("Gus");
        usuario.setTipo_sanguineo("A+");
        usuario.setContato_emergencia("47997835153");
        
        int referencia = new UsuarioDAO().adicionar(usuario);
        usuario.setId(referencia);
        new UsuarioDAO().excluir(referencia);
    }

    @Test
    public void Alterar() {
        UsuarioBean usuario = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome("Gustavo");
        usuario.setEstado_civil("solteiro");
        usuario.setIdade(byteValue(21));
        usuario.setSexo('M');
        usuario.setLogin("GustavoBeleza");
        usuario.setSenha("G#b147896");
        usuario.setCpf("123.789.456-09");
        usuario.setRg("984.321.75-2");
        usuario.setTelefone("47974185296");
        usuario.setEmail("gustavobeleza@outlook.com");
        usuario.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuario.setComplemento("qualquer coisa");
        usuario.setCidade("Blumenau");
        usuario.setUf("sc");
        usuario.setNaturalidade("GO");
        usuario.setData_nascimento(Date.valueOf("1996-02-19"));
        usuario.setNome_fic("Gus");
        usuario.setTipo_sanguineo("A+");
        usuario.setContato_emergencia("47997835153");
        
        int referencia = new UsuarioDAO().adicionar(usuario);
        usuario.setId(referencia);

        new UsuarioDAO().alterar(usuario);
    }

    @Test
    public void ObterPeloId() {
        UsuarioBean usuario = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome("Gustavo");
        usuario.setEstado_civil("solteiro");
        usuario.setIdade(byteValue(21));
        usuario.setSexo('M');
        usuario.setLogin("GustavoBeleza");
        usuario.setSenha("G#b147896");
        usuario.setCpf("123.789.456-09");
        usuario.setRg("984.321.75-2");
        usuario.setTelefone("47974185296");
        usuario.setEmail("gustavobeleza@outlook.com");
        usuario.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuario.setComplemento("qualquer coisa");
        usuario.setCidade("Blumenau");
        usuario.setUf("sc");
        usuario.setNaturalidade("GO");
        usuario.setData_nascimento(Date.valueOf("1996-02-19"));
        usuario.setNome_fic("Gus");
        usuario.setTipo_sanguineo("A+");
        usuario.setContato_emergencia("47997835153");
    }

    @Test
    public void Autenticar() {
        UsuarioBean usuario = new UsuarioBean();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome("Gustavo");
        usuario.setEstado_civil("solteiro");
        usuario.setIdade(byteValue(21));
        usuario.setSexo('M');
        usuario.setLogin("GustavoBeleza");
        usuario.setSenha("G#b147896");
        usuario.setCpf("123.789.456-09");
        usuario.setRg("984.321.75-2");
        usuario.setTelefone("47974185296");
        usuario.setEmail("gustavobeleza@outlook.com");
        usuario.setEndereco("Rua Alguma Coisa Que Não Sei, 277, Jardim Inexistente");
        usuario.setComplemento("qualquer coisa");
        usuario.setCidade("Blumenau");
        usuario.setUf("sc");
        usuario.setNaturalidade("GO");
        usuario.setData_nascimento(Date.valueOf("1996-02-19"));
        usuario.setNome_fic("Gus");
        usuario.setTipo_sanguineo("A+");
        usuario.setContato_emergencia("47997835153");
    }
    
}
