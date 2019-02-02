<%-- 
    Document   : collapsible
    Created on : 13/09/2018, 18:06:53
    Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)

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
                                        <!--%@include file="quarto/ListarQuartos.jsp" %-->
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
                                    <%@include file="Alas/AdicionarAla.jsp" %>
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