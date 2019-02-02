<%-- 
    Document   : formulario-funcionario
    Created on : 29/09/2018, 11:09:02
    Author     : Gus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<form>
    <div class="row ml-1">
        <label for="funcionario-cadastro">Nome:</label>
        <input type="text" class="form-control form-control-lg is-valid" id="funcionario-cadastro" required="">
        <label for="funcionario-cadastro">Status</label>
        <select class="form-control form-control-lg is-valid" id="funcionario-cadastro" required="">
            <option value=""></option>
            <option value="Médico">Médico</option>
            <option value="Enfermeiro">Enfermeiro</option>
            <option value="Radiologista">Radiologista</option>
            <option value="Auxiliar">Serviço Gerais</option>
            <option value="Recepcionista">Recepcionista</option>
        </select>
    </div>
    <button class="btn btn-primary mt-4 my-3" type="submit" id="funcionario-salvar">Salvar</button>
    <button class="btn btn-primary mt-4 my-3 funcionariocancelar" id="funcionario-cancelar">Cancelar</button>
</form>