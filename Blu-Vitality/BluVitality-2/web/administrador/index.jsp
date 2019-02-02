<%-- 
    Document   : Index
    Created on : 27/09/2018, 18:34:18
    Author     : Gus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../model/navbar.jsp" %>
<section id="tabs">
    <div class="container-fluid mt-3" >
        <h6 class="section-title h1">Tabs</h6>
        <div class="col-xs-12 ">
            <nav class="nav-pills nav-justified">
                <ul class="nav nav-tabs" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#hospitalPendencias" role="tab" aria-controls="home" aria-selected="true">Serviços</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#listapaciente" role="tab" aria-controls="profile" aria-selected="false">Usuarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#lisfuncionarios" role="tab" aria-controls="contact" aria-selected="false">Funcionarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#hospitalQuartos" role="tab" aria-controls="contact" aria-selected="false">Quartos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="financas" role="tab" aria-controls="contact" aria-selected="false">Finanças</a>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="hospitalPendencias" role="tabpanel" aria-labelledby="home-tab">
                        <button class="btn btn-primary btn-lg mt-4 my-3 addservico" style="margin-left: 90%" id="addservico">Adicionar</button>
                        <div class="row divservico">
                            <%@include file="fomularios/formulario-servicos.jsp" %>
                        </div>
                        <%@include file="table/table-ultimos-servicos.jsp" %>s
                    </div>
                    <div class="tab-pane fade" id="listapaciente" role="tabpanel" aria-labelledby="profile-tab">
                        <%@include file="table/tabela-usuarios.jsp" %>
                    </div>
                    <div class="tab-pane fade" id="lisfuncionarios" role="tabpanel" aria-labelledby="contact-tab">
                        <button class="btn btn-primary btn-lg mt-4 my-3 addfunc" style="margin-left: 90%" id="addfunc">Adicionar</button>
                        <div class="row divfunc">
                            <%@include file="fomularios/formulario-funcionario.jsp" %>
                        </div>
                        <%@include file="table/tabela-funcionarios.jsp" %>    
                    </div>
                    <div class="tab-pane fade" id="hospitalQuartos" role="tabpanel" aria-labelledby="contact-tab">...
                        <button class="btn btn-primary btn-lg mt-4 my-3 addquarto" style="margin-left: 90%" id="addquarto">Adicionar</button>
                        <div class="row divquarto">
                            <%@include file="fomularios/formulario-quarto.jsp" %>
                        </div>
                        <%@include file="table/table-quartos.jsp" %>    
                    </div>
                    <div class="tab-pane fade" id="/financas.jsp" role="tabpanel" aria-labelledby="contact-tab">
                    </div>
                </div>
            </nav>
        </div>
        <%@include file="../model/footer.jsp" %>