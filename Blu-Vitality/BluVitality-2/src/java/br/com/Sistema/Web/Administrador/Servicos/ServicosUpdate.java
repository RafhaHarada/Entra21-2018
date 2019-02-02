/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Servicos;

import br.com.Sistema.Bean.ServicosBean;
import br.com.Sistema.DAO.ServicosDAO;
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
@WebServlet("/servicos/update")
public class ServicosUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ServicosBean servico = new ServicosBean();
        
        servico.setNome(req.getParameter("nome"));
        servico.setDescricao(req.getParameter("descricao"));
        servico.settipo(req.getParameter("tipo"));

        boolean alterou = new ServicosDAO().alterar(servico);

        resp.sendRedirect("/administrador");
    }

}
