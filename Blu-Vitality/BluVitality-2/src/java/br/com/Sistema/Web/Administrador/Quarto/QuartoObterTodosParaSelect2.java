/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Quarto;

import br.com.Sistema.DAO.QuartoDAO;
import com.google.gson.Gson;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Document   : 
 * Created on : 17/09/2018
 * Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */

@WebServlet(name = "QuartoObterTodosParaSelect2", urlPatterns = {"/quartos/obtertodosparaselect2"})
public class QuartoObterTodosParaSelect2 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String termo= req.getParameter("term") == null? "" : req.getParameter("term");
        
        resp.setContentType("application/json");
        
        List<HashMap<String, String>> numero = new QuartoDAO().obterTodosParaSelect2(termo);
        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put("results", numero);
        resp.getWriter().print(new Gson().toJson(resultado));
    }


}
