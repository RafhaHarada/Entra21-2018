<%-- 
    Document   : sidenavcard
    Created on : 27/08/2018, 11:15:48
    Author     : @Rafael Alipio Harada (rafhaharada@gmail.com)
--%>
<%@page import="br.com.Sistema.DAO.CargosDAO"%>
<%@page import="br.com.Sistema.Bean.CargosBean"%>
<%@page import="br.com.Sistema.Bean.FuncionarioBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.Sistema.DAO.FuncionarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>

<!-- SESSION CONFIRM -->
<%  UsuarioBean usuario = new UsuarioBean();
    if (session.getAttribute("usuario") == null || session.getAttribute("usuario") == "") {
        response.sendRedirect("/usuario/login");
    } else {
        usuario = ((UsuarioBean) session.getAttribute("usuario"));
%>
<div onpageshow="M.toast({html: 'Login bem sucedido!'})" class="rounded green"></div>

<!-- SIDENAV BY CARGO -->
<%
    }
    String cargoDoFuncionario = "";
    if (usuario != null) {
        if (usuario.isColaborador()) {
            FuncionarioBean funcionario = new FuncionarioDAO().obterPeloIdUsuario(usuario.getId());
            cargoDoFuncionario = funcionario.getCargo().getNome();
        }
    }
    if (cargoDoFuncionario.equals("Administrador")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<li class="no-padding">
    <ul class="collapsible collapsible-accordion">
        <li>
            <a class="collapsible-header waves-effect waves-teal">Hospital<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Configurações local</a></li>
                    <li><a href="#!">Eventos</a></li>
                    <li><a href="#!">Equipamentos</a></li>
                    <li><a href="#!">Funcionarios</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Pacientes<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Perfil</a></li>
                    <li><a href="#!">Prontuario</a></li>
                    <li><a href="#!">Localização</a></li>
                    <li><a href="#!">Geral B.O</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Pendencias<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Adicionar</a></li>
                    <li><a href="#!">Solicitar</a></li>
                    <li><a href="#!">Pedidos</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Estoque<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!" class="waves-effect">Medicamentos</a></li>
                    <li><a href="#!">Equipamentos</a></li>
                    <li><a href="#!">Solicitar M.</a></li>
                    <li><a href="#!">Cadastrar</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
    </ul>
</li>
<div class="divider"></div>

<%
} else if (cargoDoFuncionario.equals("Medico")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Perfil</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pendências</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pacientes</a>
</li>
<div class="divider"></div>
<%
} else if (cargoDoFuncionario.equals("Gerente")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Perfil</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pendências</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pacientes</a>
</li>
<div class="divider"></div>
<%
} else if (cargoDoFuncionario.equals("Recepcionista")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Perfil</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pendências</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pacientes</a>
</li>
<div class="divider"></div>
<%
} else if (cargoDoFuncionario.equals("Limpeza")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil"><span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil"><span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Perfil</a>
</li>
<div class="divider"></div>
<li>
    <a href='#'>Pendências</a>
</li>
<div class="divider"></div>
<%
} else {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/usuario.png">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil"><span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil"><span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<div class="divider"></div>
<%
    }
%>