/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Usuario;

import br.com.Sistema.DAO.UsuarioDAO;
import com.google.gson.Gson;
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
 *
 * @author Gus
 */
@WebServlet(name = "UsuariosObterTodosParaSelect2", urlPatterns = {"/usuarios/obterTodosParaSelect2"})
public class UsuariosObterTodosParaSelect2 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String termo= req.getParameter("term") == null? "" : req.getParameter("term");
        
        resp.setContentType("application/json");
        
        List<HashMap<String, String>> usuario = new UsuarioDAO().obterTodosParaSelect2(termo);
        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put("results", usuario);
        resp.getWriter().print(new Gson().toJson(resultado));
    }
}
