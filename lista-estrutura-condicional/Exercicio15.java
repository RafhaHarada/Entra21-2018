/*Enunciado

15. Ler três números e apresentar os valores em ordem decrescente.

*/

import javax.swing.JOptionPane;

public class Exercicio15{

    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero:" , "Ordem DESCRENTE.", JOptionPane.PLAIN_MESSAGE));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero:" , "Ordem DESCRENTE.", JOptionPane.PLAIN_MESSAGE));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero:" , "Ordem DESCRENTE.", JOptionPane.PLAIN_MESSAGE));

        String resultado = ""; 

        if (numero1 < numero2 &&  numero2 < numero3){
            resultado = ("A ordem descrente eh: " + numero3 + ", " + numero2 + " e " + numero1);
        }
        else if (numero1 < numero3 &&  numero3 < numero2){
            resultado = ("A ordem descrente eh: " + numero2 + ", " + numero3 + " e " + numero1);
        }
        else if (numero2 < numero1 &&  numero1 < numero3){
            resultado = ("A ordem descrente eh: " + numero3 + ", " + numero1 + " e " + numero2);
        }
        else if (numero2 < numero3 &&  numero3 < numero1){
            resultado = ("A ordem descrente eh: " + numero1 + ", " + numero3 + " e " + numero2);
        }
        else if (numero3 < numero1 &&  numero1 < numero2){
            resultado = ("A ordem descrente eh: " + numero2 + ", " + numero1 + " e " + numero3);
        }
        else if (numero3 < numero2 &&  numero2 < numero1){
            resultado = ("A ordem descrente eh: " + numero1 + ", " + numero2 + " e " + numero3);
        }
        else {
            resultado = ("Os numeros " + numero1 + ", " + numero2 +  " e " + numero3 + " sao iguais");
        }

        JOptionPane.showMessageDialog(null, resultado + "\nComo podemos ver eh uma ordem sem futuro, sem feh\nVamos ativar usar o Proerd neles");
	}

}