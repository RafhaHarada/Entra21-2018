/*Enunciado

9.Solicite quatros números e verifique se pode ser um quadrado.

*/

import javax.swing.JOptionPane;

public class Exercicio9{

    public static void main(String[] args){

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite um lado:", "Verificador - Quadrado?",JOptionPane.PLAIN_MESSAGE
            ));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + 
            ".\nDigite outro lado:", "Verificador - Quadrado?",JOptionPane.PLAIN_MESSAGE
            ));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + " e " + n2 + 
            ".\nDigite outro lado:", "Verificador - Quadrado?",JOptionPane.PLAIN_MESSAGE
            ));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + ", " + n2 + " e " + n3 + 
            ".\nDigite outro lado:", "Verificador - Quadrado?",JOptionPane.PLAIN_MESSAGE
            ));

        if(n1 == n2 && n2 == n3 && n3 == n4){
            JOptionPane.showMessageDialog(null, "Os lados " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " formam um quadrado.");
        }

        else{
            JOptionPane.showMessageDialog(null, "Os lados " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " nao formam um quadrado.");
        }
	}

}