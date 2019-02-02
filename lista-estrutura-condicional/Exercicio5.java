/*Enunciado

5.Solicite para o usuário um número e informe se este número é impar ou não.
Obs.: Lembrando que zero não é considerado um número impar


*/

import javax.swing.JOptionPane;

public class Exercicio5{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Impar ou nao?\nDigite um numero inteiro:"));
        
        if (numero == 0){
            JOptionPane.showMessageDialog(null, 
                "O numero " + numero + " nao eh impar."
                );
        }

        else if (numero % 2 > 0) {
            JOptionPane.showMessageDialog(null, 
                "O numero " + numero + " eh impar."
                );
        }

        else {
            JOptionPane.showMessageDialog(null, 
            "O numero " + numero + " nao eh impar."
            );
        }

	}

}