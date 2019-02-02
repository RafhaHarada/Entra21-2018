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
 * @author Alunos
 */
@WebServlet(name = "ObterTodosParaAutoComplete", urlPatterns = {"/ObterTodosPara/AutoComplete"})
public class ObterTodosParaAutoComplete extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String termo= request.getParameter("term") == null? "" : request.getParameter("term");
        
        response.setContentType("application/json");
        
        List<HashMap<String, String>> numero = new UsuarioDAO().obterTodosParaAutoComplete(termo);
        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put("results", numero);
        response.getWriter().print(new Gson().toJson(resultado));
    }
}
