/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Funcionario;

import br.com.Sistema.Bean.CargosBean;
import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.CargosDAO;
import br.com.Sistema.DAO.FuncionarioDAO;
import br.com.Sistema.DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/funcionario/Store")
public class FuncionarioStore extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        FuncionarioBean funcionario = new FuncionarioBean();
        
        funcionario.setId_usuario(Integer.parseInt(req.getParameter("id_usuario")));
        funcionario.setId_cargo(Integer.parseInt(req.getParameter("id_cargo")));
        funcionario.setTipo(req.getParameter("tipo"));
        funcionario.setId(new FuncionarioDAO().adicionar(funcionario));
        
        
        UsuarioBean usuario = new UsuarioDAO().obterPeloId(funcionario.getId_usuario());
        CargosBean cargo = new CargosDAO().obterPeloId(funcionario.getId_cargo());
        funcionario.setUsuario(usuario);
        funcionario.setCargo(cargo);
        
        resp.sendRedirect("/administrador");
        
    }

}
