package br.com.Sistema.Web.Administrador.financeiro;

import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */

@WebServlet("/administrador/financeiro/editar")
public class FinanceiroEditar extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IndexRedirect.redirecionarSubpasta(req, resp, "administrador","financeiro/editar.jsp");
    }
}
