<%-- 
    Document   : AdicionarAla
    Created on : 13/09/2018, 18:15:15
    Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
--%>

<div class="collapsible-header">
    <i class="material-icons"></i>
    Adicinar
    <span class="badge"></span>
</div>
<div class="collapsible-body">
    <form action="/ala/store" method="post">
        <div class="form-group">

            <label for="campo-categoria"><i class="material-icons"></i> Alas</label>
            <input class="form-control" type="text" id="campo-ala" name="ala" required="required" onfocusout="validacao()">
        </div>
        <button class="btn waves-effect waves-light ld ld-bounce" type="submit" name="action">Submit
            <i class="material-icons right">send</i>
        </button>
    </form>
</div>