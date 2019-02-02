<%-- 
    Document   : funcionarioTabConteudo
    Created on : 20/09/2018, 08:04:43
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 Rafael Alipio Harada
--%> 

<%
    if (cargoDoFuncionario.equals("Administrador")) {
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/prontuarioBusca.jsp" %>
<%@include file="tabsCargos/agendamentos.jsp" %>
<%@include file="tabsCargos/agendamentosfuturos.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
} else if (cargoDoFuncionario.equals("Medico")) {
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/prontuarioBusca.jsp" %>
<%@include file="tabsCargos/pendenciasFuturas.jsp" %>
<%@include file="tabsCargos/agendamentosfuturos.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
} else if (cargoDoFuncionario.equals("Gerente")){
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/prontuarioBusca.jsp" %>
<%@include file="tabsCargos/agendamentos.jsp" %>
<%@include file="tabsCargos/agendamentosfuturos.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
} else if (cargoDoFuncionario.equals("Recepcionista")) {
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/prontuarioBusca.jsp" %>
<%@include file="tabsCargos/agendamentos.jsp" %>
<%@include file="tabsCargos/pendenciasFuturas2.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
} else if (cargoDoFuncionario.equals("Limpeza")) {
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/agendamentos.jsp" %>
<%@include file="tabsCargos/agendamentosfuturos.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
} else {
%>
<%@include file="tabsCargos/perfil.jsp" %>
<%@include file="tabsCargos/agendamentos.jsp" %>
<%@include file="tabsCargos/agendamentosfuturos.jsp" %>
<%@include file="tabsCargos/historico.jsp" %>
<%
    }
%>