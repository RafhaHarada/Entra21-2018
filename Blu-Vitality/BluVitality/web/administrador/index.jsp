<%-- 
   Document   : index (administrador)
   Created on : 26/08/2018, 17:47:02
   Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
                @Rafael Alipio Harada (rafhaharada@gmail.com)

--%>
<%@include file="../model/validation.jsp" %>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="/usuario/logout" onclick="signOut();">Sair</a></li>
    </ul>
</li>
<%@include file="../model/headerEnd.jsp" %>
<!--%@include file="../model/sessionConfirm.jsp" %-->
<div class=" row">
    <a href="/administrador/financeiro.jsp" class="waves-effect waves-light red btn-small right" id="btnFinancas">Financeiro</a>
    <div class="" style="margin-top: auto">
        <span class="text-bold"> Olá seja bem Vindo volta <%=usuario.getNome()%><span>
                <div class="divider"></div>
                <ul class="tabs tabs-transparent center ">
                    <li class="tab"><a href="#listapaciente" class="teal-text waves-effect">Pacientes</a></li>
                    <li class="tab"><a href="#lisfuncionarios" class="teal-text waves-effect">Funcionarios</a></li>
                    <li class="tab"><a href="#hospitalQuartos" class="teal-text waves-effect atualizaTabFunc">Quarto</a></li>
                    <li class="tab"><a href="#hospitalPendencias" class="teal-text waves-effect">Serviços</a></li>
                    <li class="tab"><a href="#cadastrofunc" class="teal-text waves-effect">Cadastro Funcionario</a></li>
                </ul>
                <div class="divider"></div>
                <div id="listapaciente" class="col s12 scrollBarOnDiv container">
                    <%@include file="table/tabela-usuarios.jsp" %>
                    <%@include file="perfil-usuario.jsp"%>
                </div>
                <div id="lisfuncionarios" class="col s12 container">
                    <div class="">
                        <%@include file="table/tabela-funcionarios.jsp" %> 
                    </div>
                </div>
                <div id="hospitalQuartos" class="col s12 container scrollBarOnDiv">
                    <div class="col s12">
                        <div class="row"> 
                            <div class="col s12 m6 left">
                                <span class="flow-text ">Quartos</span><br>
                                <%@include file="quarto/quarto-formulario-cadastro.jsp"%>
                            </div>
                            <div class="col s12 m6 right">
                                <%@include file="table/table-quartos.jsp" %>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="hospitalPendencias" class="col s12 container scrollBarOnDiv">
                    <div class="col s12">
                        <div class="row"> 
                            <div class="col s12 m8 left">
                                <span class="flow-text ">Serviços</span><br>
                                <%@include file="formulario-servicos.jsp"%>                   
                            </div>
                        </div>
                        <div class="row"> 
                            <div class="col s12">
                                <%@include file="table/table-ultimos-servicos.jsp" %>
                            </div>
                        </div>
                    </div>
                    <div id="cadastrofunc" class="col s12 container">
                        <div class="row">
                            <%@include file="cadastro-funcionario.jsp"%>
                        </div>
                    </div>
                </div>
                <!--<div id="loading" style="display: block">
                    <i class="material-icons right ld ld-cycle" id="loading">loop</i>
                </div>-->
                <%@include file="../model/footer.jsp" %> 