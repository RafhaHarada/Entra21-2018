/* 
 */
function validarFormulario(){
    if(validarCampoNome() == false || 
        validarCampoQuantidade() == false ||
        validarCampoPreco() == false){
        event.preventDefault();
    }
}

function validarCampoNome(){
    var nome = document.getElementById("campo-nome").value;
    var quantidadeCaracteres = nome.length;
    
    apagarElementoSeExiste("span-campo-nome-maior-7");
    apagarElementoSeExiste("span-campo-nome-maior-100");
    
    if(quantidadeCaracteres < 7){
        gerarSpan(
            "span-campo-nome-maior-7",
            "Nome deve conter no mínimo 7 caracteres",
            "div-campo-nome");
        adicionarClasse("campo-nome","border-danger");
        apagarClasse("campo-nome","border-sucess");
        return false;
    }
    else if(quantidadeCaracteres > 100){
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

function validarCampoQuantidade(){
    var quantidade = parseInt(document.getElementById("campo-quantidade").value);
    apagarElementoSeExiste("span-campo-quantidade-menor-zero");

    if(quantidade <= 0){
        gerarSpan(
                "span-campo-quantidade-menor-zero", 
                "Quantidade deve ser positiva",
                "div-campo-quantidade");
        apagarClasse("campo-quantidade","border-success");
        adicionarClasse("campo-quantidade","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-quantidade","border-danger");
        adicionarClasse("campo-quantidade","border-success");
        return true;
    }
}

function validarCampoPreco(){
    var preco = parseFloat(document.getElementById("campo-preco").value);
    apagarElementoSeExiste("span-campo-preco-menor-zero");

    if(preco <= 0){
        gerarSpan(
                "span-campo-preco-menor-zero", 
                "Preço deve ser positivo",
                "div-campo-preco");
        apagarClasse("campo-preco","border-success");
        adicionarClasse("campo-preco","border-danger");
        return false;
    }
    else{
        apagarClasse("campo-preco","border-danger");
        adicionarClasse("campo-preco","border-success");
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