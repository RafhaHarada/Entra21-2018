package br.com.Sistema.Web.Administrador.financeiro;

import br.com.Sistema.DAO.CustoDAO;
import br.com.Sistema.DAO.LucroDAO;
import br.com.Sistema.DAO.ReceitaDAO;
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

@WebServlet("/administrador/financeiro/excluir")
public class FinanceiroExcluir extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IndexRedirect.redirecionar(req, resp, "usuario");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int id = Integer.parseInt(req.getParameter("id"));
        boolean apagou = new CustoDAO().apagar(id);
                apagou = new ReceitaDAO().apagar(id);
                apagou = new LucroDAO().apagar(id);
        if (apagou) {
            resp.getWriter().write("apagou");
        }else{
            resp.getWriter().write("erro");
        }
        resp.sendRedirect("/administrador/financeiro");
    }
}
