/*Enunciado

19.Solicite o saldo, valor dos depósitos, parcela do empréstimo, valor dos saques.
Apresente ao final o status da conta de acordo com o saldo atual.
Saldo Atual     Status
Zero            Saldo Neutro
Maior que zero  Saldo Positivo
Menor que zero  Saldo Negativo

*/

import java.awt.JobAttributes;
import java.text.Format;

import javax.swing.JOptionPane;

public class Exercicio19{

    public static void main(String[] args){

        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite seu saldo:", "Status de Conta Bancaria", JOptionPane.INFORMATION_MESSAGE
        ));
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor dos depositos efetuados:", "Status de Conta Bancaria", JOptionPane.INFORMATION_MESSAGE
        ));
        double parcela = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor da parcela de empréstimo:", "Status de Conta Bancaria", JOptionPane.INFORMATION_MESSAGE
        ));
        double saques = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite o valor dos saques efetuados:", "Status de Conta Bancaria", JOptionPane.INFORMATION_MESSAGE
        ));
        double saldoAtual = (saldo - saques + deposito - parcela);
        
        String status = "";

        if(saldoAtual > 0){
            status = "SALDO POSITIVO";
        }
        else if(saldoAtual < 0){
            status = "SALDO NEGATIVO";
        }
        else if(saldoAtual == 0){
            status = "SALDO NEUTRO";
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO DE ENTRADA", "ERROR 404",JOptionPane.WARNING_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, 
            "SEU SALDO ANTERIOR: R$" + String.format("%.2f", saldo) +
            "\nDEPÓSITO - TRABALHO: +R$" + String.format("%.2f", deposito) +
            "\nPARCELA DO EMPRESTIMO: -R$" + String.format("%.2f", parcela) +
            "\nSAQUE EFETUADO: -R$" + String.format("%.2f", saques) +
            "\n______________________\nSALDO ATUAL: R$" + String.format("%.2f", saldoAtual) +
            "\n\nSTATUS BANCÁRIO: " + status,
            "EXTRATO BANCARIO",
            JOptionPane.INFORMATION_MESSAGE
        );
	}

}