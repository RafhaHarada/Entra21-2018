/*Enunciado

6.Solicite um número e apresente se ele é diferente de 1.

*/

import javax.swing.JOptionPane;

public class Exercicio6{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("1 ou nao?\nDigite um numero inteiro:"));
        
        if (numero == 1){
            JOptionPane.showMessageDialog(null, 
                "Voce digitou 1."
            );
        }

        else {
            JOptionPane.showMessageDialog(null, 
                "Esse numero nao eh igual a 1."
            );
        }


	}

}