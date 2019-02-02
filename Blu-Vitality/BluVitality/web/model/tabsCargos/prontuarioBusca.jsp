<%-- 
    Document   : prontuarioBusca
    Created on : 20/09/2018, 08:14:11
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 Rafael Alipio Harada (rafhaharada@gmail.com)
--%>

<div id="Funcionarios2" class="scrollBarOnDiv">
    <div class="prontuarioBusca container">
        <form  action="/funcionario/prontuario" method="GET">
            <div class="col s12">
                <div class="row">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">textsms</i>
                        <input type="text" id="nomePaciente" class="autocomplete" name="nomePaciente">
                        <label for="nomePaciente">Nome</label>
                    </div>
                </div>
            </div>
            <input type="submit" class="btn col s4" value="Buscar Prontuário">
        </form>
    </div>
</div> 