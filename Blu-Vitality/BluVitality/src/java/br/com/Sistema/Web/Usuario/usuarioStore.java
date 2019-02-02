package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
import br.com.Sistema.DAO.UsuarioDAO;
import br.com.Sistema.Web.Comum.Criptografar;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/usuario/store")
public class usuarioStore extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IndexRedirect.redirecionar(req, resp, "usuario");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioBean usuario = new UsuarioBean();

        usuario.setNome(req.getParameter("nome-completo"));
        usuario.setSexo(req.getParameter("sexo").charAt(0));
        usuario.setCpf(req.getParameter("cpf"));
        usuario.setRg(req.getParameter("rg"));
        char sexo = usuario.getSexo();
        usuario.setEstado_civil(req.getParameter("estado-civil")+(sexo == 'M'? "o" : sexo == 'F' ? "a" : "o (a)"));
        usuario.setTelefone(req.getParameter("telefone"));
        usuario.setEmail(req.getParameter("email"));
        usuario.setLogin(req.getParameter("login"));
        usuario.setSenha(Criptografar.encriptografar(req.getParameter("senha")));
        usuario.setEndereco(req.getParameter("endereco"));
        usuario.setCidade(req.getParameter("cidade"));
        usuario.setComplemento(req.getParameter("complemento"));
        usuario.setContato_emergencia(req.getParameter("contato-emergencia"));
        usuario.setUf(req.getParameter("uf"));
        usuario.setNaturalidade(req.getParameter("naturalidade"));
        String dataBr[] = req.getParameter("data-nascimento").split("/");
        String dataEn = dataBr[2] + "-" + dataBr[1] + "-" + dataBr[0];
        usuario.setData_nascimento(java.sql.Date.valueOf(dataEn));
        byte idade = (byte) Period.between(LocalDate.parse(dataEn), LocalDate.now()).getYears();
        usuario.setIdade(idade);
        usuario.setTipo_sanguineo(req.getParameter("tipo-sanguineo"));
        usuario.setNome_fic("");

        usuario.setId(new UsuarioDAO().adicionar(usuario));
        
        FuncionarioBean funcionario = new FuncionarioBean();
        funcionario.setId_cargo(6);
        funcionario.setId_usuario(usuario.getId());
        funcionario.setTipo("");
        funcionario.setId(new FuncionarioDAO().adicionar(funcionario));

        resp.setContentType("text/html;charset=UTF-8");
        resp.sendRedirect("/usuario");
    }
}
