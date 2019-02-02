package br.com.Sistema.Web.Comum;

import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.ExpedicaoDAO;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet("/expedicao/excluir")
public class expedicaoExcluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ((UsuarioBean) req.getSession().getAttribute("usuario") == null) {
            IndexRedirect.redirecionar(req, resp, "usuario");
        } else {
            int id = Integer.parseInt(req.getParameter("id"));
            new ExpedicaoDAO().apagar(id);

            resp.sendRedirect("/usuario");
        }
    }
}
