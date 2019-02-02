package br.com.exercicio.web;

import br.com.exercicio.bean.AlunoBean;
import br.com.exercicio.dao.AlunoDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada
 */
@WebServlet("/alunos/store")
public class AlunoStore extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlunoBean aluno = new AlunoBean();
        aluno.setNome(req.getParameter("nome"));
        aluno.setMatricula(req.getParameter("matricula"));
        aluno.setNota1(Double.parseDouble(req.getParameter("nota_1")));
        aluno.setNota2(Double.parseDouble(req.getParameter("nota_2")));
        aluno.setNota3(Double.parseDouble(req.getParameter("nota_3")));
        aluno.setMedia(((aluno.getNota1()+aluno.getNota2()+aluno.getNota3())/3));
        aluno.setFrequencia(Byte.parseByte(req.getParameter("frequencia")));
        aluno.setStatus(aluno.getFrequencia() < 65 ? "Reprovado por frequência!":
                        aluno.getMedia() < 5 ? "Reprovado por média!":
                        aluno.getMedia() < 7 ? "Em Exame!":
                        "Aprovado");
        int code = new AlunoDao().add(aluno);
        
        if(code > 0){
            resp.sendRedirect("/WebExercicio01/alunos");
        }
    }

}
