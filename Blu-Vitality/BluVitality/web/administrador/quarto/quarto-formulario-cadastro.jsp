
<form action="/quarto/adicionar" id="validateQuarto">
    <label for="quarto-cadastro-numero-quarto">Numero do Quarto:</label>
    <input type="number" name="numero_quarto" id="quarto-cadastro-numero-quarto" required="required">
    <label>Tipo:</label>
    <select class="browser-default" id="quarto-cadastro-tipo" name="tipo">
        <option value="results"></option>
        <option value="UTI">UTI</option>
        <option value="Semi - Intensivo">Semi - Intensivo</option>
        <option value="Sala de Cirurgia"> Sala de Cirurgia</option>
        <option value="Leito">Leito</option>
        <option value="Consultorio">Consultorio</option>
        <option value="Sala de recuperação">Sala de recuperação</option>
    </select>
    <a class="waves-effect  btn-small" id="quarto-cadastro-salvar">SALVAR</a>
</form>
<script type="text/javascript">
    $(document).ready(function () {
        $('#serviso-cadastro').mask('0000');

    });
</script>