/*
Enunciado:

2. Solicite a idade para o usuário até que ele digite uma idade maior que 128.

*/


import javax.swing.JOptionPane;

public class Exercicio2{

    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:", "Verificador de Existência", JOptionPane.QUESTION_MESSAGE));
        while(idade <= 128){
            if (idade <= 0){
                JOptionPane.showMessageDialog(null, "Idade inválida", "Error 001", JOptionPane.ERROR_MESSAGE);
            }
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outra idade:", "Verificador de Existência", JOptionPane.QUESTION_MESSAGE));
        }
        if(idade > 8000){
            JOptionPane.showMessageDialog(null, "O QUE? A SUA IDADE ...É MAIS DE 8000!", "Error 002", JOptionPane.ERROR_MESSAGE);
        }

    }
}