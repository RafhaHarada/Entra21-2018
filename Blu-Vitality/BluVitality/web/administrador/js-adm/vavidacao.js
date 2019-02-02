/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    $('#validateServicos').validate({
        errorClass: "red-text",

        errorElementClass: 'red-text ',
        validElementClass: 'red-text ',
        	validClass: "teal-text ",
        rules: {
            servicocadastro: {
                required: true,
                minlength: 4,
                maxlength: 10
            },

            servicocadastrotipo: "required",
            textarea2: {
                required: true,
                minlength: 15,
            },
            //Mensagens
            messages: {
                servicocadastro: {
                    required: 'Nome é obrigatório',
                    minlength: 'Nome deve conter no mínimo 2 caracteres',
                },

                textarea2: {
                    required: 'Descrição deve ser preenchida',
                    minlength: 'Minimo 10 caracteres',
                }
            }
        }
    });
    $("#validateServicos").on('submit', function(e){

    		if($("#validateServicos").valid() == false){
				e.preventDefault();
    		}else{
    			alert('asdaspdas');
    		}
    	});
});