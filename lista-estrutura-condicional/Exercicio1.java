/*Enunciado

1.Solicite para o usuário um número e informe se este número é positivo ou não.
Obs.: Lembrando que zero não é considerado um número positivo.

*/

import javax.swing.JOptionPane;

public class Exercicio1{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Positivo ou não?\nDigite um numero:"));
        
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, 
                "O numero " + numero + " eh positivo."
                );
        }

        else {
            JOptionPane.showMessageDialog(null, 
            "O numero " + numero + " nao eh positivo."
            );
        }

	}

}