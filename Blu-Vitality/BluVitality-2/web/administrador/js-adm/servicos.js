/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function () {

    var tableServicos = $('#ultimos-servicos').DataTable({
        'ajax': '/servicos/obtertodosparadatatable',
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
        'columns': [
            {'data': 'nome'},
            {'data': 'tipo'},
            {'data': 'descricao'},
            {
                "data": null,
                "render": function (data) {
                    return  "<a class='finalizar-servico' href='#' data-id='" + data.id + "'><i class='material-icons'>delete</i></a>"
                }
            }
        ]
    });
    $('#ultimos-servicos').on('click', '.finalizar-servico', function () {
        $id = $(this).data("id");
        console.log($id);
        $.ajax({
            url: '/servico/excluir',
            method: 'POST',
            data: {
                id: $id
            },
            success: function (data) {
                tableServicos.ajax.reload();
            }
        });
        return false;
    });

    $('#servico-cadastro-salvar').on('click', function () {
        $.ajax({
            url: '/servicos/store',
            method: 'POST',
            data: {
                'nome': $('#servico-cadastro').val(),
                'descricao': $('#textarea2').val(),
                'tipo': $('#servico-cadastro-tipo').val()
            },
            success: function () {
                tableServicos.ajax.reload();
            }
        });
    });

    $(".divservico").hide();
    $(".addservico").on("click", function () {
        $(".divservico").show();
        $(".addservico").hide();
    });
    $(".cancelarhide").on("click", function () {
        $(".divservico").hide();
        $(".addservico").show();
    });
    
});

