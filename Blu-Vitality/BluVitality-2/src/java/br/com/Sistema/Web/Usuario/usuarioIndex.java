package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
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
@WebServlet("/usuario")
public class usuarioIndex extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IndexRedirect.redirecionar(req, resp, "usuario");
    }
}
