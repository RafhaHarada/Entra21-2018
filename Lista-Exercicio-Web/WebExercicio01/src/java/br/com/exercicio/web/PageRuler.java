package br.com.exercicio.web;

import java.io.PrintWriter;

/**
 * @author Rafael Alipio Harada
 */
public class PageRuler {

    public static void pageHead(PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alunos</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExercicio01/resources/css/bootstrap/css/bootstrap.css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.2.0/css/all.css' integrity='sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ' crossorigin='anonymous'/>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExercicio01/resources/css/css-index.css'>");
        out.println("<link rel='icon' href ='https://www.shareicon.net/data/2016/07/29/803832_book_512x512.png'/>");
        out.println("<script src='/WebExercicio01/resources/js/alunos.js'></script>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div class='my-navbar my-Font mb-sm-3'>");
        out.println("<a href='/WebExercicio01/' class='nyanCat'></a>");
        out.println("<div class='my-dropdown'>");
        out.println("<button class='my-dropbtn'>Alunos");
        out.println("<i class='fa fa-caret-down'></i>");
        out.println("</button>");
        out.println("<div class='my-dropdown-content'>");
        out.println("<a href='/WebExercicio01/alunos'>Lista</a>");
        out.println("<a href='/WebExercicio01/alunos/novo'>Cadastro</a>");
        out.println("</div>");
        out.println("</div> ");
        out.println("</div>");
    }

    public static void pageFoot(PrintWriter out) {
        out.println("</body>");
        out.println("</html>");
    }
    
    public static void pageFormInput(PrintWriter out, String id, String type, String label){
        out.println("<div id='div-"+id+"' class='form-group'><label for='"+id+"' class='text-light'>"+label.trim()+"</label><input type='"+type+"' id='"+id+"' name='"+label.toLowerCase().replace(" ", "_").trim()+"' class='form-control  mb-sm-3' </div>");
    }
    
    public static void pageFormInputAdd(PrintWriter out, String id, String type, String label, String add){
        out.println("<div id='div-"+id+"' class='form-group'><label for='"+id+"' class='text-light'>"+label.trim()+"</label><input type='"+type+"' id='"+id+"' name='"+label.toLowerCase().replace(" ", "_").trim()+"' class='form-control  mb-sm-3' "+add+" </div>");
    }
    
    public static void pageFormInputRequired(PrintWriter out, String id, String type, String label){
        out.println("<div id='div-"+id+"' class='form-group'><label for='"+id+"' class='text-light'>"+label.trim()+"<span class='text-danger font-weight-bold'>*</span></label><input type='"+type+"' id='"+id+"' name='"+label.toLowerCase().replace(" ", "_").trim()+"' class='form-control  mb-sm-3' required='required'>"+
        "</div>");
    }
    
    public static void pageFormInputRequiredAdd(PrintWriter out, String id, String type, String label, String add){
        out.println("<div id='div-"+id+"' class='form-group'><label for='"+id+"' class='text-light'>"+label.trim()+"<span class='text-danger font-weight-bold'>*</span></label><input type='"+type+"' id='"+id+"' name='"+label.toLowerCase().replace(" ", "_").trim()+"' class='form-control  mb-sm-3' "+add+" required='required'>"+
        "</div>");
    }
}
