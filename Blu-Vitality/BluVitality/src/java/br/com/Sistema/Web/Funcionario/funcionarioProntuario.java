/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Funcionario;

import br.com.Sistema.Bean.UsuarioBean;
import br.com.Sistema.DAO.UsuarioDAO;
import br.com.Sistema.Web.IndexRedirect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/funcionario/prontuario")
public class funcionarioProntuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        List<UsuarioBean> usuarios = new UsuarioDAO().obterTodos();
        UsuarioBean paciente = new UsuarioBean();
        paciente = null;

        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getNome().equals(req.getParameter("nomePaciente"))){
                paciente = usuarios.get(i);
                break;
            }
        }
        if(paciente == null){
            resp.sendRedirect("/funcionario?usuarioNaoEncontrado");
            return;
        }
//        ExpedicaoBean expedicao = new ExpedicaoBean();
//        expedicao.setTipo();
//        expedicao.setNome();
//        expedicao.setCusto();
//        expedicao.setData_expedicao();
//        expedicao.setId_usuario(Integer.parseInt(req.getParameter("id_usuario")));
//        expedicao.setId_funcionario(Integer.parseInt(req.getParameter("id_funcionario")));
//        
//        expedicao.setId(new ExpedicaoDAO().adicionar(expedicao));
//        UsuarioBean usuario = new UsuarioDAO().obterPeloId(expedicao.getId_usuario());
//        FuncionarioBean funcionario = new FuncionarioDAO().obterPeloId(expedicao.getId_funcionario());
          IndexRedirect.redirecionarSubpasta(req, resp, "funcionario", "prontuario.jsp?id="+paciente.getId());
    }

}
