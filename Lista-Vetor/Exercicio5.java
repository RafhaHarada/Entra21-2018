/*
Enunciado:
5. Solicite para o usuário 5 pesos e apresente a soma total dos pesos e a média
dos pesos.
*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        double[] vetor = new double[5];
        vetor[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 1º peso", "Peso nº1", JOptionPane.QUESTION_MESSAGE));
        vetor[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 2º peso", "Peso nº2", JOptionPane.QUESTION_MESSAGE));
        vetor[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 3º peso", "Peso nº3", JOptionPane.QUESTION_MESSAGE));
        vetor[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 4º peso", "Peso nº4", JOptionPane.QUESTION_MESSAGE));
        vetor[4] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 5º peso", "Peso nº5", JOptionPane.QUESTION_MESSAGE));
        
        String escrita = "\n1º Peso: " + String.format("%.2f kg", vetor[0]) + "\n2º Peso: " + String.format("%.2f kg", vetor[1]) + "\n3º Peso: " + String.format("%.2f kg", vetor[2]) + "\n4º Peso: " + String.format("%.2f kg", vetor[3]) + "\n5º Peso: " + String.format("%.2f kg", vetor[4]);
        double soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
        double media = soma/vetor.length;

        JOptionPane.showMessageDialog(null, 
        "Os pesos que você inseriu são: \n" + escrita +
        "\n\nA soma dos pesos é: " + String.format("%.2f kg", soma) +
        "\n\nA média dos pesos é: " + String.format("%.2f kg", media),
        "Peso", 
        JOptionPane.INFORMATION_MESSAGE);

    }
    
}