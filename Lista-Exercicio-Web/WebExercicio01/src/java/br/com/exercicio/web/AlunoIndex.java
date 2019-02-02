package br.com.exercicio.web;

import br.com.exercicio.bean.AlunoBean;
import br.com.exercicio.dao.AlunoDao;
import br.com.exercicio.web.PageRuler;
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

@WebServlet("/alunos")
public class AlunoIndex extends HttpServlet{
    
    private PrintWriter out;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out = resp.getWriter();
        PageRuler.pageHead(out);
        //pageBody
        out.print("<div class='row mtx-3 justify-content-sm-center'>" +
                "<div class='col-sm-8'>" +
                "<table id='myTable' class='table table-dark' dt-responsive nowrap' style='width:100%'>" +
                "<thead>" +
                "<tr class='small'>" +
                "<th>Nome</th>" +
                "<th>Matrícula</th>" +
                "<th>Média</th>" +
                "<th>Frequência</th>" +
                "<th>Resultado</th>" +
                "<th>Ações</th>" +
                "</tr>" +
                "</thead>");
        for (AlunoBean aluno : new AlunoDao().allAdded()) {
            out.print("<tbody>" +
                "<tr>" +
                "<td>"+aluno.getNome()+"</td>" +
                "<td>"+aluno.getMatricula()+"</td>" +
                "<td>"+String.format("%.2f",aluno.getMedia())+"</td>" +
                "<td>"+String.format("%d",aluno.getFrequencia())+"%</td>" +
                "<td>"+aluno.getStatus()+"</td>" +
                "<td><a href='/WebExercicio01/alunos/editar?id="+aluno.getId()+"'><i class='fa fa-edit'></i> Editar </a>" +
                "<a href='/WebExercicio01/alunos/delete?id="+aluno.getId()+"'><i class='fa fa-trash'></i> Apagar </a></td>" +
                "</tr>" +
                "</tbody>");
        }
        out.print("<tfoot>" +
                "<tr class='small'>" +
                "<th>Nome</th>" +
                "<th>Matrícula</th>" +
                "<th>Média</th>" +
                "<th>Frequência</th>" +
                "<th>Resultado</th>" +
                "<th>Ações</th>" +
                "</tr>" +
                "</tfoot>" +
                "</table><a href='/WebExercicio01/alunos/novo' class='btn btn-primary float-right'><i class='fa fa-plus-square'></i>  Novo Aluno</a></div></div></div>");
        PageRuler.pageFoot(out);
    }

}
