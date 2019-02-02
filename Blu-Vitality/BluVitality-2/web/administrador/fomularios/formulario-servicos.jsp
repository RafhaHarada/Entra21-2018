<%-- 
    Document   : formulario-pendencias
    Created on : 17/09/2018, 03:27:41
    Author     : Gus
--%>



<form id="validateServicos">
    <div class="row ml-1">
        <label for="servico-cadastro">Nome serviço:</label>
        <input type="text" class="form-control form-control-lg is-valid" id="servico-cadastro" required="">
        <label for="textarea2">Descrição</label>
        <textarea id="textarea2" class="form-control form-control-lg is-valid" required></textarea>
        <label for="servico-cadastro-tipo">Status</label>
        <select class="form-control form-control-lg is-valid" id="servico-cadastro-tipo" required="">
            <option value=""></option>
            <option value="Urgente">Urgente</option>
            <option value="Semi - Urgente">Semi - Urgente</option>
            <option value="Não Urgente">Não Urgente</option>
        </select>
    </div>
    <button class="btn btn-primary mt-4 my-3" type="submit" id="servico-cadastro-salvar">Salvar</button>
    <button class="btn btn-primary mt-4 my-3 cancelarhide" id="servico-cadastro-cancelar">Cancelar</button>
</form>
