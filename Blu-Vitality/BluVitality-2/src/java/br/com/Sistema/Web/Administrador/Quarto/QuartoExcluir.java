/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Quarto;

import br.com.Sistema.DAO.QuartoDAO;
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
@WebServlet(urlPatterns="/quarto/excluir")
public class QuartoExcluir extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        int id = Integer.parseInt(req.getParameter("id"));
        boolean apagou = new QuartoDAO().apagar(id);
        if(apagou){
            resp.getWriter().write("apagou");
        }else{
            resp.getWriter().write("erro");
        }

    }
    
}
