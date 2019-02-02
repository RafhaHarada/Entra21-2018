<%-- 
    Document   : login
    Created on : 29/08/2018, 23:52:42
    Author     : @Rafael Alipio Harada (rafhaharada@gmail.com)
--%>

<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownLogin'>Opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownLogin' class='dropdown-content'>
        <li><a href="../">Voltar a página inicial</a></li>
    </ul>
</li>
<jsp:include page="../model/headerEndNoSidenav.jsp"/>
<%
    String clientUrl = request.getRequestURL().toString();
    if (clientUrl.contains("msg=1")) {
%>
<script type="text/javascript">
    var $conteudo = $('<span class="red-text">Usuário ou senha incorreta!</span>')
    Materialize.toast($conteudo,6000,'rounded');
</script>
<%
    }
%>
<div class="container">
    <div class="col s10 m8 center">
        <h4 class="row">Login</h4>
        <div class="row">
            <form action="/usuario/autentication" method="post" class="col s12">
                <div class="row">
                    <!--div class="g-signin2 waves-effect white-text" data-onsuccess="onSignIn"></div-->
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input required id="login_usuario" name="login" type="text" class="validate" minlength="5">
                        <label for="login_usuario">Login</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input required id="senha_usuario" name="senha" type="password" class="validate">
                        <label for="senha_usuario">Senha</label>
                    </div>
                </div>
                <input type="submit" class="waves-effect btn-flat teal white-text validate" value="Entrar">
            </form>
            <div class="col s6 right">
                <a href="/usuario/cadastro">Não tem conta?</a>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../model/footer.jsp"/>