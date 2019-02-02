<%-- Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     :@Gustavo Rodrigues (gugaaroodrigues@gmail.com)
--%>

<%@page import="br.com.Sistema.DAO.QuartoDAO"%>
<%@page import="br.com.Sistema.Bean.QuartoBean"%>
<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%@page import="java.util.List"%>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>Opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="../">Voltar</a></li>
    </ul>
</li>
<%@include file="../model/headerEnd.jsp" %>
<div class="row">
    <div class="  center" style="margin-top: auto">
        <div class="divider"></div>
        <ul class="tabs tabs-transparent">
            <li class="tab"><a href="#hospital1" class="active teal-text waves-effect">Hospital</a></li>
            <li class="tab"><a href="#hospitalConfig" class="teal-text waves-effect">Configuração</a></li>
            <li class="tab"><a href="#hospitalEquipamentos" class="teal-text waves-effect">Equipamentos</a></li>
            <li class="tab"><a href="#hospitalEventos" class="teal-text waves-effect">Eventos</a></li>
        </ul>
        <div class="divider"></div>
        <div id="hospital1" class="col s12 container">
            <div class="row blue-grey darken-1">
                <h3>Seja Bem vindo</h3>
            </div>

        </div>

        <div id="hospitalConfig" class="col s12 scrollBarOnDiv">

            <div class="col s12">
                <ul class="collapsible">
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons"></i>
                            <span class="flow-text teal-text">Listar</span>
                            <span class="badge"></span></div>
                        <div class="collapsible-body">
                            <ul class="collapsible">
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Quartos
                                        <span class="badge"></span></div>
                                        <%@include file="quarto/table-quartos.jsp"%>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Equipamentos
                                        <span class="badge "></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Funcionarios
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons"></i>
                            <span class="flow-text teal-text">Quartos</span>
                            <span class="badge"></span>
                        </div>
                        <div class="collapsible-body">
                            <ul class="collapsible">
                                <li>
                                    <%@include file="quarto/quarto-formulario-cadastro.jsp" %>
                                </li>
                                <li>
                                    <%@include file="quarto/quarto-formulario-remover.jsp" %>
                                </li>
                                <li>
                                    <%@include file="quarto/quarto-formulario-quarentena.jsp" %>
                                </li>
                                <li>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons"></i>
                            <span class="flow-text teal-text">Alas</span>
                            <span class="badge "></span></div>
                        <div class="collapsible-body">
                            <ul class="collapsible">
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Adicinar
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Remover
                                        <span class="badge "></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Mover Quarentena
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Remover Quarentena
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons"></i>
                            <span class="flow-text teal-text">Manutenção</span>
                            <span class="badge"></span></div>
                        <div class="collapsible-body">
                            <ul class="collapsible">
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Solicitar
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        Remover
                                        <span class="badge "></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                                <li>
                                    <div class="collapsible-header">
                                        <i class="material-icons"></i>
                                        <span class="badge"></span></div>
                                    <div class="collapsible-body"></div>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>

        </div>

        <div id="hospitalEquipamentos" class="col s12 container">
            <div class="">

            </div>
        </div>
        <div id="hospitalFuncionarios" class="col s12 container">
            <div class="">

            </div>
        </div>

        <div id="hospitalEventos" class="col s12 container">
            <div class="">

            </div>
        </div>
    </div>
</div>

<jsp:include page="../model/footer.jsp"/>    


