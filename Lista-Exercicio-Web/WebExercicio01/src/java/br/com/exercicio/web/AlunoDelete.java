package br.com.exercicio.web;

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
@WebServlet("/alunos/delete")
public class AlunoDelete extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean deleted = new AlunoDao().delete(id);
        if(deleted){
            resp.sendRedirect("/WebExercicio01/alunos");
        }
        else{
            PrintWriter out = resp.getWriter();
            out.print("Não apagou!");
        }
    }
    
}
