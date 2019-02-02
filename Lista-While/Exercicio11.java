/*
Enunciado:

11. Solicite o nome, valor e a quantidade de produtos, enquanto o nome for diferente de
sair, ao final deve-se aplicar ao valor total da compra um desconto de 5%.

*/


import javax.swing.JOptionPane;

public class Exercicio11{

    public static void main(String[] args){

        String nome = "";
        double valor = 0;
        int quantidade = 0;
        double total = 0;
        double desconto = 0;

        while(!nome.equalsIgnoreCase("sair")){
            nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:\nOu digite \"sair\" para fechar a conta.", "Nome do Produto", JOptionPane.QUESTION_MESSAGE);
            while(nome.equals("")){
                JOptionPane.showMessageDialog(null, "Erro de entrada.", "Error 001", JOptionPane.ERROR_MESSAGE);
                nome = JOptionPane.showInputDialog(null, "Digite novamente o nome do produto:\nOu digite \"sair\" para fechar a conta.", "Nome do Produto", JOptionPane.QUESTION_MESSAGE);
            }
            if(!nome.equalsIgnoreCase("sair")){
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de " + nome + ".", "Valor de " + nome , JOptionPane.QUESTION_MESSAGE));
                while(valor <= 0){
                    JOptionPane.showMessageDialog(null, "Erro de entrada.", "Error 002", JOptionPane.ERROR_MESSAGE);
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite novamente o valor de " + nome + ".", "Valor de " + nome , JOptionPane.QUESTION_MESSAGE));
                }
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de " + nome + ".", "Quantidade de " + nome, JOptionPane.QUESTION_MESSAGE));
                while(quantidade <= 0){
                    JOptionPane.showMessageDialog(null, "Erro de entrada.", "Error 002", JOptionPane.ERROR_MESSAGE);
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade de " + nome + ".", "Quantidade de " + nome , JOptionPane.QUESTION_MESSAGE));
                }
                total = total + (valor*quantidade);
            }
        }
        desconto = total*0.05;
        JOptionPane.showMessageDialog(null, 
        "Você comprou: R$" + String.format("%.2f", total) +
        "\nVocê ganhou 5% de desconto, valendo: R$" + String.format("%.2f", desconto) +
        "\nTotal a pagar: R$" + String.format("%.2f", (total - desconto)), 
        "Compra Final", 
        JOptionPane.INFORMATION_MESSAGE);

    }
}