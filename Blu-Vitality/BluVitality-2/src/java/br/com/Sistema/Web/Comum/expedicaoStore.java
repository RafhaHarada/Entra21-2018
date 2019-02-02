/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Comum;

import br.com.Sistema.Bean.ExpedicaoBean;
import br.com.Sistema.DAO.ExpedicaoDAO;
import br.com.Sistema.DAO.FuncionarioDAO;
import br.com.Sistema.DAO.UsuarioDAO;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */

@WebServlet("/expedicao/store")
public class expedicaoStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        ExpedicaoBean expedicao = new ExpedicaoBean();
        
        expedicao.setId_usuario(Integer.parseInt(req.getParameter("exame-cadastro-id-usuario")));
        expedicao.setId_funcionario(Integer.parseInt(req.getParameter("exame-cadastro-id-funcionario")));
        expedicao.setNome(req.getParameter("nome"));
        expedicao.setTipo(req.getParameter("tipo"));
        expedicao.setData_expedicao(Date.valueOf(req.getParameter("data")));
        expedicao.setHora_expedicao(Time.valueOf(req.getParameter("hora")));
        expedicao.setCusto(Double.parseDouble(req.getParameter("custo")));
        
        expedicao.setFuncionario(new FuncionarioDAO().obterPeloId(expedicao.getId_funcionario()));
        expedicao.setUsuario(new UsuarioDAO().obterPeloId(expedicao.getId_usuario()));
        
        expedicao.setId(new ExpedicaoDAO().adicionar(expedicao));
        
        resp.setContentType("text/html;charset=UTF-8");
        resp.sendRedirect("/usuario");
                    
     
    }

}
