/*
Enunciado:

6. A padaria do joão necessita armazenar os pedidos dos seus clientes, cada cliente
poderá realizar quantos pedidos desejar, porém para que o cliente possa solicitar
estes produtos o cardápio deve ser apresentado para ele.
Ao final de o cliente solicitar os produtos, deve-se apresentar o total dos pedidos e a
quantidade de produtos consumidos.
O critério para que não seja mais solicitado o código do produto ao cliente é se o mesmo
informar o código 16.
Código-Tipo-Nome-Valor
1-Bolos-Bolo Brigadeiro--R$ 29,50
2-Bolos-Bolo Floresta Negra--R$ 2,00
3-Bolos-Bolo Leite com Nutella--R$ 29,23
4-Bolos-Bolo Mousse de Chocolate--R$ 7,10
5-Bolos-Bolo Nega Maluca--R$ 19,33
6-Doces-Bomba de Creme--R$ 17,71
7-Doces-Bomba de Morango--R$ 4,82
8-Sanduíches-Filé-Mignon com fritas e cheddar--R$ 21,16
9-Sanduíches-Hambúrguer com queijos, champignon e rúcula--R$ 12,70
10-Sanduíches-Provolone com salame--R$ 19,70
11-Sanduíches-Vegetariano de berinjela--R$ 28,22
12-Pizzas-Calabresa--R$ 8,98
13-Pizzas-Napolitana--R$ 0,42
14-Pizzas-Peruana--R$ 18,36
15-Pizzas-Portuguesa--R$ 27,50
16-Sair

Ao final apresentar:
● A quantidade de bolos escolhidos;
● A quantidade de doces escolhidos;
● A quantidade de Sanduíches escolhidos;
● A quantidade de pizzas escolhidas;
● A média dos produtos;

*/


import javax.swing.JOptionPane;

public class Exercicio6{

    public static void main(String[] args){

        int quantidadeBolos = 0, quantidadeDoces = 0, 
        quantidadeSanduiches = 0, quantidadePizzas = 0, media = 0;
        double total = 0;

        int pedido = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Escolha as opções de compra abaixo:\n" +
            "\nCódigo-Tipo-Nome-Valor" +
            "\n1-Bolos-Bolo Brigadeiro--R$ 29,50" +
            "\n2-Bolos-Bolo Floresta Negra--R$ 2,00" +
            "\n3-Bolos-Bolo Leite com Nutella--R$ 29,23" +
            "\n4-Bolos-Bolo Mousse de Chocolate--R$ 7,10" +
            "\n5-Bolos-Bolo Nega Maluca--R$ 19,33" +
            "\n6-Doces-Bomba de Creme--R$ 17,71" +
            "\n7-Doces-Bomba de Morango--R$ 4,82" +
            "\n8-Sanduíches-Filé-Mignon com fritas e cheddar--R$ 21,16" +
            "\n9-Sanduíches-Hambúrguer com queijos, champignon e rúcula--R$ 12,70" +
            "\n10-Sanduíches-Provolone com salame--R$ 19,70" +
            "\n11-Sanduíches-Vegetariano de berinjela--R$ 28,22" +
            "\n12-Pizzas-Calabresa--R$ 8,98" +
            "\n13-Pizzas-Napolitana--R$ 0,42" +
            "\n14-Pizzas-Peruana--R$ 18,36" +
            "\n15-Pizzas-Portuguesa--R$ 27,50" +
            "\n16-Sair",
            "Pedidos",
            JOptionPane.QUESTION_MESSAGE
        ));

        while(pedido != 16){
            if(pedido == 1){
                quantidadeBolos = quantidadeBolos + 1; 
                media = media + 1;
                total = total + 29.50;
            }
            else if(pedido == 2){
                quantidadeBolos = quantidadeBolos + 1; 
                media = media + 1;
                total = total + 2.00;
            }
            else if(pedido == 3){
                quantidadeBolos = quantidadeBolos + 1; 
                media = media + 1;
                total = total + 29.23;
            }
            else if(pedido == 4){
                quantidadeBolos = quantidadeBolos + 1; 
                media = media + 1;
                total = total + 7.10;
            }
            else if(pedido == 5){
                quantidadeBolos = quantidadeBolos + 1; 
                media = media + 1;
                total = total + 19.33;
            }
            else if(pedido == 6){
                quantidadeDoces = quantidadeDoces + 1; 
                media = media + 1;
                total = total + 17.71;
            }
            else if(pedido == 7){
                quantidadeDoces = quantidadeDoces + 1; 
                media = media + 1;
                total = total + 4.82;
            }
            else if(pedido == 8){
                quantidadeSanduiches = quantidadeSanduiches + 1; 
                media = media + 1;
                total = total + 21.16;
            }
            else if(pedido == 9){
                quantidadeSanduiches = quantidadeSanduiches + 1; 
                media = media + 1;
                total = total + 12.70;
            }
            else if(pedido == 10){
                quantidadeSanduiches = quantidadeSanduiches + 1; 
                media = media + 1;
                total = total + 19.70;
            }
            else if(pedido == 11){
                quantidadeSanduiches = quantidadeSanduiches + 1; 
                media = media + 1;
                total = total + 28.22;
            }
            else if(pedido == 12){
                quantidadePizzas= quantidadePizzas + 1; 
                media = media + 1;
                total = total + 8.98;
            }
            else if(pedido == 13){
                quantidadePizzas= quantidadePizzas + 1; 
                media = media + 1;
                total = total + 0.42;
            }
            else if(pedido == 14){
                quantidadePizzas= quantidadePizzas + 1; 
                media = media + 1;
                total = total + 18.36;
            }
            else if(pedido == 15){
                quantidadePizzas = quantidadePizzas + 1; 
                media = media + 1;
                total = total + 27.50;
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro de entrada.\n" + 
                "Escolha opções disponíveis no menu.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            pedido = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Escolha as opções de compra abaixo:\n" +
                "\nCódigo-Tipo-Nome-Valor" +
                "\n1-Bolos-Bolo Brigadeiro--R$ 29,50" +
                "\n2-Bolos-Bolo Floresta Negra--R$ 2,00" +
                "\n3-Bolos-Bolo Leite com Nutella--R$ 29,23" +
                "\n4-Bolos-Bolo Mousse de Chocolate--R$ 7,10" +
                "\n5-Bolos-Bolo Nega Maluca--R$ 19,33" +
                "\n6-Doces-Bomba de Creme--R$ 17,71" +
                "\n7-Doces-Bomba de Morango--R$ 4,82" +
                "\n8-Sanduíches-Filé-Mignon com fritas e cheddar--R$ 21,16" +
                "\n9-Sanduíches-Hambúrguer com queijos, champignon e rúcula--R$ 12,70" +
                "\n10-Sanduíches-Provolone com salame--R$ 19,70" +
                "\n11-Sanduíches-Vegetariano de berinjela--R$ 28,22" +
                "\n12-Pizzas-Calabresa--R$ 8,98" +
                "\n13-Pizzas-Napolitana--R$ 0,42" +
                "\n14-Pizzas-Peruana--R$ 18,36" +
                "\n15-Pizzas-Portuguesa--R$ 27,50" +
                "\n16-Sair" +
                "\n\nTotal Atual: R$ " + String.format("%.2f",total),
                "Pedidos",
                JOptionPane.QUESTION_MESSAGE
            ));
        }

        JOptionPane.showMessageDialog(null, 
            "Você pediu: \n\n" +
            quantidadeBolos + " Bolo(s).\n" + 
            quantidadeDoces + " Doce(s).\n" + 
            quantidadeSanduiches + " Sanduíche(s).\n" + 
            quantidadePizzas + " Pizza(s).\n" +
            "Você pediu no total: " + media + " produtos.\n" +
            "Você pagará em média: R$" + String.format("%.2f",(total/media)) + "/produto.\n" +
            "Total da conta: R$" + String.format("%.2f.", total),
            "Conta", 
            JOptionPane.INFORMATION_MESSAGE);

    }
}