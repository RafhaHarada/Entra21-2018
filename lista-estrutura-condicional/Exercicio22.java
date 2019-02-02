/*Enunciado

22. Solicite os dados abaixo ao usuário:
    Quantidade de produtos;
    Valor do produto;
    Dinheiro entregue para o pagamento.

    Faça o cálculo para descobrir o valor da compra e apresente:
        Valor da Compra
        Se o dinheiro entregue supre o valor da compra ou se o valor for suficiente
        apresentar o valor do troco.
*/

import javax.swing.JOptionPane;

public class Exercicio22{

    public static void main(String[] args){
    
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos:", "Quantidade", JOptionPane.QUESTION_MESSAGE));
            if(quantidade <= 0){JOptionPane.showMessageDialog(null,"Quantidade Inválida! Cancelando compra...", "Erro 401", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto:", "Valor do Produto", JOptionPane.QUESTION_MESSAGE));
            if(valor <= 0){JOptionPane.showMessageDialog(null,"Valor inválido! Cancelando compra...", "Erro 402", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double pagamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor pago:", "Valor pago", JOptionPane.QUESTION_MESSAGE));
            if(pagamento <= 0){JOptionPane.showMessageDialog(null,"Pagamento não efetuado! Cancelando compra...", "Erro 403", JOptionPane.ERROR_MESSAGE);System.exit(0);}
            
        double total = quantidade*valor;
        double troco = pagamento - total;
        double divida = total - pagamento;
        String resposta = "";

        if(troco < 0){
            resposta = "\nValor dos produtos = R$" + String.format("%.2f",valor) + 
                "\nQuantidade de produtos = " + quantidade + 
                "\nValor da compra = R$" + String.format("%.2f",total) + 
                "\nPagamento = R$" + String.format("%.2f",pagamento) + 
                "\nValor restante para conclusão da compra = R$" + String.format("%.2f", divida) + 
                "\n\nValor não supre o valor da compra!\nCompra não efetuada!\nCancelando compra...";
                JOptionPane.showMessageDialog(null,resposta,"Status de Compra",JOptionPane.WARNING_MESSAGE);
        }
        else if(troco >= 0){
            resposta = ("Compra efetuada.\n\nValor dos produtos = R$" + String.format("%.2f",valor) + 
                "\nQuantidade de produtos = " + quantidade + 
                "\nValor da compra = R$" + String.format("%.2f",total) + 
                "\nPagamento = R$" + String.format("%.2f",pagamento) + 
                "\nTroco = R$" + String.format("%.2f",troco));
                JOptionPane.showMessageDialog(null,resposta,"Status de Compra",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Erro de entrada","Erro 404",JOptionPane.ERROR_MESSAGE);
        }
    }

}