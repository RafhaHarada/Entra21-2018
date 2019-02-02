/*
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     :@Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
package br.com.Sistema.Web.Administrador;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/administrador")
public class AdministradorIndex extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        List<FuncionarioBean> funcionario = new FuncionarioDAO().obterTodos();

        if ((UsuarioBean) req.getSession().getAttribute("usuario") != null) {
            UsuarioBean usuario = ((UsuarioBean) req.getSession().getAttribute("usuario"));
            String tipoFuncionario = "";
            FuncionarioBean funcionario1 = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
            tipoFuncionario = funcionario1.getTipo();
            if (tipoFuncionario.equals("administrador")) {
                req.getRequestDispatcher("/administrador/index.jsp").include(req, resp);
            } else if (!tipoFuncionario.isEmpty()) {
                resp.sendRedirect("/" + tipoFuncionario);
            } else {
                resp.sendRedirect("/usuario");
            }
        } else {
            resp.sendRedirect("/usuario/login");
        }
    }
}
