package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada
 */
@WebServlet("/alimentos/update")
public class AlimentoUpdate extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        AlimentoBean alimento = new AlimentoBean();
        alimento.setId(Integer.parseInt(req.getParameter("id")));
        alimento.setNome(req.getParameter("nome"));
        alimento.setQuantidade(Byte.parseByte(req.getParameter("quantidade")));
        alimento.setPreco(Double.parseDouble(req.getParameter("preco")));
        alimento.setDescricao(req.getParameter("descricao"));
        boolean alterou = new AlimentoDAO().alterar(alimento);
        String resposta ="";
        if(alterou){
            System.out.println("Atualizou com sucesso");
            resp.sendRedirect("/WebExemplo02/alimentos");
        }
        else{
            System.out.println("Não foi possível atualizar");
        }
    }
}
