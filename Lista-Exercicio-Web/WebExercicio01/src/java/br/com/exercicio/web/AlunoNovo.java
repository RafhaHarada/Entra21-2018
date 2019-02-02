package br.com.exercicio.web;

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
@WebServlet("/alunos/novo")
public class AlunoNovo extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        PageRuler.pageHead(out);
        out.print("<div class='container-fluid col-sm-8 col-sm-offset-8'><form action='/WebExercicio01/alunos/store' method='POST' onSubmit='validarFormulario()'>");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nome", "text", "Nome","onfocusout='validarCampoNome()'");
        PageRuler.pageFormInputAdd(out, "campo-matricula", "text", "Matricula","onfocusout='validarCampoMatricula()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota1", "number", "Nota 1","step='0.1' min='0' max ='10' onfocusout='validarCampoNota1()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota2", "number", "Nota 2","step='0.1' min='0' max ='10' onfocusout='validarCampoNota2()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-nota3", "number", "Nota 3","step='0.1' min='0' max ='10' onfocusout='validarCampoNota3()");
        PageRuler.pageFormInputRequiredAdd(out, "campo-frequencia", "number", "Frequencia", " min='0' max ='100' onfocusout='validarCampoFrequencia()");
        out.print("<input type='submit' value='Cadastrar' class='btn btn-primary'></form></div>");
        PageRuler.pageFoot(out);
    }

    
}
