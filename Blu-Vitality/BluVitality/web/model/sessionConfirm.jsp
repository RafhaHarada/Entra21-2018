<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect("/usuario/login");
    } else {
        int id_usuario = ((UsuarioBean)session.getAttribute("usuario")).getId();
        usuario = new UsuarioDAO().obterPeloId(id_usuario);
%>
<div onpageshow="M.toast({html: 'Login bem sucedido!'})" class="rounded green"></div>
<%
    }
%>