<%-- 
    Document   : politica-privacidade
    Created on : 01/10/2018, 09:18:09
    Author     : Luana
--%>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>Opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="/usuario/logout" onclick="signOut();">Sair</a></li>
    </ul>
</li>
<%@include file="../model/headerEndNoSidenav.jsp" %>

    <div class="valign-wrapper">
        <h5>Política de privacidade</h5>

        <h5>O Blu  Vitality Hospital  é o único proprietário 
            das informações coletadas neste portal. Recolhemos 
            informações sobre nossos usuários (nomes, e-mails, números 
            de telefone, por exemplo) em diferentes páginas deste site. Não 
            iremos vender, compartilhar, alugar, nem divulgar tais informações.</h5>
    </div>
    
<jsp:include page="../model/footer.jsp"/>
