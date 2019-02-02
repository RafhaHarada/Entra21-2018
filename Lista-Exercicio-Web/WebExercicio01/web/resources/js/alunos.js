/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $('#myTable').DataTable();
} );

/* 
 */
function validarFormulario(){
    if(validarCampoNome() === false || 
        validarCampoMatricula() === false ||
        validarCampoNota1() === false ||
        validarCampoNota2() === false ||
        validarCampoNota3() === false ||
        validarCampoFrequencia() === false){
        event.preventDefault();
    }
}

function validarCampoNome(){
    var nome = document.getElementById("campo-nome").value;
    var matriculaCaracteres = nome.length;
    
    apagarElementoSeExiste("span-campo-nome-maior-7");
    apagarElementoSeExiste("span-campo-nome-maior-100");
    
    if(matriculaCaracteres < 7){
        gerarSpan(
            "span-campo-nome-maior-7",
            "Nome deve conter no mínimo 7 caracteres",
            "div-campo-nome");
        adicionarClasse("campo-nome","border-danger");
        apagarClasse("campo-nome","border-sucess");
        return false;
    }
    else if(matriculaCaracteres > 100){
        gerarSpan(
            "span-campo-nome-maior-100",
            "Nome deve conter no máximo 100 caracteres",
            "div-campo-nome");
        adicionarClasse("campo-nome","border-danger");
        apagarClasse("campo-nome","border-success");
        return false;
    }
    else{
        adicionarClasse("campo-nome","border-success");
        apagarClasse("campo-nome","border-danger");
        return true;
    }
}

function validarCampoMatricula(){
    var matricula = document.getElementById("campo-matricula").value;
    var matriculaCaracteres = matricula.length;
    
    apagarElementoSeExiste("span-campo-matricula-maior-7");
    apagarElementoSeExiste("span-campo-matricula-maior-100");
    
    if(matriculaCaracteres < 7){
        gerarSpan(
            "span-campo-matricula-maior-7",
            "Matricula deve conter no mínimo 7 caracteres",
            "div-campo-matricula");
        adicionarClasse("campo-matricula","border-danger");
        apagarClasse("campo-matricula","border-sucess");
        return false;
    }
    else if(matriculaCaracteres > 100){
        gerarSpan(
            "span-campo-matricula-maior-100",
            "Matricula deve conter no máximo 100 caracteres",
            "div-campo-matricula");
        adicionarClasse("campo-matricula","border-danger");
        apagarClasse("campo-matricula","border-success");
        return false;
    }
    else{
        adicionarClasse("campo-matricula","border-success");
        apagarClasse("campo-matricula","border-danger");
        return true;
    }
}

function validarCampoNota1(){
    var nota1 = parseFloat(document.getElementById("campo-nota1").value);
    apagarElementoSeExiste("span-campo-nota1-menor-zero");

    if(nota1 < 0){
        gerarSpan(
                "span-campo-nota1-menor-zero", 
                "Nota 1 deve ser positivo",
                "div-campo-nota1");
        apagarClasse("campo-nota1","border-success");
        adicionarClasse("campo-nota1","border-danger");
        return false;
    }
    else if(nota1 === null){
        gerarSpan(
                "span-campo-nota1-menor-zero", 
                "Nota 1 deve ser positivo",
                "div-campo-nota2");
        apagarClasse("campo-nota1","border-success");
        adicionarClasse("campo-nota1","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-nota1","border-danger");
        adicionarClasse("campo-nota1","border-success");
        return true;
    }
}

function validarCampoNota2(){
    var nota2 = parseFloat(document.getElementById("campo-nota2").value);
    apagarElementoSeExiste("span-campo-nota2-menor-zero");

    if(nota2 < 0){
        gerarSpan(
                "span-campo-nota2-menor-zero", 
                "Nota 2 deve ser positivo",
                "div-campo-nota2");
        apagarClasse("campo-nota2","border-success");
        adicionarClasse("campo-nota2","border-danger");
        return false;
    }
    else if(nota2 === null){
        gerarSpan(
                "span-campo-nota2-menor-zero", 
                "Nota 2 deve ser positivo",
                "div-campo-nota2");
        apagarClasse("campo-nota2","border-success");
        adicionarClasse("campo-nota2","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-nota2","border-danger");
        adicionarClasse("campo-nota2","border-success");
        return true;
    }
}

function validarCampoNota3(){
    var nota3 = parseFloat(document.getElementById("campo-nota3").value);
    apagarElementoSeExiste("span-campo-nota3-menor-zero");

    if(nota3 < 0){
        gerarSpan(
                "span-campo-nota3-menor-zero", 
                "Nota 3 deve ser positivo",
                "div-campo-nota3");
        apagarClasse("campo-nota3","border-success");
        adicionarClasse("campo-nota3","border-danger");
        return false;
    }
    else if(nota3 === null){
        gerarSpan(
                "span-campo-nota3-menor-zero", 
                "Nota 3 deve ser positivo",
                "div-campo-nota3");
        apagarClasse("campo-nota3","border-success");
        adicionarClasse("campo-nota3","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-nota3","border-danger");
        adicionarClasse("campo-nota3","border-success");
        return true;
    }
}

function validarCampoFrequencia(){
    var frequencia = parseInt(document.getElementById("campo-frequencia").value);
    apagarElementoSeExiste("span-campo-frequencia-menor-zero");

    if(frequencia < 0){
        gerarSpan(
                "span-campo-frequencia-menor-zero", 
                "Frequencia deve ser positivo",
                "div-campo-frequencia");
        apagarClasse("campo-frequencia","border-success");
        adicionarClasse("campo-frequencia","border-danger");
        return false;
    }
    else if(frequencia === null){
        gerarSpan(
                "span-campo-frequencia-menor-zero", 
                "Frequencia deve ser positivo",
                "div-campo-frequencia");
        apagarClasse("campo-frequencia","border-success");
        adicionarClasse("campo-frequencia","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-frequencia","border-danger");
        adicionarClasse("campo-frequencia","border-success");
        return true;
    }
}

function apagarClasse(id, classeCor){
    document.getElementById(id).classList.remove(classeCor);
}

function adicionarClasse(id, classeCor){
    document.getElementById(id).classList.add(classeCor);
}

function apagarElementoSeExiste(id){
    if(document.contains(document.getElementById(id))){
        document.getElementById(id).remove();
    }
}

function gerarSpan(id, texto, idPai){
    var span = document.createElement("span");
        span.id = id;
        span.textContent = texto;
        span.classList.add("text-danger");
        span.classList.add("font-weight-bold");
        document.getElementById(idPai).appendChild(span);
}