/*Enunciado

11.Solicite cinco notas do usuário, faça a média e apresente ao final o status.
Nota                Status
De 0 até 5.99       Reprovado
De 6.00 até 7.99    Recuperação
Acima de 7.99       Aprovado

*/

import javax.swing.JOptionPane;

public class Exercicio11{

    public static void main(String[] args){

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));
            if (nota1 < 0 || nota1 > 10){JOptionPane.showMessageDialog(null, "Erro! numero invalido!", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));
            if (nota2 < 0 || nota2 > 10){JOptionPane.showMessageDialog(null, "Erro! numero invalido!", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota:"));
            if (nota3 < 0 || nota3 > 10){JOptionPane.showMessageDialog(null, "Erro! numero invalido!", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota:"));
            if (nota4 < 0 || nota4 > 10){JOptionPane.showMessageDialog(null, "Erro! numero invalido!", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua quinta nota:"));
            if (nota5 < 0 || nota5 > 10){JOptionPane.showMessageDialog(null, "Erro! numero invalido!", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);
        }

        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        String status = "";

        if (media >= 0 && media < 6){
            status = "Reprovado";
        } //reprovado

        else if (media > 6 && media < 8){
            status = "Recuperacao";
        } // recuperacao

        else if (media > 7 && media <= 10){
            status = "Aprovado";
        } // aprovado

        else{ 
            JOptionPane.showMessageDialog(null, "Erro! numero ou caracter invalido");
        }

        JOptionPane.showMessageDialog(null, 
        "\nSuas notas sao: \n   1a: " + nota1 + 
        "\n   2a: " + nota2 + 
        "\n   3a: " + nota3 + 
        "\n   4a: " + nota4 + 
        "\n   5a: " + nota5 +
        "\n\nSua media eh: " + media +
        "\nSeu status atual: " + status
        );
	}

}