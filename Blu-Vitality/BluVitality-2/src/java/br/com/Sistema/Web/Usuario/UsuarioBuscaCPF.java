/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.UsuarioDAO;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gus
 */
@WebServlet(name = "usuariobuscacpf", urlPatterns = {"/busca/usuario/cpf"})
public class UsuarioBuscaCPF extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        UsuarioBean usuario = new UsuarioBean();
        req.getParameter("id");
        req.setAttribute("usuario", usuario);
        req.setAttribute("title", "Cadastro Funcionario");
        resp.setContentType("application/json");
        resp.getWriter().write(new Gson().toJson(usuario));
    }

    
}
