<%-- 
    Document   : politica-privacidade
    Created on : 01/10/2018, 09:18:09
    Author     : Luana
--%>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>Op��es</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="/usuario/logout" onclick="signOut();">Sair</a></li>
    </ul>
</li>
<%@include file="../model/headerEndNoSidenav.jsp" %>

    <div class="valign-wrapper">
        <h5>Pol�tica de privacidade</h5>

        <h5>O Blu  Vitality Hospital  � o �nico propriet�rio 
            das informa��es coletadas neste portal. Recolhemos 
            informa��es sobre nossos usu�rios (nomes, e-mails, n�meros 
            de telefone, por exemplo) em diferentes p�ginas deste site. N�o 
            iremos vender, compartilhar, alugar, nem divulgar tais informa��es.</h5>
    </div>
    
<jsp:include page="../model/footer.jsp"/>
