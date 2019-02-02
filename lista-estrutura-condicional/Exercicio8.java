/*Enunciado

8. A padaria do joão necessita armazenar os pedidos dos seus clientes, cada cliente
pedirá três produtos do cardápio, porém para que o cliente possa solicitar estes
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
9   Sanduíches  Filé-Mignon com fritas e cheddar                R$ 21,16
10  Sanduíches  Hambúrguer com queijos, champignon e rúcula     R$ 12,70
11  Sanduíches  Provolone com salame                            R$ 19,70
12  Sanduíches  Vegetariano de berinjela                        R$ 28,22
13  Pizzas      Calabresa                                       R$ 8,98
14  Pizzas      Napolitana                                      R$ 0,42
15  Pizzas      Peruana                                         R$ 18,36
16  Pizzas      Portuguesa                                      R$ 27,50

*/

import javax.swing.JOptionPane;

public class Exercicio8{

    public static void main(String[] args){
        
        String c[][] = new String[16][4];
            int l,co = 0;
            c[0][0] = "n"; c[0][1] = "Tipo"; c[0][2] = "Nome"; c[0][3] = "Valor (R$)";
            c[1][0] = "1"; c[1][1] = "Bolos"; c[1][2] = "Bolo Brigadeiro"; c[1][3] = "29.50";
            c[2][0] = "2"; c[2][1] = "Bolos"; c[2][2] = "Bolo Floresta Negra"; c[2][3] = "2.00";
            c[3][0] = "3"; c[3][1] = "Bolos"; c[3][2] = "Bolo Leite com Nutella"; c[3][3] = "29.23";
            c[4][0] = "4"; c[4][1] = "Bolos"; c[4][2] = "Bolo Mousse de Chocolate"; c[4][3] = "7.10";
            c[5][0] = "5"; c[5][1] = "Bolos"; c[5][2] = "Bolo Nega Maluca"; c[5][3] = "19.33";
            c[6][0] = "6"; c[6][1] = "Doces"; c[6][2] = "Bomba de Creme"; c[6][3] = "17.71";
            c[7][0] = "7"; c[7][1] = "Doces"; c[7][2] = "Bomba de Morango"; c[7][3] = "4.82";
            c[8][0] = "8"; c[8][1] = "Sanduiches"; c[8][2] = "Filé-Mignon com fritas e cheddar"; c[8][3] = "21.16";
            c[9][0] = "9"; c[9][1] = "Sanduiches"; c[9][2] = "Hambúrguer com queijos. champignon e rúcula"; c[9][3] = "12.70";
            c[10][0] = "10"; c[10][1] = "Sanduiches"; c[10][2] = "Provolone com salame"; c[10][3] = "19.70";
            c[11][0] = "11"; c[11][1] = "Sanduiches"; c[11][2] = "Vegetariano de berinjela"; c[11][3] = "28.22";
            c[12][0] = "12"; c[12][1] = "Pizzas"; c[12][2] = "Calabresa"; c[12][3] = "8.98";
            c[13][0] = "13"; c[13][1] = "Pizzas"; c[13][2] = "Napolitana"; c[13][3] = "0.42";
            c[14][0] = "14"; c[14][1] = "Pizzas"; c[14][2] = "Peruana"; c[14][3] = "18.36";
            c[15][0] = "15"; c[15][1] = "Pizzas"; c[15][2] = "Portuguesa"; c[15][3] = "27.50";        

            for (int l = 0; l < c.length; l++) {
                for (int co = 0; co < c[l].length; co++) {
                    System.out.print(c[l][co] + " ");
                }
                System.out.println();
            }
        int pedido1 = Integer.parseInt(JOptionPane.showInputDialog( "\n\nFaca o primeiro pedido: "));
        int pedido2 = Integer.parseInt(JOptionPane.showInputDialog( "\n\nFaca o segundo pedido: "));
        int pedido3 = Integer.parseInt(JOptionPane.showInputDialog( "\n\nFaca o terceiro pedido: "));
            
        JOptionPane.showMessageDialog(null, pedido1 + "\n" + pedido2 + "\n" + pedido3);

	}

}