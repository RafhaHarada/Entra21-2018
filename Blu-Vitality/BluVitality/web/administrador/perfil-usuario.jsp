<%-- 
    Document   : perfil-usuario
    Created on : 26/09/2018, 09:49:24
    Author     : Gus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>

<div class="modal modal-overlay" style="background-color: white;" id="modalPerfil">
    <div class="modal-content">
        <ul class="collection col s6">
            <li class="collection-item avatar teal lighten-4">
                <img src="" alt="" class="circle red">
                <span class="nome">Nome:</span>
                <span><%=usuario.getNome()%></span>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="data-nascimento">Data de nascimento:</span>
                <span>
                    <% String dataEn[] = usuario.getData_nascimento().toString().split("-");
                        String dataBr = dataEn[2] + "/" + dataEn[1] + "/" + dataEn[0];
                    %>
                    <%=dataBr%>
                </span>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="cpf">CPF:</span>
                <span><%=usuario.getCpf()%></span>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="rg">RG:</span>
                <span><%=usuario.getRg()%></span>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="naturalidade">Naturalidade:</span>
                <span><%=usuario.getNaturalidade()%></span>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="sexo">Sexo:</span>
                <span><%=usuario.getSexo()%></span>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="sanguineo">Tipo Sanguíneo:</span>
                <span><%=usuario.getTipo_sanguineo()%></span>
            </li>
        </ul>
        <ul class="collection col s6">
            <li class="collection-item teal lighten-4">
                <span class="cidade">Cidade:</span>
                <span><%=usuario.getCidade()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="uf">UF:</span>
                <span><%=usuario.getUf()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="endereco">Endereço</span>
                <span><%=usuario.getEndereco()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="email">Email:</span>
                <span><%=usuario.getEmail()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="telefone">Telefone:</span>
                <span><%=usuario.getTelefone()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-5">
                <span class="contato-emergencia">Contato de emergência:</span>
                <span><%=usuario.getContato_emergencia()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
            <li class="collection-item teal lighten-4">
                <span class="estado-civil">Estado Civil:</span>
                <span><%=usuario.getEstado_civil()%></span>
                <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
            </li>
           
        </ul>
        <div class="modal-footer">
            <a href="#!" class="modal-close waves-effect waves-green btn-flat">Fechar</a>
        </div>
    </div>
</div>






