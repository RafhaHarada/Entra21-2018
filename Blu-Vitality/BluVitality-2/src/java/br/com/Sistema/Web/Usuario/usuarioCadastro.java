package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.UsuarioDAO;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */

@WebServlet("/usuario/cadastro")
public class usuarioCadastro extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IndexRedirect.redirecionarSubpasta(req, resp, "usuario", "cadastrar.jsp");
    }
}