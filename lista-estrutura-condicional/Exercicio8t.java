/*Enunciado

8. A padaria do joão necessita armazenar os pedidos dos seus clientes, cada cliente
pedirá três produtos do cardápio, porem para que o cliente possa solicitar estes
produtos o cardápio deve ser apresentado para ele. Ao final de o cliente solicitar os
produtos, deve-se apresentar o nome dos produtos com seus valores e um
totalizador.

1   Tipo        Nome                                            Valor
2   Bolos       Bolo Brigadeiro                                 R$ 29,50
3   Bolos       Bolo Floresta Negra                             R$ 2,00
4   Bolos       Bolo Leite com Nutella                          R$ 29,23
5   Bolos       Bolo Mousse de Chocolate                        R$ 7,10
6   Bolos       Bolo Nega Maluca                                R$ 19,33
7   Doces       Bomba de Creme                                  R$ 17,71
8   Doces       Bomba de Morango                                R$ 4,82
9   Sanduiches  File-Mignon com fritas e cheddar                R$ 21,16
10  Sanduiches  Hamburguer com queijos, champignon e rucula     R$ 12,70
11  Sanduiches  Provolone com salame                            R$ 19,70
12  Sanduiches  Vegetariano de berinjela                        R$ 28,22
13  Pizzas      Calabresa                                       R$ 8,98
14  Pizzas      Napolitana                                      R$ 0,42
15  Pizzas      Peruana                                         R$ 18,36
16  Pizzas      Portuguesa                                      R$ 27,50

*/

import javax.swing.JOptionPane;

public class Exercicio8t{

    public static void main(String[] args){
        
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um item: \n\n" +
            "item-----Tipo-------------Nome--------------------------------------------------------------Valor\n"+
            "1---------Bolos-----------Bolo Brigadeiro-------------------------------------------------R$ 29,50\n"+
            "2---------Bolos-----------Bolo Floresta Negra-------------------------------------------R$ 2,00\n"+
            "3---------Bolos-----------Bolo Leite com Nutella---------------------------------------R$ 29,23\n"+
            "4---------Bolos-----------Bolo Mousse de Chocolate---------------------------------R$ 7,10\n"+
            "5---------Bolos-----------Bolo Nega Maluca---------------------------------------------R$ 19,33\n"+
            "6---------Doces----------Bomba de Creme----------------------------------------------R$ 17,71\n"+
            "7---------Doces----------Bomba de Morango-------------------------------------------R$ 4,82\n"+
            "8---------Sanduiches--File-Mignon com fritas e cheddar-------------------------R$ 21,16\n"+
            "9---------Sanduiches--Hamburguer com queijos, champignon e rucula----R$ 12,70\n"+
            "10-------Sanduiches--Provolone com salame---------------------------------------R$ 19,70\n"+
            "11-------Sanduiches--Vegetariano de berinjela-------------------------------------R$ 28,22\n"+
            "12-------Pizzas---------Calabresa---------------------------------------------------------R$ 8,98\n"+
            "13-------Pizzas---------Napolitana--------------------------------------------------------R$ 0,42\n"+
            "14-------Pizzas---------Peruana-----------------------------------------------------------R$ 18,36\n"+
            "15-------Pizzas---------Portuguesa-------------------------------------------------------R$ 27,50\n\n\n"
        ));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(
            "Voce escolheu o item "+ n1 +
            "\nEscolha mais um item: \n\n" +
            "item-----Tipo-------------Nome--------------------------------------------------------------Valor\n"+
            "1---------Bolos-----------Bolo Brigadeiro-------------------------------------------------R$ 29,50\n"+
            "2---------Bolos-----------Bolo Floresta Negra-------------------------------------------R$ 2,00\n"+
            "3---------Bolos-----------Bolo Leite com Nutella---------------------------------------R$ 29,23\n"+
            "4---------Bolos-----------Bolo Mousse de Chocolate---------------------------------R$ 7,10\n"+
            "5---------Bolos-----------Bolo Nega Maluca---------------------------------------------R$ 19,33\n"+
            "6---------Doces----------Bomba de Creme----------------------------------------------R$ 17,71\n"+
            "7---------Doces----------Bomba de Morango-------------------------------------------R$ 4,82\n"+
            "8---------Sanduiches--File-Mignon com fritas e cheddar-------------------------R$ 21,16\n"+
            "9---------Sanduiches--Hamburguer com queijos, champignon e rucula----R$ 12,70\n"+
            "10-------Sanduiches--Provolone com salame---------------------------------------R$ 19,70\n"+
            "11-------Sanduiches--Vegetariano de berinjela-------------------------------------R$ 28,22\n"+
            "12-------Pizzas---------Calabresa---------------------------------------------------------R$ 8,98\n"+
            "13-------Pizzas---------Napolitana--------------------------------------------------------R$ 0,42\n"+
            "14-------Pizzas---------Peruana-----------------------------------------------------------R$ 18,36\n"+
            "15-------Pizzas---------Portuguesa-------------------------------------------------------R$ 27,50\n\n\n"
        ));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(
            "Voce escolheu os itens "+ n1 + " e " + n2 +
            "\nEscolha mais um item: \n\n" +
            "item-----Tipo-------------Nome--------------------------------------------------------------Valor\n"+
            "1---------Bolos-----------Bolo Brigadeiro-------------------------------------------------R$ 29,50\n"+
            "2---------Bolos-----------Bolo Floresta Negra-------------------------------------------R$ 2,00\n"+
            "3---------Bolos-----------Bolo Leite com Nutella---------------------------------------R$ 29,23\n"+
            "4---------Bolos-----------Bolo Mousse de Chocolate---------------------------------R$ 7,10\n"+
            "5---------Bolos-----------Bolo Nega Maluca---------------------------------------------R$ 19,33\n"+
            "6---------Doces----------Bomba de Creme----------------------------------------------R$ 17,71\n"+
            "7---------Doces----------Bomba de Morango-------------------------------------------R$ 4,82\n"+
            "8---------Sanduiches--File-Mignon com fritas e cheddar-------------------------R$ 21,16\n"+
            "9---------Sanduiches--Hamburguer com queijos, champignon e rucula----R$ 12,70\n"+
            "10-------Sanduiches--Provolone com salame---------------------------------------R$ 19,70\n"+
            "11-------Sanduiches--Vegetariano de berinjela-------------------------------------R$ 28,22\n"+
            "12-------Pizzas---------Calabresa---------------------------------------------------------R$ 8,98\n"+
            "13-------Pizzas---------Napolitana--------------------------------------------------------R$ 0,42\n"+
            "14-------Pizzas---------Peruana-----------------------------------------------------------R$ 18,36\n"+
            "15-------Pizzas---------Portuguesa-------------------------------------------------------R$ 27,50\n\n\n"
        ));

        String pedido1 = "";
        String pedido2 = "";
        String pedido3 = "";
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;

        int erro = 0;

        if(n1 == 1){
            pedido1 = "Voce pediu Bolo Brigadeiro";
            valor1 = 29.50;
            }
            else if(n1 == 2){
            pedido1 = "Bolo Floresta Negra";
            valor1 = 2.00;
            }
            else if(n1 == 3){
            pedido1 = "Bolo Leite com Nutella";
            valor1 = 29.23;
            }
            else if(n1 == 4){
            pedido1 = "Bolo Mousse de Chocolate";
            valor1 = 7.10;
            }
            else if(n1 == 5){
            pedido1 = "Bolo Nega Maluca";
            valor1 = 19.33;
            }
            else if(n1 == 6){
            pedido1 = "Bomba de Creme";
            valor1 = 17.71;
            }
            else if(n1 == 7){
            pedido1 = "Bomba de Morango";
            valor1 = 4.82;
            }
            else if(n1 == 8){
            pedido1 = "File-Mignon com fritas e cheddar";
            valor1 = 21.16;
            }
            else if(n1 == 9){
            pedido1 = "Hamburguer com queijos, champignon e rucula";
            valor1 = 12.70;
            }
            else if(n1 == 10){
            pedido1 = "Provolone com salame";
            valor1 = 19.70;
            }
            else if(n1 == 11){
            pedido1 = "Vegetariano de berinjela";
            valor1 = 28.22;
            }
            else if(n1 == 12){
            pedido1 = "Calabresa";
            valor1 = 8.98;
            }
            else if(n1 == 13){
            pedido1 = "Napolitana";
            valor1 = 0.42;
            }
            else if(n1 == 14){
            pedido1 = "Peruana";
            valor1 = 18.36;
            }
            else if(n1 == 15){
            pedido1 = "Portuguesa";
            valor1 = 27.50;
            }
            else{
                erro = 1;
        }

        if(erro == 0 && n2 == 1){
            pedido2 = "Voce pediu Bolo Brigadeiro";
            valor2 = 29.50;
            }
            else if(erro == 0 && n2 == 2){
            pedido2 = "Bolo Floresta Negra";
            valor2 = 2.00;
            }
            else if(erro == 0 && n2 == 3){
            pedido2 = "Bolo Leite com Nutella";
            valor2 = 29.23;
            }
            else if(erro == 0 && n2 == 4){
            pedido2 = "Bolo Mousse de Chocolate";
            valor2 = 7.10;
            }
            else if(erro == 0 && n2 == 5){
            pedido2 = "Bolo Nega Maluca";
            valor2 = 19.33;
            }
            else if(erro == 0 && n2 == 6){
            pedido2 = "Bomba de Creme";
            valor2 = 17.71;
            }
            else if(erro == 0 && n2 == 7){
            pedido2 = "Bomba de Morango";
            valor2 = 4.82;
            }
            else if(erro == 0 && n2 == 8){
            pedido2 = "File-Mignon com fritas e cheddar";
            valor2 = 21.16;
            }
            else if(erro == 0 && n2 == 9){
            pedido2 = "Hamburguer com queijos, champignon e rucula";
            valor2 = 12.70;
            }
            else if(erro == 0 && n2 == 10){
            pedido2 = "Provolone com salame";
            valor2 = 19.70;
            }
            else if(erro == 0 && n2 == 11){
            pedido2 = "Vegetariano de berinjela";
            valor2 = 28.22;
            }
            else if(erro == 0 && n2 == 12){
            pedido2 = "Calabresa";
            valor2 = 8.98;
            }
            else if(erro == 0 && n2 == 13){
            pedido2 = "Napolitana";
            valor2 = 0.42;
            }
            else if(erro == 0 && n2 == 14){
            pedido2 = "Peruana";
            valor2 = 18.36;
            }
            else if(erro == 0 && n2 == 15){
            pedido2 = "Portuguesa";
            valor2 = 27.50;
            }
            else{
                erro = 1;
        
        }

        if (erro == 0 && n3 == 1){
            pedido3 = "Voce pediu Bolo Brigadeiro";
            valor3 = 29.50;
            }
            else if(erro == 0 && n3 == 2){
            pedido3 = "Bolo Floresta Negra";
            valor3 = 2.00;
            }
            else if(erro == 0 && n3 == 3){
            pedido3 = "Bolo Leite com Nutella";
            valor3 = 29.23;
            }
            else if(erro == 0 && n3 == 4){
            pedido3 = "Bolo Mousse de Chocolate";
            valor3 = 7.10;
            }
            else if(erro == 0 && n3 == 5){
            pedido3 = "Bolo Nega Maluca";
            valor3 = 19.33;
            }
            else if(erro == 0 && n3 == 6){
            pedido3 = "Bomba de Creme";
            valor3 = 17.71;
            }
            else if(erro == 0 && n3 == 7){
            pedido3 = "Bomba de Morango";
            valor3 = 4.82;
            }
            else if(erro == 0 && n3 == 8){
            pedido3 = "File-Mignon com fritas e cheddar";
            valor3 = 21.16;
            }
            else if(erro == 0 && n3 == 9){
            pedido3 = "Hamburguer com queijos, champignon e rucula";
            valor3 = 12.70;
            }
            else if(erro == 0 && n3 == 10){
            pedido3 = "Provolone com salame";
            valor3 = 19.70;
            }
            else if(erro == 0 && n3 == 11){
            pedido3 = "Vegetariano de berinjela";
            valor3 = 28.22;
            }
            else if(erro == 0 && n3 == 12){
            pedido3 = "Calabresa";
            valor3 = 8.98;
            }
            else if(erro == 0 && n3 == 13){
            pedido3 = "Napolitana";
            valor3 = 0.42;
            }
            else if(erro == 0 && n3 == 14){
            pedido3 = "Peruana";
            valor3 = 18.36;
            }
            else if(erro == 0 && n3 == 15){
            pedido3 = "Portuguesa";
            valor3 = 27.50;
            }
            else{
                erro = 1;
        }

        if(erro == 1){
            JOptionPane.showMessageDialog(null, "Erro, numero invalido!");
        }

        JOptionPane.showMessageDialog(null, 
            "Conta" +

            "\n\nVoce pediu: \n1 - " + 
                    pedido1 +
            "\n2 - " + pedido2 +
            "\n3 - " + pedido3 +
        
            "\n\nValores: \n          R$" + 
                  valor1 +
            "\n +       R$" + valor2 +
            "\n +       R$" + valor3 +
            "\n_____________" +
            "\nTotal: R$" + (valor1+valor2+valor3) + "\n\n"
        );
    }
}