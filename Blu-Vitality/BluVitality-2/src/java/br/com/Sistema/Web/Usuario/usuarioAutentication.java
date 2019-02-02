package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
import br.com.Sistema.DAO.UsuarioDAO;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/usuario/autentication")
public class usuarioAutentication extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IndexRedirect.redirecionar(req, resp, "usuario");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        UsuarioBean usuario = new UsuarioDAO().autenticar(login, senha);

        if (usuario != null) {
            req.getSession().setAttribute("usuario", usuario);
            String tipoFuncionario = "";
            if (new FuncionarioDAO().obterPeloIdUsuario(usuario.getId()) != null) {
                FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
                tipoFuncionario = funcionario.getTipo();
            }
            if (!tipoFuncionario.isEmpty()) {
                resp.sendRedirect("/" + tipoFuncionario);
            } else {
                resp.sendRedirect("/usuario");
            }
        } else {
            resp.sendRedirect("/usuario/login");
        }
    }

}
