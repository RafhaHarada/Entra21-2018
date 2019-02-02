/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Cadastro
function validacaoTipoArquivo() {
    var fileName = document.getElementById("cadastro-foto").value;
    var idxDot = fileName.lastIndexOf(".") + 1;
    var extFile = fileName.substr(idxDot, fileName.length).toLowerCase();
    if (extFile === "jpg" || extFile === "jpeg" || extFile === "png") {
        //TO DO
    } else {
        M.toast({html: 'Insira apenas imagens de extensão jpg, jpeg ou png'});
        document.getElementById("cadastro-foto").value = "";
    }
}

function validacaoEmBranco(id) {
    var emBranco = document.getElementById(id).value;
    var campo = id.replace("cadastro-","").replace("-"," ");
    if (emBranco === "") {
        M.toast({html: '<span class="red-text">O campo ' + campo + ' nao pode estar vazio<span>',inDuration: 2000,classes: 'rounded'});
        return true;
    } else {
        return false;
    }
}

function validarCampos(){
    if(validacaoEmBranco('cadastro-login')){
        return;
    };
    if(validacaoEmBranco('cadastro-senha')){
        return;
    };
    if(validacaoEmBranco('cadastro-nome-completo')){
        return;
    };
    if(validacaoEmBranco('cadastro-data-nascimento')){
        return;
    };
    if(validacaoEmBranco('cadastro-sexo')){
        return;
    };
    if(validacaoEmBranco('cadastro-estado-civil')){
        return;
    };
    if(validacaoEmBranco('cadastro-tipo-sanguineo')){
        return;
    };
    if(validacaoEmBranco('cadastro-cpf')){
        return;
    };
    if(validacaoEmBranco('cadastro-rg')){
        return;
    };
    if(validacaoEmBranco('cadastro-email')){
        return;
    };
    if(validacaoEmBranco('cadastro-telefone')){
        return;
    };
    if(validacaoEmBranco('cadastro-contato-emergencia')){
        return;
    };
    if(validacaoEmBranco('cadastro-endereco')){
        return;
    };
    if(validacaoEmBranco('cadastro-cidade')){
        return;
    };
    if(validacaoEmBranco('cadastro-naturalidade')){
        return;
    };
    if(validacaoEmBranco('cadastro-uf')){
        return;
    };
    if(validacaoEmBranco('cadastro-complemento')){
        return;
    };
}

$(document).ready(function(){
    $('#cadastro-uf').mask('AA');
    $('#cadastro-naturalidade').mask('AA');
    $('#cadastro-contato-emergencia').mask('(00)0 0000-0000');
    $('#cadastro-telefone').mask('(00)0 0000-0000');
    $('#cadastro-cpf').mask('000.000.000-00');
});

function atualizaTab() {
    var maxHeight = 0;
    $('.carousel-item').each(function () {
        if ($(this).height() > maxHeight)
            maxHeight = $(this).height();
    });
    $(".tabs-content").css('height', maxHeight + 'px');
}

$(function () {
    $(".agendarE").hide();
    $(".agendarC").hide();

    $(".exameRadio").on("click", function () {
        $(".agendarE").show();
        $(".agendarC").hide();
        atualizaTab();
        document.getElementById("exame-cadastro-tipo").value = "Exame";
        document.getElementById("consulta-cadastro-id-usuario").value = "";
        document.getElementById("consulta-cadastro-id-funcionario").value = "";
        document.getElementById("consulta-cadastro-nome").value = "";
        document.getElementById("consulta-cadastro-tipo").value = "";
        document.getElementById("consulta-cadastro-data").value = "";
        document.getElementById("consulta-cadastro-hora").value = "";
    });

    $(".consultaRadio").on("click", function () {
        $(".agendarC").show();
        $(".agendarE").hide();
        atualizaTab();
        document.getElementById("consulta-cadastro-tipo").value = "Consulta";
        document.getElementById("exame-cadastro-id-usuario").value = "";
        document.getElementById("exame-cadastro-id-funcionario").value = "";
        document.getElementById("exame-cadastro-nome").value = "";
        document.getElementById("exame-cadastro-tipo").value = "";
        document.getElementById("exame-cadastro-data").value = "";
        document.getElementById("exame-cadastro-hora").value = "";
    });

    $('#exame-cadastro-convenio').on('click', function () {
    });
    
});