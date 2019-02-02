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
@WebServlet(urlPatterns = "/alimentos")
public class AlimentoIndex extends HttpServlet{
    
    private PrintWriter out;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AlimentoBean> alimentos = new AlimentoDAO().obterTodos();
        out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/bootstrap/css/bootstrap.css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.2.0/css/all.css' integrity='sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ' crossorigin='anonymous'/>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/alimentos-index.css'>");
        out.println("<link rel='icon' href ='http://www.oknoticias.com.br/wp-content/uploads/2014/10/Lanches.png'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='my-navbar'>");
        out.println("<a href='/WebExemplo02/'>Home</a>");
        out.println("<div class='my-dropdown'>");
        out.println("<button class='my-dropbtn'>Alimentos");
        out.println("<i class='fa fa-caret-down'></i>");
        out.println("</button>");
        out.println("<div class='my-dropdown-content'>");
        out.println("<a href='/WebExemplo02/alimentos'>Lista</a>");
        out.println("<a href='/WebExemplo02/alimentos/cadastro'>Cadastro</a>");
        out.println("</div>");
        out.println("</div> ");
        out.println("</div>");
        
        out.println("<div class='container-fluid'>");
        out.println("<div class='row'>");
        out.println("<div class='col-md-12'>");
        out.println("<h3 class='text-center'>Lista de Alimentos</h3>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='col-md-2 offset-md-10'>");
        out.println("</div>");
        out.println("</div>");
        
        gerarTabela(alimentos);
        
        out.println("<a href='/WebExemplo02/alimentos/cadastro' class='btn btn-primary float-right'><i class='fa fa-plus-square'></i>  Novo Alimento</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
    }
    
    private void gerarTabela(List<AlimentoBean> alimentos){
        out.println("<div class='row mtx-3 justify-content-md-center'>");
        out.println("<div class='col-md-12'>");
        out.println("<table class='table table-striped table-dark>");
        out.println("<thead class='table-dark'>");
        out.println("<tr>");
        out.println("<th>Código</th>");
        out.println("<th>Nome</th>");
        out.println("<th>Preço</th>");
        out.println("<th>Quantidade</th>");
        out.println("<th>Total</th>");
        out.println("<th>Ação</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        
        for(AlimentoBean alimento: alimentos){
            out.println("<tr>");
            out.println("<td>" + alimento.getId() + "</td>");
            out.println("<td>" + alimento.getNome() + "</td>");
            out.println("<td>" + String.format("R$%.2f",alimento.getPreco())+ "</td>");
            out.println("<td>" + alimento.getQuantidade() + "</td>");
            out.println("<td>" + String.format("R$%.2f",(alimento.getPreco()*alimento.getQuantidade())) + "</td>");
            out.println("<td>");
            out.println("<a href='/WebExemplo02/alimentos/editar?id="+alimento.getId()+"' class='btn btn-outline-success'><i class='fa fa-edit'></i> Editar</a>");
            out.println("<a href='/WebExemplo02/alimentos/excluir?id="+alimento.getId()+"' class='btn btn-outline-danger'><i class='fa fa-trash'></i> Exluir</a>");
            out.println("</td>");
            out.println("</tr>");
        }
        
        out.println("</tbody>");
        out.println("<tfoot>");
        out.println("<tr>");
        out.println("<th>Código</th>");
        out.println("<th>Nome</th>");
        out.println("<th>Preço</th>");
        out.println("<th>Quantidade</th>");
        out.println("<th>Total</th>");
        out.println("<th>Ação</th>");
        out.println("</tr>");
        out.println("</tfoot>");
        out.println("</table>");
        out.println("</div>");
        out.println("</div>");

    }
    
    
}
