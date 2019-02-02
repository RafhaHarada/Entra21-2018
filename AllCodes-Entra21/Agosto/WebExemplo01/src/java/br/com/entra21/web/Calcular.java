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

@WebServlet(urlPatterns = "/Calcular")
public class Calcular extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int numero01 = Integer.parseInt(req.getParameter("numero-01"));
        int numero02 = Integer.parseInt(req.getParameter("numero-02"));
        int soma = numero01 + numero02;
        
        PrintWriter out = resp.getWriter();
        
        out.println("<html>");
        out.println("<head></head><body>");
        out.println("<h3>A soma é: " + soma +"</h3></body>");
        out.println("</html>");
    }
    
    
}
