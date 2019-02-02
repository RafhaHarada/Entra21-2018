/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Quarto;

import br.com.Sistema.DAO.QuartoDAO;
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
 * Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */

@WebServlet(name = "QuartoObterTodosParaDatatable", urlPatterns = {"/quarto/obtertodosparadatatable"})
public class QuartoObterTodosParaDatatable extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HashMap<String, Object> resultado = new HashMap<>();
        List<HashMap<String, Object>> registros = new QuartoDAO().obterTodosParaDataTable();
        resultado.put("data", registros);
        resp.getWriter().print((new Gson().toJson(resultado)));
    }


}
