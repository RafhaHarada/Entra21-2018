/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function () {
     
    var tableUsuario = $('#tabela-usuario').DataTable({
        'ajax': '/usuarios/obtertodosparadatatable',
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
            {'data': 'cpf'},
            {'data': 'telefone'},
            {
                "data": null,
                "render": function (data) {
                    return  "<a class='excluir-usuario' href='#' data-id='" + data.id + "'><i class='material-icons'>delete</i></a>";
                }
            }
        ]
    });
    $('#tabela-usuario').on('click', '.excluir-usuario', function () {
        $id = $(this).data("id");
        console.log($id);
        $.ajax({
            url: '/usuario/excluir',
            method: 'POST',
            data: {
                id: $id
            },
            success: function (data) {
                tableUsuario.ajax.reload();
            }
        });
        return false;
    });
});