/*Enunciado

4.Solicite para o usuário um número e informe se este número é par ou não.
Obs.: Lembrando que zero não é considerado um número par

*/

import javax.swing.JOptionPane;

public class Exercicio4{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Par ou nao?\nDigite um numero inteiro:"));
        
        if (numero == 0){
            JOptionPane.showMessageDialog(null, 
                "O numero " + numero + " nao eh par."
                );
        }

        else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, 
                "O numero " + numero + " eh par."
                );
        }

        else {
            JOptionPane.showMessageDialog(null, 
            "O numero " + numero + " nao eh par."
            );
        }

	}

}