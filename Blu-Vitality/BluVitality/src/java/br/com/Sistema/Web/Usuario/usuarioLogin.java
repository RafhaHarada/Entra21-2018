package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/usuario/login")
public class usuarioLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        if ((UsuarioBean) req.getSession().getAttribute("usuario") != null) {
            UsuarioBean usuario = ((UsuarioBean) req.getSession().getAttribute("usuario"));
            String tipoFuncionario = "";
            FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
            tipoFuncionario = funcionario.getTipo();
            if (!tipoFuncionario.isEmpty()) {
                resp.sendRedirect("/" + tipoFuncionario);
            } else {
                resp.sendRedirect("/usuario");
            }
        } else {
            req.getRequestDispatcher("/usuario/login.jsp").include(req, resp);
        }
    }
}
