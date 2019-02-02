<%-- 
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     : @Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 @Rafael Alipio Harada (rafhaharada@gmail.com)

--%>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>Opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="/usuario/logout" onclick="signOut();">Sair</a></li>
        <li><a href="/funcionario">Voltar a página anterior</a></li>

    </ul>
</li>
<%@include file="../model/headerEnd.jsp" %>

<div class="row">
    <ul class="tabs tabs-transparent center">
        <li class="tab"><a href="#Funcionarios10" class="active teal-text">Dados Pessoais</a></li>
        <li class="tab"><a href="#Funcionarios6" class="teal-text">Prontuário Eletrônico</a></li>
        <li class="tab"><a href="#Funcionarios7" class="teal-text">Anamnese</a></li>
        <li class="tab"><a href="#Funcionarios8" class="teal-text">Histórico Clínico</a></li>
    </ul>
    <%@include file="../model/tabsCargos/paciente.jsp" %>
    <div id="Funcionarios6" class="col s12 container">  
        <div class="row" >
            <form class="col s12">
                 <div class="row">
                    <div class="input-field col s6">
                        <input id="first_name" type="text" class="validate">
                        <label for="first_name">Médico</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="last_name" type="text" class="validate">
                        <label for="last_name">Especialidade</label>
                    </div>
                </div>
                <div class="row">                  
                    <div class="input-field col s6">
                        <input id="first_name" type="text" class="validate">
                        <label for="first_name">Motivo</label>
                    </div>
                    <div class="input-field col s6">
                        <input id="last_name" type="text" class="validate">
                        <label for="last_name">Data</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="password" type="password" class="validate">
                        <label for="password">Medicamentos</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="email" type="email" class="validate">
                        <label for="email">Recomendações</label>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
<div id="Funcionarios7" class="col s12 container">   
</div>
<div id="Funcionarios8" class="col s12 container">
    <table class="striped teal lighten-4">
        <thead>
            <tr>
                <th>Descrição</th>
                <th>Médico | Especialidade</th>
                <th>Data</th>
                <th>Horário</th>
                <th>Status</th>
            </tr>
        </thead>

        <tbody>
            <tr>
                <td>Alvin</td>
                <td>Eclair</td>
                <td>$0.87</td>
                <td>$0.87</td>
                <td>$0.87</td>
            </tr>
            <tr>
                <td>Alan</td>
                <td>Jellybean</td>
                <td>$3.76</td>
                <td>$3.76</td>
                <td>$3.76</td>
            </tr>
            <tr>
                <td>Jonathan</td>
                <td>Lollipop</td>
                <td>$7.00</td>
                <td>$7.00</td>
                <td>$7.00</td>
            </tr>
        </tbody>
    </table>                                   
</div>
</div>            
<jsp:include page="../model/footer.jsp"/>