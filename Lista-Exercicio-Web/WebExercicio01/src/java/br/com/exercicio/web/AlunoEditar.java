package br.com.exercicio.web;

import br.com.exercicio.bean.AlunoBean;
import br.com.exercicio.dao.AlunoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada
 */

@WebServlet("/alunos/editar")
public class AlunoEditar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int id = Integer.parseInt(req.getParameter("id"));
        AlunoBean aluno = new AlunoDao().returnById(id);
        
        PrintWriter out = resp.getWriter();
        PageRuler.pageHead(out);
        out.print("<div class='container-fluid col-sm-8 col-sm-offset-8'><form action='/WebExercicio01/alunos/update' method='POST' onSubmit='validarFormulario()'><input type='hidden' name='id' value='"+aluno.getId()+"'>");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nome", "text", "Nome", "value='"+aluno.getNome()+"' onfocusout='validarCampoNome()'");
        PageRuler.pageFormInputAdd(out, "campo-matricula", "text", "Matricula", "value='"+aluno.getMatricula()+"' onfocusout='validarCampoMatricula()'");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota1", "number", "Nota 1","step='0.1' min='0' max ='10' value='"+aluno.getNota1()+"' onfocusout='validarCampoNota1()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota2", "number", "Nota 2","step='0.1' min='0' max ='10' value='"+aluno.getNota2()+"' onfocusout='validarCampoNota2()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota3", "number", "Nota 3","step='0.1' min='0' max ='10' value='"+aluno.getNota3()+"' onfocusout='validarCampoNota3()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-frequencia", "number", "Frequencia", "min='0' max ='100' value='"+aluno.getFrequencia()+"' onfocusout='validarCampoFrequencia()");
        out.print("<input type='submit' value='Atualizar' class='btn btn-primary'></form></div>");
        PageRuler.pageFoot(out);
    }

    
}
