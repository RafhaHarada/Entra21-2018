<%-- 
    Document   : CadastroFuncionario
    Created on : 23/09/2018, 19:08:56
    Author     : Gus
--%>

<%@page import="br.com.Sistema.DAO.CargosDAO"%>
<%@page import="br.com.Sistema.Bean.CargosBean"%>
<%@page import="br.com.Sistema.DAO.FuncionarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="br.com.Sistema.Bean.FuncionarioBean"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form action="/funcionario/store" method="get">
    <div class="container">
        <div class="input-field col s12">
            <select id="cadastro-funcionario-id-usuario" name="id-usuario">
                <option value="" disabled selected>Novo Funcionário</option>
                <%
                    List<UsuarioBean> novoFuncionario = new UsuarioDAO().obterTodos();
                    for (int i = 0; i < novoFuncionario.size(); i++) {
                        if (!novoFuncionario.get(i).isColaborador()) {
                %>
                <option value="<%=novoFuncionario.get(i).getId()%>"><%=novoFuncionario.get(i).getNome()%></option>
                <%
                        }
                    }
                %>
            </select>
            <label for="cadastro-funcionario-id-usuario">Novo Funcionário</label>
        </div>
        <div class="input-field col s12">
            <select id="cadastro-funcionario-tipo" name="tipo">
                <option value="" disabled selected>Escolha o tipo de funcionário</option>
                <option value="funcionario">Funcionario</option>
                <option value="administrador">Administrador</option>
            </select>
            <label for="cadastro-funcionario-tipo">Tipo</label>
        </div>
        <div class="input-field col s12">
            <select id="cadastro-funcionario-id-cargo" name="id-cargo">
                <option value="" disabled selected>Cargo</option>
                <%
                    List<CargosBean> cargoFuncionario = new CargosDAO().obterTodos();
                    for (int i = 0; i < cargoFuncionario.size(); i++) {
                %>
                <option value="<%=cargoFuncionario.get(i).getId()%>"><%=cargoFuncionario.get(i).getNome()%></option>
                <%
                    }
                %>
            </select>
            <label for="cadastro-funcionario-id-cargo">Novo Funcionário</label>
        </div>
        <input type="submit" class="btn btn-flat white-text teal center" value="Cadastrar novo funcionário">
    </div>
</form>