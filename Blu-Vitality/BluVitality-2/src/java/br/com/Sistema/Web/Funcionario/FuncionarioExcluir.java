/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Gus
 */
@WebServlet(urlPatterns = "/funcionario/excluir")
public class FuncionarioExcluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioBean usuario = ((UsuarioBean) req.getSession().getAttribute("usuario"));
        String tipoFuncionario = "";
        FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
        tipoFuncionario = funcionario.getTipo();
        String clientUrl = req.getRequestURL().toString();
        String url = "/usuario";
        if (!tipoFuncionario.equals("administrador")) {
            if (!clientUrl.contains(url)) {
                resp.sendRedirect(url);
            }
        } else {
            int id = Integer.parseInt(req.getParameter("id"));
            boolean apagar = new FuncionarioDAO().apagar(id);
            if (apagar == true) {
                IndexRedirect.redirecionar(req, resp, "administrador");
            } else {
                resp.getWriter().print("Houve um erro tente novamente");
            }
        }
    }

}
