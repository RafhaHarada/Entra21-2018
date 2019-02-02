
//Tabela Prontuário
$(document).ready(function () {
    $(".prontuarioResultado").hide();
    $(".botaoBuscar").on("click", function () {
        $(".prontuarioResultado").show();
        $(".prontuarioBusca").hide();
    });
    $(".botaoVoltar").on("click", function () {
        $(".prontuarioBusca").show();
        $(".prontuarioResultado").hide();
    });
    $('input.autocomplete').autocomplete({
        'ajax': {
            url: '/ObterTodosPara/AutoComplete',
            dataType: 'Json',
            results: [
                {
                    'data': 1,
                }
            ]

        }

    });
});
