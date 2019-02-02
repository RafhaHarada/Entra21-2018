/*Enunciado

26.Solicitar ao usuário o valor e o percentual do desconto, o objetivo desta questão é
descobrir o valor total da compra, em que tem-se o valor do desconto e o percentual
do desconto. Ao final deve-se apresentar os seguintes itens:
Valor do desconto: R$ 4,50
Percentual do desconto: 35%
Valor total da compra: R$ 12,85

*/

import javax.swing.JOptionPane;

public class Exercicio26{

    public static void main(String[] args){
    
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor do desconto:", 
            "Valor Total", 
            JOptionPane.QUESTION_MESSAGE
            ));
            if(desconto < 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o percentual do desconto:", 
            "Valor Total", 
            JOptionPane.QUESTION_MESSAGE
            ));if(porcentagem < 0 || porcentagem > 100){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double valor = (desconto*100)/porcentagem;
        

        JOptionPane.showMessageDialog(null, 
        "Valor do desconto: R$ " + String.format("%.2f", desconto) +
        "\nPercentual de desconto: " +  String.format("%.2f", porcentagem) + "%" +
        "\nValor total da compra: R$"  + String.format("%.2f", valor)
        );
    }

}