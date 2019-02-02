/*Enunciado

2.Solicite para o usuário um número e informe se este número é negativo ou não.
Obs.: Lembrando que zero não é considerado um número negativo.
*/

import javax.swing.JOptionPane;

public class Exercicio2{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Negativo ou nao?\nDigite um numero:"));
        
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, 
            "O numero " + numero + " eh negativo."
            );
        }
        
        else{
            JOptionPane.showMessageDialog(null, 
            "O numero " + numero + " nao eh negativo."
            );
        }

	}

}