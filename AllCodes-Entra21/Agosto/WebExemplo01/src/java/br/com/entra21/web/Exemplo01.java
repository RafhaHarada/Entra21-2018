package br.com.entra21.web;

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
@WebServlet(urlPatterns = "/hello")
public class Exemplo01 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Request -> Requisição: é o que chega para o servidor
        Response -> Resposta: é o que é retornado para o cliente*/
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Exemplo 01</title>");
        out.print("<style type='text/css'>");
        out.print(".img{");
        out.println("background-image: url(https://steamusercontent-a.akamaihd.net/ugc/196298724734371900/B9AE0EDF25A66B1CD72D089E51C54B202AD91D77/?interpolation=lanczos-none&output-format=jpeg&output-quality=95&fit=inside%7C1024%3A602&composite-to=*,*%7C1024%3A602&background-color=black);");
        out.println("background-repeat: no-repeat ;");
        out.println("background-size: 100%;");
        out.println("color: white;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body style='color: white' class='img'>");
        out.println("<h1>Olá mundo</h1>");
        out.println("<form action='Calcular' method='post'>");
        out.println("<label>Número 01</label>");
        out.println("<input type='number' name='numero-01'>");
        out.println("<label>Número 02</label>");
        out.println("<input type='number' name='numero-02'>");
        out.println("<input type='submit' value='Calcular' class='img'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
    
}
