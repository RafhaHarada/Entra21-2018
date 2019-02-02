 
$(function () {

    var tableQuarto = $('#quarto-index').DataTable({
        "ajax": "/quarto/obtertodosparadatatable",
        "language": {
            "sEmptyTable": "Nenhum registro encontrado",
            "sInfo": "Mostrando de _START_ até _END_ de _TOTAL_ registros",
            "sInfoEmpty": "Mostrando 0 até 0 de 0 registros",
            "sInfoFiltered": "(Filtrados de _MAX_ registros)",
            "sInfoPostFix": "",
            "sInfoThousands": ".",
            "sLengthMenu": "_MENU_ resultados por página",
            "sLoadingRecords": "Carregando...",
            "sProcessing": "Processando...",
            "sZeroRecords": "Nenhum registro encontrado",
            "sSearch": "Pesquisar",
            "oPaginate": {
                "sNext": "Próximo",
                "sPrevious": "Anterior",
                "sFirst": "Primeiro",
                "sLast": "Último"
            },
            "oAria": {
                "sSortAscending": ": Ordenar colunas de forma ascendente",
                "sSortDescending": ": Ordenar colunas de forma descendente"
            },
            "select": {
                "rows": {
                    "_": "Selecionado %d linhas",
                    "0": "Nenhuma linha selecionada",
                    "1": "Selecionado 1 linha"
                }
            }
        },
        "columns": [
            {"data": "id"},
            {"data": "numero_quarto"},
            {"data": "tipo"},
            {
                "data": null,
                "render": function (data) {
                    return  "<a href='/quarto/excluir?id=" + data.id + "'><i class='material-icons'>edit</i></a>\
                    <a class='excluirtest' href='#' data-id='" + data.id + "'><i class='material-icons'>delete</i></a>"
                    //caminho do icone para editar na coluna funcionario
                }
            }

        ]
    });


    $('#quarto-index').on('click', '.excluirtest', function () {
        $id = $(this).data("id");
        console.log($id);
        $.ajax({
            url: '/quarto/excluir',
            method: 'POST',
            data: {
                id: $id
            },
            success: function (data) {
                tableQuarto.ajax.reload();
            }
        });
        return false;
    });
    
    $('#quarto-cadastro-salvar').on('click', function () {
        $.ajax({
            url: '/quarto/store',
            method: 'POST',
            data: {
                'numeroQuarto': $('#quarto-cadastro-numero-quarto').val(),
                'tipo': $('#quarto-cadastro-tipo').val()
            },
            success: function () {
                tableQuarto.ajax.reload();
            }
        });
    });
    
    $(".divquarto").hide();
    $(".addquarto").on("click", function () {
        $(".divquarto").show();
        $(".addquarto").hide();
    });
    $(".cancelarhide").on("click", function () {
        $(".divquarto").hide();
        $(".addquarto").show();
    });
    
});