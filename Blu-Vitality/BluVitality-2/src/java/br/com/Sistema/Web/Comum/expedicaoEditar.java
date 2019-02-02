package br.com.Sistema.Web.Comum;

import br.com.Sistema.Bean.ExpedicaoBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.ExpedicaoDAO;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet("/expedicao/editar")
public class expedicaoEditar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ((UsuarioBean) req.getSession().getAttribute("usuario") == null) {
            IndexRedirect.redirecionar(req, resp, "usuario");
        } else {
            ExpedicaoBean expedicao = new ExpedicaoDAO().obterPeloId(Integer.parseInt(req.getParameter("id")));
            req.setAttribute("expedicao", expedicao);

            req.getRequestDispatcher("/consulta/editar.jsp").include(req, resp);
        }
    }
}
