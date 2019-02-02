<%-- 
    Document   : formulario-quarto
    Created on : 29/09/2018, 11:08:51
    Author     : Gus
--%>


<form id="validateQuarto">
    <label for="numero">Numero do Quarto:</label>
    <input class="form-control" type="number" name="numero_quarto" id="quarto-cadastro-numero-quarto" required="required">
    <label>Tipo:</label>
    <select class="form-control" id="quarto-cadastro-tipo" name="tipo">
        <option value="results"></option>
        <option value="UTI">UTI</option>
        <option value="Semi - Intensivo">Semi - Intensivo</option>
        <option value="Sala de Cirurgia"> Sala de Cirurgia</option>
        <option value="Leito">Leito</option>
        <option value="Consultorio">Consultorio</option>
        <option value="Sala de recuperação">Sala de recuperação</option>
    </select>
    <button class="btn btn-primary mt-4 my-3" id="quarto-cadastro-salvar">Salvar</button>
</form>
