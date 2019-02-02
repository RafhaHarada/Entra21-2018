/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Servicos;

import br.com.Sistema.Bean.FuncionarioBean;
import br.com.Sistema.Bean.ServicosBean;
import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.FuncionarioDAO;
import br.com.Sistema.DAO.ServicosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Document : Created on : 17/09/2018 Author : @Gustavo Rodrigues
 * (gugaaroodrigues@gmail.com)
 */
@WebServlet("/servicos/store")
public class ServicosStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        UsuarioBean usuario = (UsuarioBean) req.getSession().getAttribute("usuario");
        FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
        ServicosBean servico = new ServicosBean();
        servico.setId_funcionario(funcionario.getId());
        servico.setNome(req.getParameter("nome"));
        servico.setDescricao(req.getParameter("descricao"));
        servico.settipo(req.getParameter("tipo"));

        servico.setId(new ServicosDAO().adicionar(servico));

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("certo");
    }

}
