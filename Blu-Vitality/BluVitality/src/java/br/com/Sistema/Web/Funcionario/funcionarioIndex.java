package br.com.Sistema.Web.Funcionario;

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
 * Document : Created on : 17/09/2018 Author : @Gustavo Rodrigues
 * (gugaaroodrigues@gmail.com)
 */
@WebServlet("/funcionario")
public class funcionarioIndex extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        IndexRedirect.redirecionar(req, resp, "funcionario");
//        resp.setContentType("text/html;charset=UTF-8");
//        req.getRequestDispatcher("/index.jsp").include(req, resp);
// I hate you GUSTAVO.  att: RAFAEL
    }
}
