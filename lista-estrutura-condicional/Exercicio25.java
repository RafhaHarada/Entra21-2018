/*Enunciado

25.Solicitar ao usuário o valor total e o percentual de desconto, o objetivo desta questão
é descobrir o valor do desconto obtido em uma determinada compra, em que se tem
o valor total e o percentual de desconto. Ao final deve-se apresentar os seguintes
itens:
Valor total: R$ 15,00
Percentual de desconto: 30%
Valor do desconto: R$ 4,50

*/

import javax.swing.JOptionPane;

public class Exercicio25{

    public static void main(String[] args){
    
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor total da compra:", 
            "Valor de Desconto", 
            JOptionPane.QUESTION_MESSAGE
            ));
            if(valor < 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o percentual de desconto:", 
            "Valor de Desconto", 
            JOptionPane.QUESTION_MESSAGE
            ));
            if(porcentagem < 0 || porcentagem > 100){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double desconto = (valor*porcentagem)/100;
        JOptionPane.showMessageDialog(null, 
        "Valor total: R$"  + String.format("%.2f", valor) +
        "\nPercentual de desconto: " +  String.format("%.2f", porcentagem) + "%" +
        "\nValor do desconto: R$ " + String.format("%.2f", desconto)
        );      
    }

}