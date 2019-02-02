/*
Enunciado:

12. Solicite o nome, valor, quantidade enquanto a quantidade de produtos for menor que
5. Ao final deve-se aplicar um desconto de R$ 150,00.

*/


import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main(String[] args){

        String nome = "";
        double valor = 0;
        int quantidade = 0;
        double total = 0;
        int quantidadeFinal = 0;
        double desconto = 150;

        while(quantidadeFinal < 5){

            nome = JOptionPane.showInputDialog(null,"Insira o nome do produto","Nome do produto",JOptionPane.QUESTION_MESSAGE).trim();
            //anti bugs
                while(nome.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null,"Erro de Entrada.\nDigite o nome do produto novamente","Error 001", JOptionPane.ERROR_MESSAGE);
                    nome = JOptionPane.showInputDialog(null,"Insira novamente o nome do produto","Nome do produto",JOptionPane.QUESTION_MESSAGE).trim();
                }
            valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do " + nome,"Valor de " + nome, JOptionPane.QUESTION_MESSAGE));
            //anti bugs
                while(valor <= 0){
                    JOptionPane.showMessageDialog(null,"Erro de Entrada.\nDigite o valor do produto novamente","Error 002", JOptionPane.ERROR_MESSAGE);
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira novamente o valor do " + nome,"Valor de " + nome, JOptionPane.QUESTION_MESSAGE));
                }
            quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de " + nome, "Quantidade de " + nome,JOptionPane.QUESTION_MESSAGE));
            //anti bugs
                while(quantidade <= 0){
                    JOptionPane.showMessageDialog(null,"Erro de Entrada.\nDigite o quantidade do produto novamente","Error 003", JOptionPane.ERROR_MESSAGE);
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira novamente a quantidade de " + nome, "Quantidade de " + nome,JOptionPane.QUESTION_MESSAGE));
                }
            total = total + (valor*quantidade);
            quantidadeFinal = quantidadeFinal + quantidade;
        }

        if(total < desconto){
            desconto = total;
        }

        JOptionPane.showMessageDialog(null,
            "Você comprou: R$" + String.format("%.2f", total) +
            "\nVocê ganhou um desconto de: R$" + String.format("%.2f", desconto) +
            "\nAssim você terá que pagar: R$" + String.format("%.2f", (total - desconto)),
            "Total á Pagar",
            JOptionPane.INFORMATION_MESSAGE
        );

    }
}