/*
Enunciado:
5. Solicite para o usuário 5 pesos e apresente a soma total dos pesos e a média
dos pesos.
*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    
    public static void main(String[] args) {

        int i = 0;
        String escrita = "";
        double soma = 0, media = 0;
        double[] vetor = new double[5];

        while (i != 5) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " + (i+1) + "º peso", "Peso nº" + (i+1), JOptionPane.QUESTION_MESSAGE));
            escrita = escrita + "\n" + (i+1) + "º Peso: " + String.format("%.2f kg", vetor[i]);
            soma = soma + vetor[i];
            i++;
        }

        media = soma/vetor.length;

        JOptionPane.showMessageDialog(null, 
        "Os pesos que você inseriu são: \n" + escrita +
        "\n\nA soma dos pesos é: " + String.format("%.2f kg", soma) +
        "\n\nA média dos pesos é: " + String.format("%.2f kg", media),
        "Peso", 
        JOptionPane.INFORMATION_MESSAGE);

    }
    
}