/*Enunciado

12.Ler dois números e apresentar qual o maior.

*/

import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero:" , "Maior?", JOptionPane.PLAIN_MESSAGE));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero:" , "Maior?", JOptionPane.PLAIN_MESSAGE));

        String resultado = ""; 

        if (numero1 > numero2){
            resultado = ("O numero " + numero1 + " eh maior que " + numero2);
        }
        else if (numero1 < numero2){
            resultado = ("O numero " + numero2 + " eh maior que " + numero1);
        }
        else {
            resultado = ("Os numeros " + numero1 + " e " + numero2 + " sao iguais");
        }

        JOptionPane.showMessageDialog(null, resultado);
	}

}