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
 * Document   : 
 * Created on : 17/09/2018
 * Author     :  @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
@WebServlet(name = "UsuariosObterTodosParaDatatable", urlPatterns = {"/usuarios/obtertodosparadatatable"})
public class UsuariosObterTodosParaDatatable extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HashMap<String, Object> resultado = new HashMap<>();
        List<HashMap<String, Object>> registros = new UsuarioDAO().obterTodosParaDatatable();
        resultado.put("data", registros);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print(new Gson().toJson(resultado));
    }
}
