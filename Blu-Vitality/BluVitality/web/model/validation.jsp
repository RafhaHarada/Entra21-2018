<%-- 
    Document   : validation
    Created on : 19/09/2018, 08:01:00
    Author     : Alunos
--%>
<%@page import="br.com.Sistema.DAO.FuncionarioDAO"%>
<%@page import="br.com.Sistema.Bean.FuncionarioBean"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%
    if ((UsuarioBean) request.getSession().getAttribute("usuario") != null) {
        String otherPages = "";
        String url = "/usuario/" + otherPages;
        UsuarioBean usuario = ((UsuarioBean) request.getSession().getAttribute("usuario"));
        if (usuario.isColaborador()) {
            FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
            String clientUrl = request.getRequestURL().toString();
            url = "/" + funcionario.getTipo() + "/" + otherPages;
            if (!url.contains("/" + funcionario.getTipo())) {
                response.sendRedirect("/" + funcionario.getTipo());
            }
        } else {
            response.sendRedirect(url);
        }
    } else {
        response.sendRedirect("/usuario/login");
    }
%>