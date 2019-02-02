/*Enunciado

24.Solicitar o valor total da compra e o valor do desconto, o objetivo desta questão é
descobrir o percentual de desconto obtido em uma determinada compra, para
descobrir o percentual deve-se utilizar a regra de três ensinada em sala de aula, ao
final deve-se apresentar os seguintes itens:
Valor total da compra: R$ 192,98
Valor do desconto recebido: R$  25,49
Percentual de desconto recebido: 13,21%

*/

import javax.swing.JOptionPane;

public class Exercicio24{

    public static void main(String[] args){
    
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor total da compra:", 
            "Percentual de Desconto", 
            JOptionPane.QUESTION_MESSAGE
            ));
            if(valor < 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor do desconto:", 
            "Percentual de Desconto", 
            JOptionPane.QUESTION_MESSAGE
            ));
            if(desconto < 0){
                JOptionPane.showMessageDialog(null, "Erro de entrada", "Error 401", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        double porcentagem = (desconto*100)/valor;
        JOptionPane.showMessageDialog(null, 
        "Valor total da compra: R$"  + String.format("%.2f", valor) +
        "\nValor do desconto recebido: R$ " + String.format("%.2f", desconto) +
        "\nPercentual de desconto recebido: " +  String.format("%.2f", porcentagem) + "%"
        );      
    }

}