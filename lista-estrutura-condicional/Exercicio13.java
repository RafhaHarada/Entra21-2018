/*Enunciado

13.Ler dois números e apresentar qual o menor;

*/

import javax.swing.JOptionPane;

public class Exercicio13{

    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero:" , "Menor?", JOptionPane.PLAIN_MESSAGE));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero:" , "Menor?", JOptionPane.PLAIN_MESSAGE));

        String resultado = ""; 

        if (numero1 < numero2){
            resultado = ("O numero " + numero1 + " eh menor que " + numero2);
        }
        else if (numero1 > numero2){
            resultado = ("O numero " + numero2 + " eh menor que " + numero1);
        }
        else {
            resultado = ("Os numeros " + numero1 + " e " + numero2 + " sao iguais");
        }

        JOptionPane.showMessageDialog(null, resultado);
	}

}